package com.wecp.progressive.service.impl;

<<<<<<< HEAD
public class DoctorServiceImplArraylist  {
=======
import java.util.List;

import com.wecp.progressive.entity.Doctor;
import com.wecp.progressive.service.DoctorService;

public class DoctorServiceImplArraylist implements DoctorService  {

    @Override
    public List<Doctor> getAllDoctors() {
        return List.of();
    }

    @Override
    public Integer addDoctor(Doctor doctor) {
        return -1;
    }

    @Override
    public List<Doctor> getDoctorSortedByExperience() {
        return List.of();
    }
>>>>>>> 7603ec2f6743607f5e49d6bbf1d40a165102e9a1

}