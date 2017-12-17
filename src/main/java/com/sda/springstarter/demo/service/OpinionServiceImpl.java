package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.OpinionService;
import com.sda.springstarter.demo.model.Opinion;
import com.sda.springstarter.demo.repository.OpinionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpinionServiceImpl implements OpinionService {

    @Autowired
    private OpinionRepository opinionRepository;

    @Override
    public List<Opinion> getAllOpinions() {
        return opinionRepository.findAll();
    }

    @Override
    public void saveOpinion(Opinion opinion) {
        opinionRepository.save(opinion);
    }
}