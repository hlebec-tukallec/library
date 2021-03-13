package jb.library.java.service;

import jb.library.java.form.UserCredentials;
import jb.library.java.repository.UserRepository;
import jb.library.java.domain.User;
import jb.library.java.domain.Book;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByNameAndSurname(String name, String surname) {
        return name == null || surname == null ? null : userRepository.findByNameAndSurname(name, surname);
    }

    public List<User> findAll() {
        return userRepository.findAllByOrderByIdDesc();
    }

    public List<Book> findAllBooksByNameAndSurname(String name, String surname) {
        return findByNameAndSurname(name, surname).getBooks();
    }

    public User register(UserCredentials userCredentials) {
        User user = new User();
        user.setName(userCredentials.getName());
        user.setSurname(userCredentials.getSurname());
        userRepository.save(user);
        return user;
    }
}
