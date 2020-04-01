package bg.codeacademy.spring.project1.controller;

import bg.codeacademy.spring.project1.model.Book;
import bg.codeacademy.spring.project1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RequestMapping("/books")
@RestController
public class BookController
{
  private BookService bookService;

  @Autowired
  public BookController(BookService bookService)
  {
    this.bookService = bookService;
  }


  @PostMapping
  public void addBook(Book book)
  {
    bookService.addBook(book);
  }

  @PostMapping
  public void removeBook(String isbnCode)
  {
    bookService.deleteBook(isbnCode);
  }

  @PostMapping
  public void updateBook(String isbnCode, Book book)
  {
    bookService.updateBook(isbnCode, book);
  }


}
