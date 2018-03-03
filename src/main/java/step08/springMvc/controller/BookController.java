package step08.springMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import step08.springMvc.model.Book;

@Controller
@RequestMapping("/")
public class BookController {

    private final Book book;

    @Autowired
    public BookController( final Book book ) {
        this.book = book;
    }


    @RequestMapping(value="book")
    @ResponseBody
    public Book getBook(){
        return book;
    }
}
