package job.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import job.pojo.Book;
import job.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bookstore")
public class controller {
    @Autowired
    private service service;

    @PostMapping
    @CrossOrigin
    public String update(@RequestBody List<Book> bookList){
        service.update(bookList);
        return "update done";
    }

    @CrossOrigin
    @GetMapping
    public String get() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Book> bookList = service.get();
        String list = null;
        try {
            list = objectMapper.writeValueAsString(bookList);
            return list;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "[]";
        }
    }
}
