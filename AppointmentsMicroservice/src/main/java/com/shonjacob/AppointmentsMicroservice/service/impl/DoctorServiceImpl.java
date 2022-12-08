package com.shonjacob.AppointmentsMicroservice.service.impl;

import com.shonjacob.AppointmentsMicroservice.entity.DoctorEntity;
import com.shonjacob.AppointmentsMicroservice.model.DoctorModel;
import com.shonjacob.AppointmentsMicroservice.repository.DoctorRepository;
import com.shonjacob.AppointmentsMicroservice.service.DoctorService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<DoctorModel> getDoctorList() {

        List<DoctorEntity> doctorEntityList = null;

        List<DoctorModel> doctorModelList;

        try {
            doctorEntityList = doctorRepository.findAll();
        }
        catch(Exception ex){
            log.debug("Exception in fetching doctors from DB: {}", ex);
        }

//        mapping Entity to Model object
        doctorModelList =  doctorEntityList.stream().map(doctorEntity -> modelMapper.map(doctorEntity, DoctorModel.class)).collect(Collectors.toList());

        log.info("DoctorList fetched from DB {}:", doctorModelList);
        return doctorModelList;
    }

    @Override
    public DoctorModel getDoctor(String id) {
        Optional<DoctorEntity> doctorEntity = null;
        DoctorModel doctorModel;

        try {
            doctorEntity = doctorRepository.findById(Integer.valueOf(id));
        }
        catch(Exception ex){
            log.debug("Exception in fetching doctors from DB: {}", ex);
        }

        if(doctorEntity.isEmpty()){
            log.info("Doctor not found in DB with id {}:", id);
            return null;
        }
        log.info("Doctor fetched from DB {}:", doctorEntity.get());
        return modelMapper.map(doctorEntity.get(), DoctorModel.class);
    }
}
