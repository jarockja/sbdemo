package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Profile("prod")
@Service
public class BookProdService implements BookService {

  @Inject
  private BookRepository bookRepository;

  @Override
  public List<Book> getBooks() {
    return bookRepository.findAll(Sort.by("name"));
  }

  @Override
  public void insertBook(Book book) {
    bookRepository.save(book);
  }
}
