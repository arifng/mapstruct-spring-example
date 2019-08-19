package com.arifng.mapstructspringexample.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Created by Rana on 2019-08-19.
 */
@Data
@Builder(toBuilder = true, builderClassName = "Builder")
public class Person {
    private Long id;
    private String name;
    private Date birthDate;
}
