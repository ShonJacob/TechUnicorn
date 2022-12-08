package com.shonjacob.AppointmentsMicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class DoctorModel {
    private String doctor_id;

    private String first_name;

    private String last_name;

    private String specialization;

    private String department_id;

    private String email_id;
}
