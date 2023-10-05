package com.phantom.gradledocker.controllers.services;

import com.phantom.gradledocker.models.Movie;
import com.phantom.gradledocker.repositories.MoviesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MoviesService {
    private final MoviesRepository moviesRepository;

    @Transactional(readOnly = true)
    public List<Movie> getAllMovies() {
        return moviesRepository.findAll();
    }
}
