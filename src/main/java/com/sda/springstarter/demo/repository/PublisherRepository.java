package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    public Optional<Publisher> findPublisherByName(String name);

}
