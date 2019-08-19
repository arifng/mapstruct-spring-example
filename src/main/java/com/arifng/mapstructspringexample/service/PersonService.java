package com.arifng.mapstructspringexample.service;

import com.arifng.mapstructspringexample.model.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Rana on 2019-08-19.
 */
@Service
public class PersonService {
    public Person getPerson() {
        return Person.builder()
                .id(1000L)
                .name("Rana")
                .birthDate(new Date())
                .build();
    }
}
