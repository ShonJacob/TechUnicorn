package com.shonjacob.AppointmentsMicroservice.repository;

import com.shonjacob.AppointmentsMicroservice.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer> {

}
