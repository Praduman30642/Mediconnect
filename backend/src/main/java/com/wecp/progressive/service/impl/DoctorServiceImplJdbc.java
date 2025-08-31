package com.wecp.progressive.service.impl;

<<<<<<< HEAD
public class DoctorServiceImplJdbc  {
=======
import java.util.List;

import com.wecp.progressive.dao.DoctorDAO;
import com.wecp.progressive.entity.Doctor;
import com.wecp.progressive.service.DoctorService;

public class DoctorServiceImplJdbc implements DoctorService  {
    private DoctorDAO doctorDAO;
    

    public DoctorServiceImplJdbc(DoctorDAO doctorDAO) {
        this.doctorDAO = doctorDAO;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return List.of();
        
    }
    @Override
    public Doctor getDoctorById(int doctorId) {
        return null;
    }

    @Override
    public Integer addDoctor(Doctor doctor) {
        return -1;
    }

    @Override
    public List<Doctor> getDoctorSortedByExperience() {
        return List.of();
    }
    @Override
    public void updateDoctor(Doctor doctor){

    }
    @Override
    public void deleteDoctor(int doctorId)
    {
        
    }
>>>>>>> 7603ec2f6743607f5e49d6bbf1d40a165102e9a1

}