package bg.codeacademy.spring.project1.service;

import bg.codeacademy.spring.project1.model.Book;
import bg.codeacademy.spring.project1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
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
  public Book getBook(Integer id)
  {
    return null;
  }

  @Override
  public void deleteBook(Integer id)
  {
    bookRepository.deleteById(id);
  }

  @Override
  public Book updateBook(Integer isbnCode, Book book)
  {
    return null;
  }

  @Override
  public List<Book> getBookByAuthor(String author)
  {
    return bookRepository.findByAuthorContaining(author);
  }

  @Override
  public List<Book> getAllBooks()
  {
    List<Book> books=new ArrayList<>();
    bookRepository.findAll().forEach(books::add);
    return books;
  }


}
