package bg.codeacademy.spring.project1.service;

import bg.codeacademy.spring.project1.model.Book;
import bg.codeacademy.spring.project1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookServiceImpl implements BookService
{
  @Autowired
  private BookRepository bookRepository;

  @Override

  public void addBook(Book book)  //adding a object Book to the repo
  {
    bookRepository.save(book);
  }

  @Override

  public Book getBook(String isbnCode) //getting a book by its isbn.
  {
    return bookRepository.findByIsbn(isbnCode);
  }

  @Override
  public void deleteBook(String isbnCode) //getting a book by its isbn.
  {
    bookRepository.deleteByIsbn(isbnCode);
  }

  @Override
  public Book updateBook(String isbnCode, Book book) //updating a isbn with a new book;
  {
    return bookRepository.save(book);
  }

  @Override
  public List<Book> getAllBooks()  /// returns a new list with all the books
  {
    List<Book> allBooks = new ArrayList<>();
    bookRepository.findAll().forEach(allBooks::add); // lambda/arrow function
    return allBooks;
  }


}
