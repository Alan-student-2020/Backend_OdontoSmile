package com.odontosmile.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "administrator")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "typeDocument")
    private String typeDocument;

    @Column(name = "documentNumber", unique = true)
    private Long documentNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "creationDate")
    private Date creationDate = new Date(System.currentTimeMillis());

}
