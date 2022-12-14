package com.shonjacob.AppointmentsMicroservice.repository;

import com.shonjacob.AppointmentsMicroservice.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Integer> {
}
