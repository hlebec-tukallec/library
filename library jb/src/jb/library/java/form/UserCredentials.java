package jb.library.java.form;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserCredentials {
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 30)
    @Pattern(regexp = "[A-z]+", message = "Expected Latin letters")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    @NotEmpty
    @Size(min = 2, max = 30)
    @Pattern(regexp = "[A-z]+", message = "Expected Latin letters")
    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
