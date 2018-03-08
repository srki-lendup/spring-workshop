package Part03.springMvc.step02.interceptors.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Part03.springMvc.step02.interceptors.model.Book;

@RestController
public class BookController {

    private static Logger LOG = LoggerFactory.getLogger( BookController.class );
    private final Book book;

    @Autowired
    public BookController( final Book book ) {
        this.book = book;
    }

    @RequestMapping(value = "/book")
    public Book getBook() {
        LOG.info("[controller]" +
                "[Thread:]"+Thread.currentThread().getName()+
                "[Actual Request Handling]");
        return book;
    }
}
