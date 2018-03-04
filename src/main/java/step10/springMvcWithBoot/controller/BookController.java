package step10.springMvcWithBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import step10.springMvcWithBoot.model.Book;

@RestController
public class BookController {

    private final Book book;

    @Autowired
    public BookController( final Book book ) {
        this.book = book;
    }

    @RequestMapping(value = "/book")
    public Book getBook() {
        return book;
    }
}
