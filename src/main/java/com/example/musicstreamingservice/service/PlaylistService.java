package com.example.musicstreamingservice.service;

import com.example.musicstreamingservice.model.Playlist;
import com.example.musicstreamingservice.model.User;
import com.example.musicstreamingservice.repository.PlaylistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {
    private final PlaylistRepository playlistRepository;

    public PlaylistService(PlaylistRepository playlistRepository) {
        this.playlistRepository = playlistRepository;
    }

    public Playlist findById(Long id) {
        return playlistRepository.findById(id).orElse(null);
    }

    public List<Playlist> findByUser(User user) {
        return playlistRepository.findByUser(user);
    }

    public Playlist save(Playlist playlist) {
        return playlistRepository.save(playlist);
    }
}

