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
public class PatientModel {

    private String patient_id;

    private String first_name;

    private String last_name;

    private String phone;

    private String email_id;

    private String address;
}
