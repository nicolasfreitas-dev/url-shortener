package com.nicolas.url_shortener.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "links")
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String originalUrl;
    private String shortUrl;
    private LocalDateTime createdAt;
    private String qrCodePath;

    public Url(Long id, String originalUrl, String shortUrl, LocalDateTime createdAt, String qrCodePath) {
        this.id = id;
        this.originalUrl = originalUrl;
        this.shortUrl = shortUrl;
        this.createdAt = createdAt;
        this.qrCodePath = qrCodePath;

    }

    public Url() {

    }

}
