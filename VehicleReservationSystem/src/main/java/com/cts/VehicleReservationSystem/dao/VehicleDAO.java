package com.cts.VehicleReservationSystem.dao;

import java.util.List;

import com.cts.VehicleReservationSystem.bean.Vehicle;

public interface VehicleDAO {
public Vehicle insertVehicle(Vehicle vehicle);
public List<Vehicle> getallVehicle();
}
