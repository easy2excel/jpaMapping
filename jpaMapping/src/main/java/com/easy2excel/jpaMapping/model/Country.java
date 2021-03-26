package com.easy2excel.jpaMapping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "currency")
    private String currency;



    @OneToMany(mappedBy = "country" ,cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.LAZY)
    List<City> cityList = new ArrayList<>();

}
