package com.devsuperior.dslist.entities.exceptions;

public class CustomObjectNotFoundException extends RuntimeException {

    public CustomObjectNotFoundException(Long id) {
        super(("Object not found with this id: " + id));
    }

}
