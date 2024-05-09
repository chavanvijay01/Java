

class Car{
	String brand;
	String model;
	String engine;
	String type;
	double mileage;
	byte seatingCapacity;
	double price;
	int noAirbags;


	public void displalyCar(){
		System.out.println("** Car Details **");
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Engine : " + engine);
		System.out.println("Car Type : " + type);
		System.out.println("Mileage : " + mileage + " km/l");
		System.out.println("Seating Capacity : " + seatingCapacity);
		System.out.println("Price : " + price + " Rs");
		System.out.println("Number Of Airbags : " + noAirbags);
	}
}
  
class CarDriver{
	public static void main(String[] args) {
		Car obj = new Car();
		obj.brand = "BMW";
		obj.model = "G700";
		obj.engine = "SP";
		obj.type = "SUV";
		obj.mileage = 25;
		obj.seatingCapacity = 5;
		obj.price = 1800000;
		obj.noAirbags = 5;
		obj.displalyCar();

	}
}