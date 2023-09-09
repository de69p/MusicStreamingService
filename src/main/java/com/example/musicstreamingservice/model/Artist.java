package com.example.musicstreamingservice.model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "artists")
@Data
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String firstName;

    @Column(length = 50, nullable = false)
    private String lastName;

    @Column(length = 500)
    private String bio;

    @OneToMany(mappedBy = "artist")
    private List<Album> albums;
}


