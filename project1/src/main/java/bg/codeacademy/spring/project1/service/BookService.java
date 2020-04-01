package bg.codeacademy.spring.project1.service;

import bg.codeacademy.spring.project1.model.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService
{

  void addBook(Book book);

  Book getBook(Integer id);

  void deleteBook(Integer id);

  Book updateBook(Integer id, Book book);

  List<Book> getBookByAuthor(String author);

  List<Book> getAllBooks();


}
