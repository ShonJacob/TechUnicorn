package com.shonjacob.AppointmentsMicroservice.controllerTest;

import com.shonjacob.AppointmentsMicroservice.controller.AppointmentController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AppointmentControllerTest {

    @Autowired
    AppointmentController appointmentController;

    @Test
    public void contextLoads(){
    }

    @Test
    public void getDoctorsTest(){

    }
}
