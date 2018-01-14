package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.exception.PublisherNotFoundException;
import com.sda.springstarter.demo.interfaces.PublisherService;
import com.sda.springstarter.demo.model.Publisher;
import com.sda.springstarter.demo.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

    @Override
    public void savePublisher(Publisher publisher) {
        publisherRepository.save(publisher);
    }

    public Publisher getPublisherByName(String name){
        Optional<Publisher> publisher = publisherRepository.findPublisherByName(name);
        if (publisher.isPresent()) {
            return publisher.get();
        }
        else {
            throw new PublisherNotFoundException(name);
        }
    }
}