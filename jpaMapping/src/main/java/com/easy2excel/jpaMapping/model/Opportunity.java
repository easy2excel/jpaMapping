package com.easy2excel.jpaMapping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Setter
@Getter
//@Table(name = "opportunity")
public class Opportunity {
    private Long id;
    private String name;
    private String currency;
    private float amount;
}
