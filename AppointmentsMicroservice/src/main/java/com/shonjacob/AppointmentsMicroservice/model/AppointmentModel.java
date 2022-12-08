package com.shonjacob.AppointmentsMicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class AppointmentModel {

    private String appointment_id;

    private String patient_id;

    private String doctor_id;

    private Timestamp appointment_date;

    private String duration;

    private Boolean cancelled;
}
