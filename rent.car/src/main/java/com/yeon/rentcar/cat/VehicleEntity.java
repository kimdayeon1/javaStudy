package com.yeon.rentcar.cat;

import com.yeon.rentcar.models.VehicleStatus;
import com.yeon.rentcar.models.VehicleType;
import jakarta.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicle_tbl")
public class VehicleEntity implements IVehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String company;

    @NotNull
    @Column(nullable = false)
    private String model;

    @NotNull
    @Column(nullable = false)
    private String makeYear;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VehicleType type;

    @NotNull
    @Column(nullable = false)
    private int totalKm;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VehicleStatus status;

    // Getter and Setter methods (생략 가능)
}

