package bg.codeacademy.spring.project1.service;

import bg.codeacademy.spring.project1.model.Book;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BookService
{

  void addBook(Book book);

  Book getBook(String isbnCode);

  void deleteBook(String isbnCode);

  Book updateBook(String isbnCode, Book book);

  List<Book> getAllBooks();


}
