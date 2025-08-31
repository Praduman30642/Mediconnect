package com.wecp.progressive.dao;

<<<<<<< HEAD
public class PatientDAOImpl {
=======
import java.util.List;

import com.wecp.progressive.entity.Patient;

public class PatientDAOImpl implements PatientDAO {

    @Override
    public int addPatient(Patient patient) {
        return -1;

    }

    @Override
    public Patient getPatientById(int patientId) {
      return null;
    }

    @Override
    public void updatePatient(Patient patient) {
       
    }

    @Override
    public void deletePatient(int patientId) {
        
    }

    @Override
    public List<Patient> getAllPatients() {
        return List.of();
    }
>>>>>>> 7603ec2f6743607f5e49d6bbf1d40a165102e9a1

}
