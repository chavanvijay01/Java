
// Composition
class Car{
	String brand;
	String model;
	String type;
	double price;
	int seatingCap;
	// Engine engine = new Engine(120, 1.2, "Petrol", 16, 4); // First way 
	// Engine engine; // Second way

	Car(String brand, String model, String type, double price, int seatingCap){
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.seatingCap = seatingCap;
		// this.engine = engine; // First Way
		// this.engine = new Engine(horsePower, capacity, engineType, mileage, noOfPistal);  // Second Way
		
	}

	public void displalyCar(){
		System.out.println("*** Car Deatails ***");
		System.out.println("Brand " + brand);
		System.out.println("Model " + model);
		System.out.println("Type " + type);
		System.out.println("Price " + price);
		System.out.println("Seating Capacity " + seatingCap);
		System.out.println();
	}
}

class Engine{
	int horsePower;
	double capacity;
	String engineType;
	double mileage;
	int noOfPistal;

	Engine(int horsePower, double capacity, String engineType, double mileage, int noOfPistal){
		this.horsePower = horsePower;
		this.capacity = capacity;
		this.engineType = engineType;
		this.mileage = mileage;
		this.noOfPistal = noOfPistal;
	}

	public void displayEngine(){
		System.out.println("*** Engine Details ***");
		System.out.println("Horse Power " + horsePower);
		System.out.println("Capacity " + capacity);
		System.out.println("Engine Type " + engineType);
		System.out.println("Mileage " + mileage);
		System.out.println("No of Pistal " + noOfPistal);
	}
}

class CarDriver1{

	public static void main(String[] args) {
		// Car obj = new Car("Tata" , "Nexon", "SUV", 1000000, 5); // First Way
		// Car obj = new Car("Tata" , "Nexon", "SUV", 1000000, 5, 120, 1.2, "Petrol", 16, 4); // Second Way
		obj.displalyCar();

		// obj.engine.displayEngine(); // First Way
		obj.engine.displayEngine();
	}
}