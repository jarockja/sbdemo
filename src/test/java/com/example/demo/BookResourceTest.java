package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.newArrayList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BookResourceTest {

  @Mock
  private Book book;
  @Mock
  private BookRepository bookRepository;

  @InjectMocks
  private BookResource sut;

  @Before
  public void setUp() {
    when(bookRepository.findAll()).thenReturn(newArrayList(book));
  }

  @Test
  public void getBooks_returnsCorrectResult() {
    assertThat(sut.getBooks()).hasSize(1);
    assertThat(sut.getBooks()).contains(book);
  }

  @Test
  public void insertBook_callsRepo() {
    sut.insertBook(book);
    verify(bookRepository).save(book);
  }
}