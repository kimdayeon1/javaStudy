package com.yeon.rentcar.cat;

import com.yeon.rentcar.models.VehicleStatus;
import com.yeon.rentcar.models.VehicleType;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDto {
    private Long id;
    private String company;
    private String model;
    private String makeYear;
    private VehicleType type;
    private int totalKm;
    private VehicleStatus status;
}
