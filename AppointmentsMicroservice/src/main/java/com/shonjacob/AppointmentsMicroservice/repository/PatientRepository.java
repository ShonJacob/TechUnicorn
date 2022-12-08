package com.shonjacob.AppointmentsMicroservice.repository;

import com.shonjacob.AppointmentsMicroservice.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Integer> {
}
