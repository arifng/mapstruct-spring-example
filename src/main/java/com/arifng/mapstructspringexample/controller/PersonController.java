package com.arifng.mapstructspringexample.controller;

import com.arifng.mapstructspringexample.dto.PersonDto;
import com.arifng.mapstructspringexample.mapper.PersonMapper;
import com.arifng.mapstructspringexample.model.Person;
import com.arifng.mapstructspringexample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rana on 2019-08-19.
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @Autowired
    private PersonMapper mapper;

    @GetMapping("/person")
    public PersonDto getTargetDto() {
        Person person = personService.getPerson();
        return mapper.personDto(person);
    }
}
