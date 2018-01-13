package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    // by default in this method long type is considered, we need to change to our int type
    public Author findById(long id);
    public Author findByName(String name);

}
