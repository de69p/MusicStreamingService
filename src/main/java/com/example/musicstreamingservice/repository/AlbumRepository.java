package com.example.musicstreamingservice.repository;

import com.example.musicstreamingservice.model.Album;
import com.example.musicstreamingservice.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    List<Album> findByArtist(Artist artist);
}

