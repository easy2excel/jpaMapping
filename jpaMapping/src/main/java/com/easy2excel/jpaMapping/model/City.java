package com.easy2excel.jpaMapping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "city")
public class City {
    @Id
    @Column(name = "city_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cityId;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false,foreignKey = @ForeignKey(name ="country_fk"))
    private Country country;

}
