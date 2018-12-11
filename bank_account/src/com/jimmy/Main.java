package com.jimmy;

public class Main {

    public static void main(String[] args) {
	BankAccount bOfA = new BankAccount();
	bOfA.setAccountNumber(88);
	bOfA.setBalance(100.00);
	bOfA.deposit(88, 500.00);
	bOfA.withdraw(88, 50.00);
	bOfA.withdraw(993,100);
	bOfA.printInfo();

		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");
		Ceiling ceiling	= new Ceiling(12,25);
		Bed bed = new Bed("modern", 4,3,2,1);
		Lamp lamp = new Lamp("LED", false, 75);

		Bedroom bedRoom = new Bedroom("my room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

		bedRoom.makeBed();

		bedRoom.getLamp().turnOn();




    }





}

