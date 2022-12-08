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
public class ClinicAdminModel {

    private String adminId;

    private String firstName;

    private String lastName;

    private String emailId;

    private String departmentId;

}
