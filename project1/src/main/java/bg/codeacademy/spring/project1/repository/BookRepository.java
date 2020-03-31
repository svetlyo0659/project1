package bg.codeacademy.spring.project1.repository;

import bg.codeacademy.spring.project1.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BookRepository extends PagingAndSortingRepository<Book, Integer>
{
  Book findByIsbn(String isbnCode);
  void deleteByIsbn(String isbnCode);
  List<Book> findByAuthorContaining(String author);

}
