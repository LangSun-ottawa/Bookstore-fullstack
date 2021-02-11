package job.dao;

import job.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<Book,Long> {

}
