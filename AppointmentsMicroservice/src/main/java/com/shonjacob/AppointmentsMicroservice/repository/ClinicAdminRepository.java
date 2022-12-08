package com.shonjacob.AppointmentsMicroservice.repository;

import com.shonjacob.AppointmentsMicroservice.entity.ClinicAdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicAdminRepository extends JpaRepository<ClinicAdminEntity, Integer> {
}
