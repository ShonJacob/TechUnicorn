package com.shonjacob.AppointmentsMicroservice.entity;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "`ClinicAdmin`", schema = "public")
public class ClinicAdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String admin_id;

    private String first_name;

    private String last_name;

    private String email_id;

    private String department_id;

}
