
class Fruits{
	String color;
	String test;
	String shape;

	Fruits(String color, String test, String shape){
		super();
		this.color = color;
		this.test = test;
		this.shape = shape;
	}

	public void displayFruit(){
		System.out.println("*** Fruit Details ***");
		System.out.println("Color : " + this.color);
		System.out.println("Test : " + this.test);
		System.out.println("Shape : " + this.shape);
	}
}


class Apple extends Fruits{
	String seeds;
	String season;


	Apple(String seeds, String season, String color, String test, String shape){
		super(color, test, shape);
		this.seeds = seeds;
		this.season = season;
	}

	public void displayApple(){
		System.out.println("Single or Multiple Seeds : " + this.seeds);
		System.out.println("Season : " + this.season);
	}
}

class FruitsDriver {
	public static void main(String[] args) {
		Apple obj = new Apple("Multiple", "Winter", "red", "sweet", "Circular");
		obj.displayFruit();
		obj.displayApple();
	}
}