package com.yeon.rentcar.cat;

import com.yeon.rentcar.models.Vehicle;
import com.yeon.rentcar.models.VehicleStatus;

import java.util.List;

public interface IVehicleService {
    Vehicle addVehicle(Vehicle vehicle);
    boolean removeVehicle(Long id);
    Vehicle updateVehicle(Vehicle vehicle);
    Vehicle findVehicleById(Long id);
    List<Vehicle> getAllVehicles();
    List<Vehicle> findVehiclesByStatus(VehicleStatus status);
}
