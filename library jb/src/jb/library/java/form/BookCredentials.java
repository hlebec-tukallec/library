package jb.library.java.form;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class BookCredentials {
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 60)
    @Pattern(regexp = "[a-z]+", message = "Expected lowercase Latin letters")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @NotNull
    @NotEmpty
    @Size(min = 2, max = 60)
    @Pattern(regexp = "[a-z]+", message = "Expected lowercase Latin letters")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

