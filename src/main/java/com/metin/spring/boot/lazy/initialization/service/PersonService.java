package com.metin.spring.boot.lazy.initialization.service;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public PersonService() {
        System.out.println("PersonService constructor");
    }

    public void print() {
        System.out.println("PersonService print method");
    }
}
