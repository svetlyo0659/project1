package bg.codeacademy.spring.project1.controller;

import bg.codeacademy.spring.project1.model.Book;
import bg.codeacademy.spring.project1.service.BookService;
import bg.codeacademy.spring.project1.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/books")
public class BookController
{
  @Autowired
  private BookServiceImpl bookService;

  @PostMapping(value = "books/addbook")
  public void addBook(Book book)
  {
    bookService.addBook(book);
  }

  @PostMapping(value = "books/removebook")
  public void removeBook(Integer id)
  {
    bookService.deleteBook(id);
  }

  @PostMapping(value = "books/update")
  public void updateBook(Integer id, Book book)
  {
    bookService.updateBook(id, book);
  }

  @GetMapping(value ="books/{author}")
  public List<Book> getBooksByAuthor(@PathVariable("author") String author)
  {
    return bookService.getBookByAuthor(author);
  }


}
