package jb.library.java.service;

import jb.library.java.domain.Book;
import jb.library.java.form.BookCredentials;
import jb.library.java.repository.BookRepository;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAllByOrderById();
    }

    public Book findById(Long id) {
        return id == null ? null : bookRepository.findById(id).orElse(null);
    }

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book register(BookCredentials bookCredentials) {
        Book book = new Book();
        book.setAuthor(bookCredentials.getAuthor());
        book.setTitle(bookCredentials.getTitle());
        bookRepository.save(book);
        return book;
    }

    public void updateId(long id, long newId) {
        Book book = findById(id);
        book.setId(newId);
        bookRepository.updateId(id, newId);
    }
}
