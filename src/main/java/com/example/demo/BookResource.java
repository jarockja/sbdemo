package com.example.demo;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("books")
public class BookResource {

  @Inject
  private BookRepository bookRepo;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Book> getBooks() {
    return bookRepo.findAll();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void insertBook(Book book) {
    bookRepo.save(book);
  }
}
