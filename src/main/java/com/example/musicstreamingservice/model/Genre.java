package com.example.musicstreamingservice.model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "genres")
@Data
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @OneToMany(mappedBy = "genre")
    private List<Song> songs;
}

