package com.shonjacob.AppointmentsMicroservice.service;

import com.shonjacob.AppointmentsMicroservice.model.DoctorModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DoctorService {
    public List<DoctorModel> getDoctorList();

    DoctorModel getDoctor(String id);
}
