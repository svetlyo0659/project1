package bg.codeacademy.spring.project1.repository;

import bg.codeacademy.spring.project1.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BookRepository extends PagingAndSortingRepository<Book, Integer>
{

  Book findById(int id);

  void deleteById(int id);

  List<Book> findByAuthorContaining(String author);

}
