package com.phantom.gradledocker.controllers;

import com.phantom.gradledocker.controllers.services.MoviesService;
import com.phantom.gradledocker.models.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
@RequiredArgsConstructor
public class MovieController {
    private final MoviesService moviesService;

    @GetMapping("/all")
    public List<Movie> getAllMovies() {
        return moviesService.getAllMovies();
    }
}