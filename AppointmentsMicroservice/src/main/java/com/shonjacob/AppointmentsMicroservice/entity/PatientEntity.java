package com.shonjacob.AppointmentsMicroservice.entity;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "`Patient`", schema = "public")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String patient_id;

    private String first_name;

    private String last_name;

    private String phone;

    private String email_id;

    private String address;

}
