package job.service.impl;

import job.dao.JobDao;
import job.pojo.Book;
import job.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class serviceImpl implements service {
    @Autowired
    private JobDao jobDao;
    @Override
    public void update(List<Book> bookList) {
        jobDao.deleteAll();
        jobDao.saveAll(bookList);
    }

    @Override
    public List<Book> get() {
        List<Book> bookList = jobDao.findAll();
        return bookList;
    }
}
