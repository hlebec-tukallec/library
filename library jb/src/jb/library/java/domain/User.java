package jb.library.java.domain;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table/*(
        indexes = @Index(columnList = "creationTime"),
        uniqueConstraints = @UniqueConstraint(columnNames = "id")
)*/
public class User {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String surname;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @OrderBy("creationTime desc")
    private List<Book> books;

    @CreationTimestamp
    private Date creationTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public void addBook(Book book) {
        getBooks().add(book);
    }
}
