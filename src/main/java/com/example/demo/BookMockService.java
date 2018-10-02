package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Profile("mock")
@Service
public class BookMockService implements BookService {

  private final Log LOG = LogFactory.getLog(BookMockService.class);

  @Override
  public List<Book> getBooks() {
    LOG.warn("Not searching books, mock service.");
    return new ArrayList<>();
  }

  @Override
  public void insertBook(Book book) {
    LOG.warn("Not inserting book, mock service.");
  }
}
