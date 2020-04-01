package bg.codeacademy.spring.project1.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book
{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int    id;
  private String author;
  private String title;
  private int    yearOfIssue;
  private int    rating;


  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getAuthor()
  {
    return author;
  }

  public void setAuthor(String author)
  {
    this.author = author;
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public int getYearOfIssue()
  {
    return yearOfIssue;
  }

  public void setYearOfIssue(int yearOfIssue)
  {
    this.yearOfIssue = yearOfIssue;
  }

  public int getRating()
  {
    return rating;
  }

  public void setRating(int rating)
  {
    this.rating = rating;
  }

}
