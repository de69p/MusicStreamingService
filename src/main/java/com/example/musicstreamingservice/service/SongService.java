package com.example.musicstreamingservice.service;

import com.example.musicstreamingservice.model.Genre;
import com.example.musicstreamingservice.model.Song;
import com.example.musicstreamingservice.repository.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public Song findById(Long id) {
        return songRepository.findById(id).orElse(null);
    }

    public List<Song> findByGenre(Genre genre) {
        return songRepository.findByGenre(genre);
    }

    public Song save(Song song) {
        return songRepository.save(song);
    }
}

