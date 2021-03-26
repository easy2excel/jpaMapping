package com.easy2excel.jpaMapping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "person")
@Setter
@Getter
@Entity
public class Person {
    @Column(name = "person_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;

    @Column(name = "person_name")
    private String personName;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "age")
    private int age;

    @OneToOne
    @JoinColumn(name = "counrty_id" ,nullable = false,foreignKey = @ForeignKey(name = "person_country_fk"))
    private Country country;
}
