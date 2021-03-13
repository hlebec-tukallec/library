package jb.library.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import jb.library.java.domain.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM user WHERE name=?1 AND surname=?1", nativeQuery = true)
    User findByNameAndSurname(String name, String surname);

    List<User> findAllByOrderByIdDesc();
}
