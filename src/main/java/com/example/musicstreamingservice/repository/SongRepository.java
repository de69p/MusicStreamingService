package com.example.musicstreamingservice.repository;

import com.example.musicstreamingservice.model.Genre;
import com.example.musicstreamingservice.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findByGenre(Genre genre);
}

