package com.odontosmile.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "medical_procedure")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalProcedure {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 10000)
    private String name;

    @Column(name = "cost")
    private Long cost;
}
