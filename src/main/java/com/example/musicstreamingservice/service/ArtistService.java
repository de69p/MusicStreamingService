package com.example.musicstreamingservice.service;

import com.example.musicstreamingservice.model.Artist;
import com.example.musicstreamingservice.repository.ArtistRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public Artist findById(Long id) {
        return artistRepository.findById(id).orElse(null);
    }

    public Artist save(Artist artist) {
        return artistRepository.save(artist);
    }
}

