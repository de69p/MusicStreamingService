package com.example.musicstreamingservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Duration;

@Entity
@Table(name = "songs")
@Data
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false)
    private Duration duration;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
}

