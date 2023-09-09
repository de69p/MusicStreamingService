package com.example.musicstreamingservice.service;

import com.example.musicstreamingservice.model.Album;
import com.example.musicstreamingservice.model.Artist;
import com.example.musicstreamingservice.repository.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    private final AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public Album findById(Long id) {
        return albumRepository.findById(id).orElse(null);
    }

    public List<Album> findByArtist(Artist artist) {
        return albumRepository.findByArtist(artist);
    }

    public Album save(Album album) {
        return albumRepository.save(album);
    }
}

