package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Opinion;

import java.util.List;

public interface OpinionService {

    List<Opinion> getAllOpinions();
    void saveOpinion(Opinion opinion);

}
