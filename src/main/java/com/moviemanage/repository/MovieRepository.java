package com.moviemanage.repository;

import com.moviemanage.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    // You can add custom queries or methods here if needed
}

