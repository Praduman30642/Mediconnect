package com.wecp.progressive.dao;

<<<<<<< HEAD

public class DoctorDAOImpl {
=======
import java.util.List;

import com.wecp.progressive.entity.Clinic;
import com.wecp.progressive.entity.Doctor;

public class DoctorDAOImpl implements DoctorDAO {

    @Override
    public int addDoctor(Doctor doctor) {
        return -1;

    }

    @Override
    public Doctor getDoctorById(int doctorId) {
        return null;
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        
    }

    @Override
    public void deleteDoctor(int doctorId) {
   
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return List.of();
    }

   

>>>>>>> 7603ec2f6743607f5e49d6bbf1d40a165102e9a1



}
