package com.arifng.mapstructspringexample.mapper;

import com.arifng.mapstructspringexample.dto.PersonDto;
import com.arifng.mapstructspringexample.model.Person;
import org.mapstruct.Mapper;

/**
 * Created by Rana on 2019-08-19.
 */
@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonDto personDto(Person person);
}
