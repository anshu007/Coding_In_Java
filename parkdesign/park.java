package com.parkdesign;

public class park {
	
	public static void main(String[] args){
		ParkingLot pp=new ParkingLot();
		Vehicle v=new Vehicle("two wheller");
		ParkingType p=ParkingType.HANDICAPPED;
		pp.parkVehicle(p, v);
		Vehicle v1=new Vehicle("four wheller");
		ParkingType p1=ParkingType.HANDICAPPED;
		pp.parkVehicle(p1, v1);
		Vehicle v11=new Vehicle("two wheller");
		ParkingType p11=ParkingType.REGULAR;
		pp.parkVehicle(p11, v11);
		Vehicle v12=new Vehicle("four wheller");
		ParkingType p12=ParkingType.REGULAR;
		pp.parkVehicle(p12, v12);
		pp.releaseVehicle(v);
		pp.releaseVehicle(v1);
		pp.releaseVehicle(v11);
		pp.releaseVehicle(v12);
	}

}
