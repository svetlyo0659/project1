package bg.codeacademy.spring.project1.service;

import bg.codeacademy.spring.project1.model.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService
{

  void addBook(Book book);

  Book getBook(String isbnCode);

  void deleteBook(String isbnCode);

  Book updateBook(String isbnCode, Book book);

  List<Book> getAllBooks();


}
