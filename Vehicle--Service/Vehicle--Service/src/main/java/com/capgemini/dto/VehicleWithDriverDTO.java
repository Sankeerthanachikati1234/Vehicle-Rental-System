package com.capgemini.dto;

public class VehicleWithDriverDTO {
    private VehicleDTO vehicle;
    private DriverDTO driver;

    public VehicleWithDriverDTO(VehicleDTO vehicle, DriverDTO driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    public VehicleDTO getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleDTO vehicle) {
        this.vehicle = vehicle;
    }

    public DriverDTO getDriver() {
        return driver;
    }

    public void setDriver(DriverDTO driver) {
        this.driver = driver;
    }
}