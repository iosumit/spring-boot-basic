package com.twitterapi.auth;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends JpaRepository<User, Long> {

    @Query("SELECT s FROM Student s WHERE s.username  = ?1 and s.password = ?2")
    Optional<User> findUserByUsername(String username, String password);

}
