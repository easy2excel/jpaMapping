package com.easy2excel.jpaMapping.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "contact_details")
@Setter
@Getter
public class ContactDetails {

    @Id
    @Column(name = "contact_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contactId;

    @Column(name = "email")
    private String email;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @Column(name = "phone_no")
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false,foreignKey = @ForeignKey(name = "user_fk"))
    @JsonBackReference
    private UserInfo user;

}
