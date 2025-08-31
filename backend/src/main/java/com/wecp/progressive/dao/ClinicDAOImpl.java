package com.wecp.progressive.dao;

<<<<<<< HEAD
public class ClinicDAOImpl {
=======
import java.util.List;

import com.wecp.progressive.entity.Clinic;

public class ClinicDAOImpl implements ClinicDAO {

    @Override
    public int addClinic(Clinic clinic) {
        return -1;
    }

    @Override
    public Clinic getClinicById(int clinicId) {
        return null;
    }

    @Override
    public void updateClinic(Clinic clinic) {
        
    }

    @Override
    public void deleteClinic(int clinicId) {
        
    }

    @Override
    public List<Clinic> getAllClinics() {
        return List.of();
    }
>>>>>>> 7603ec2f6743607f5e49d6bbf1d40a165102e9a1

}
