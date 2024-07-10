package com.yeon.rentcar.models;

public enum VehicleStatus {
    Free(0),
    Reserved(1),
    Rented(2),
    Broken(3),
    Fixing(4);

    private final Integer value;

    VehicleStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    private static final VehicleStatus[] VehicleStatusArray = VehicleStatus.values();

    public static VehicleStatus fromValue(Integer value) {
        for (VehicleStatus status : VehicleStatusArray) {
            if (value.equals(status.getValue())) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid VehicleStatus value: " + value);
    }
}
