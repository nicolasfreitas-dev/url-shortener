package com.nicolas.url_shortener.repository;

import com.nicolas.url_shortener.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url, Long> {


}
