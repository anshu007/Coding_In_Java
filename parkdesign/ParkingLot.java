package com.parkdesign;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ParkingLot {
	static List<ParkingSpace> vacantParkingSpaces = new CopyOnWriteArrayList<ParkingSpace>();

	static List<ParkingSpace> fullParkingSpaces = new CopyOnWriteArrayList<ParkingSpace>();

	int parkingSpaceCount = 6;

	boolean isFull;
	boolean isEmpty;

	ParkingSpace findNearestVacant(ParkingType type) {
		Iterator<ParkingSpace> itr = vacantParkingSpaces.iterator();

		while (itr.hasNext()) {
			ParkingSpace parkingSpace = itr.next();

			if (parkingSpace.parkingType == type) {
				return parkingSpace;
			}
		}
		return null;
	}

	static {
		Vehicle v = new Vehicle("two wheller");
		ParkingType p = ParkingType.HANDICAPPED;
		ParkingSpace ps = new ParkingSpace(true, v, p);
		vacantParkingSpaces.add(ps);
		Vehicle v1 = new Vehicle("four wheller");
		ParkingType p1 = ParkingType.HANDICAPPED;
		ParkingSpace ps1 = new ParkingSpace(true, v1, p1);
		vacantParkingSpaces.add(ps1);
		Vehicle v2 = new Vehicle("two wheller");
		ParkingType p2 = ParkingType.REGULAR;
		ParkingSpace ps2 = new ParkingSpace(true, v2, p2);
		vacantParkingSpaces.add(ps2);
		Vehicle v3 = new Vehicle("four wheller");
		ParkingType p3 = ParkingType.REGULAR;
		ParkingSpace ps3 = new ParkingSpace(true, v3, p3);
		vacantParkingSpaces.add(ps3);
	}

	void parkVehicle(ParkingType type, Vehicle vehicle) {
		if (!isFull()) {
			ParkingSpace parkingSpace = findNearestVacant(type);

			if (parkingSpace != null) {
				parkingSpace.parkingType = type;
				parkingSpace.vehicle = vehicle;
				parkingSpace.isVacant = false;

				vacantParkingSpaces.remove(parkingSpace);
				fullParkingSpaces.add(parkingSpace);

				if (fullParkingSpaces.size() == parkingSpaceCount)
					isFull = true;

				isEmpty = false;
				System.out.println("car of  " + type.name()
						+ " person and type " + vehicle.carType
						+ " parked successfully");
			}
		} else {
			System.out.println("Sorry no sapce");
		}
	}

	void releaseVehicle(Vehicle vehicle) {
		if (!isEmpty()) {
			Iterator<ParkingSpace> itr = fullParkingSpaces.iterator();

			while (itr.hasNext()) {
				ParkingSpace parkingSpace = itr.next();

				if (parkingSpace.vehicle.equals(vehicle)) {
					fullParkingSpaces.remove(parkingSpace);
					vacantParkingSpaces.add(parkingSpace);

					parkingSpace.isVacant = true;
					parkingSpace.vehicle = null;

					if (vacantParkingSpaces.size() == 0)
						isEmpty = true;

					isFull = false;
					System.out.println("Vehcile " + vehicle.carType
							+ "released successfully");
				}
			}
		} else {
			System.out.println("Empty");
		}
	}

	boolean isFull() {
		return isFull;
	}

	boolean isEmpty() {
		return isEmpty;
	}
}

class ParkingSpace {
	ParkingSpace(boolean isVacant, Vehicle vehicle, ParkingType parkingType) {
		this.isVacant = isVacant;
		this.vehicle = vehicle;
		this.parkingType = parkingType;

	}

	boolean isVacant;
	Vehicle vehicle;
	ParkingType parkingType;
}

class Vehicle {
	String carType;

	Vehicle(String carType) {
		this.carType = carType;
	}
}

enum ParkingType {
	REGULAR(2), HANDICAPPED(2), COMPACT(2), MAX_PARKING_TYPE(2);

	int type;

	ParkingType(int type) {
		this.type = type;
	}

	public String toString() {
		return String.valueOf(type);

	}

}
