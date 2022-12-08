package com.shonjacob.AppointmentsMicroservice.controller;

import com.shonjacob.AppointmentsMicroservice.model.DoctorModel;
import com.shonjacob.AppointmentsMicroservice.service.impl.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    DoctorServiceImpl doctorServiceImpl;
    @GetMapping("/getDoctorsList")
    List<DoctorModel> getDoctorsList(){
        return doctorServiceImpl.getDoctorList();
    }

    @GetMapping("/getDoctor/{id}")
    DoctorModel getDoctor(@PathVariable("id") String id){
        return doctorServiceImpl.getDoctor(id);
    }
}
