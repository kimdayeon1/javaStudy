package com.yeon.rentcar.models;

public interface Vehicle {
    public Long getId();
    public String getCompany();
    public String getModel();
    public int getMakeYear();
    public VehicleType getType();
    public String getColor();
    public int getTotalKM();
    public String getFactoryNumber();
    public String getRegistNumber();
    public VehicleStatus getStatus();
//    public String getDriver();
//    public String reserve();
//    public String cancel();
//    public String rentVehicle();
//    public String returnVehicle();
}
