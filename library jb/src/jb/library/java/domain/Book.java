package jb.library.java.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @noinspection unused
 */
@Entity
@Table
public class Book {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 60)
    private String title;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 60)
    private String author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

