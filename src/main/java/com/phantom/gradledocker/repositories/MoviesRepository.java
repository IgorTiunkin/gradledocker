package com.phantom.gradledocker.repositories;

import com.phantom.gradledocker.models.Movie;
import com.phantom.gradledocker.models.MovieStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MoviesRepository extends JpaRepository<Movie, Integer> {

    Optional<Movie> findMovieByTitle(String title);

    List<Movie> findAllByMovieStatus(MovieStatus movieStatus);
}
