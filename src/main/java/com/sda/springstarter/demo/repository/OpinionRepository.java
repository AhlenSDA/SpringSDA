package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpinionRepository extends JpaRepository<Opinion, Long> {



}
