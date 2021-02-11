package job.service;

import job.pojo.Book;

import java.util.List;

public interface service {

    void update(List<Book> bookList);

    List<Book> get();
}
