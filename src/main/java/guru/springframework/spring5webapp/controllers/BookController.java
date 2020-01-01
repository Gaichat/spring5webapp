package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
       this.bookRepository = bookRepository;
    }

    @RequestMapping("/book")//name in http request
    public String getBooks(Model model){
        model.addAttribute("books",bookRepository.findAll());//books: attribute in jps template
        return "book";//name of html page : view name
    }
}
