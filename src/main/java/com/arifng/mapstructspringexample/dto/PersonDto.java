package com.arifng.mapstructspringexample.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Created by Rana on 2019-08-19.
 */
@Data
@Builder(toBuilder = true, builderClassName = "Builder")
public class PersonDto {
    private Long id;
    private String name;
    private Date birthDate;
}
