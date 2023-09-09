package com.example.musicstreamingservice.repository;

import com.example.musicstreamingservice.model.Playlist;
import com.example.musicstreamingservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
    List<Playlist> findByUser(User user);
}

