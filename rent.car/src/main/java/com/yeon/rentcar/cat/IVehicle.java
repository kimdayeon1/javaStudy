package com.yeon.rentcar.cat;

import com.yeon.rentcar.models.VehicleStatus;
import com.yeon.rentcar.models.VehicleType;

public interface IVehicle {
    Long getId();
    String getCompany();
    String getModel();
    String getMakeYear();
    VehicleType getType(); // VehicleType 사용
    int getTotalKm();
    VehicleStatus getStatus(); // VehicleStatus 사용

    void setId(Long id);
    void setCompany(String company);
    void setModel(String model);
    void setMakeYear(String makeYear);
    void setType(VehicleType type); // VehicleType 사용
    void setTotalKm(int totalKm);
    void setStatus(VehicleStatus status); // VehicleStatus 사용
}

