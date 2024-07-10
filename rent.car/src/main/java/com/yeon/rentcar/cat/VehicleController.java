package com.yeon.rentcar.cat;

import com.yeon.rentcar.models.Vehicle;
import com.yeon.rentcar.models.VehicleStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private IVehicleService vehicleService;

    @PostMapping
    public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle) {
        Vehicle createdVehicle = vehicleService.addVehicle(vehicle);
        return ResponseEntity.ok(createdVehicle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> removeVehicle(@PathVariable Long id) {
        boolean removed = vehicleService.removeVehicle(id);
        return ResponseEntity.ok(removed);
    }

    @PutMapping
    public ResponseEntity<Vehicle> updateVehicle(@RequestBody Vehicle vehicle) {
        Vehicle updatedVehicle = vehicleService.updateVehicle(vehicle);
        return ResponseEntity.ok(updatedVehicle);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> findVehicleById(@PathVariable Long id) {
        Vehicle vehicle = vehicleService.findVehicleById(id);
        return ResponseEntity.ok(vehicle);
    }

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        List<Vehicle> vehicles = vehicleService.getAllVehicles();
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Vehicle>> findVehiclesByStatus(@PathVariable VehicleStatus status) {
        List<Vehicle> vehicles = vehicleService.findVehiclesByStatus(status);
        return ResponseEntity.ok(vehicles);
    }
}
