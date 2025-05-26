package com.nicolas.url_shortener.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class UrlResponseDTO {
    private Long id;
    private String originalUrl;
    private String shortUrl;
    private LocalDateTime createdAt;
    private String qrCodePath;

    public UrlResponseDTO(Long id, String originalUrl, String shortUrl, LocalDateTime createdAt, String qrCodePath) {
        this.id = id;
        this.originalUrl = originalUrl;
        this.shortUrl = shortUrl;
        this.createdAt = createdAt;
        this.qrCodePath = qrCodePath;

    }

    public UrlResponseDTO() {
    }

    public UrlResponseDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getQrCodePath() {
        return qrCodePath;
    }

    public void setQrCodePath(String qrCodePath) {
        this.qrCodePath = qrCodePath;
    }
}
