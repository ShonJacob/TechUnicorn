package com.shonjacob.AppointmentsMicroservice.entity;

import lombok.*;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "`Appointment`", schema = "public")
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String appointment_id;

    private String patient_id;

    private String doctor_id;

    private Timestamp appointment_date;

    private String duration;

    private Boolean cancelled;

}
