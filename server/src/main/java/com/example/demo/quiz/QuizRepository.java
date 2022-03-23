package com.example.demo.quiz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {    // database layer
    @Query("SELECT q FROM Quiz q WHERE q.title = ?1")    // where Quiz is a quiz class, which is annotated
    Optional<Quiz> findQuizByTitle(String title);
}
