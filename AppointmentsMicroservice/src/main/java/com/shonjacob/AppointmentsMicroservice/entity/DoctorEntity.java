package com.shonjacob.AppointmentsMicroservice.entity;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "`Doctor`", schema = "public")
public class DoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String doctor_id;

    private String first_name;

    private String last_name;

    private String specialization;

    private String department_id;

    private String email_id;

}
