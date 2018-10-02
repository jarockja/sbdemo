package com.example.demo;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("books")
public class BookResource {

  @Inject
  private BookService bookService;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Book> getBooks() {
    return bookService.getBooks();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void insertBook(Book book) {
    bookService.insertBook(book);
  }
}
