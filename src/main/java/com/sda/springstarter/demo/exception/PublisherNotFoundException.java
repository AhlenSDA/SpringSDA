package com.sda.springstarter.demo.exception;

public class PublisherNotFoundException extends RuntimeException {

    public PublisherNotFoundException(String publisherName){
        super("Publisher with given name was not found " + publisherName);
    }
}