package com.example.musicstreamingservice.service;

import com.example.musicstreamingservice.model.Genre;
import com.example.musicstreamingservice.repository.GenreRepository;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public Genre findById(Long id) {
        return genreRepository.findById(id).orElse(null);
    }

    public Genre save(Genre genre) {
        return genreRepository.save(genre);
    }
}

