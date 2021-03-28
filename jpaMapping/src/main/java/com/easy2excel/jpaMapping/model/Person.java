package com.easy2excel.jpaMapping.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Setter
@Getter
@ToString
public class Person {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
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
