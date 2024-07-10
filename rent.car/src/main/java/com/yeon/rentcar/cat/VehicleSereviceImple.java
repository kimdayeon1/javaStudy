package com.yeon.rentcar.cat;

import com.yeon.rentcar.models.Vehicle;
import com.yeon.rentcar.models.VehicleStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleSereviceImple implements IVehicleService {

    @Autowired
    private VehicleJpaRepository vehicleJpaRepository;

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleJpaRepository.save(vehicle);
    }

    @Override
    public boolean removeVehicle(Long id) {
        if (vehicleJpaRepository.existsById(id)) {
            vehicleJpaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        if (vehicleJpaRepository.existsById(vehicle.getId())) {
            return vehicleJpaRepository.save(vehicle);
        }
        return null;
    }

    @Override
    public Vehicle findVehicleById(Long id) {
        Optional<Vehicle> vehicle = vehicleJpaRepository.findById(id);
        return vehicle.orElse(null);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleJpaRepository.findAll();
    }

    @Override
    public List<Vehicle> findVehiclesByStatus(VehicleStatus status) {
        return vehicleJpaRepository.findByStatus(status);
    }
}


