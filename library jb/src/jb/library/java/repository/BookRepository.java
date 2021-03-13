package jb.library.java.repository;


import jb.library.java.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByOrderById();

    @Transactional
    @Modifying
    @Query(value = "UPDATE book SET id WHERE id=?1", nativeQuery = true)
    void updateId(long id, long newId);

    @Query(value = "SELECT * FROM book WHERE id=?1", nativeQuery = true)
    Book findById(long id);

    @Query(value = "DELETE book WHERE id=?1", nativeQuery = true)
    void deleteBookById(long id);
}

