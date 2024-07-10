package com.yeon.rentcar.models;

import com.yeon.rentcar.cat.IVehicle;
import com.yeon.rentcar.models.VehicleStatus;
import com.yeon.rentcar.models.VehicleType;

public class Vehicle implements IVehicle {
    private Long id;
    private String company;
    private String model;
    private String makeYear;
    private VehicleType type;
    private int totalKm;
    private VehicleStatus status; // VehicleStatus enum으로 상태 값을 저장

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getMakeYear() {
        return makeYear;
    }

    @Override
    public VehicleType getType() {
        return type;
    }

    @Override
    public int getTotalKm() {
        return totalKm;
    }

    @Override
    public VehicleStatus getStatus() {
        return status;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }

    @Override
    public void setType(VehicleType type) {
        this.type = type;
    }

    @Override
    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }

    @Override
    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}


