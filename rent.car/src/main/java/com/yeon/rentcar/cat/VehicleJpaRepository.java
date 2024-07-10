package com.yeon.rentcar.cat;

import com.yeon.rentcar.models.Vehicle;
import com.yeon.rentcar.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleJpaRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByStatus(VehicleStatus status);
}

