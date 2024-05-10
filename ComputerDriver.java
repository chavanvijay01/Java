

// Aggregation Example

class Computer{
	String brand;
	double price;
	Cpu cpu;
	Monitor monitor;
	
	Computer(String brand, double price){
		this.brand = brand;
		this.price = price;
	}

	public void displayComputer(){
		System.out.println("*** Computer Details ***");
		System.out.println("Brand : " + this.brand);
		System.out.println("price : " + this.price);
		System.out.println();
	}

	public void createInstanceOfCpu(int ram, int rom, String processor, int gc){
		cpu = new Cpu(ram, rom, processor, gc);
	}

	public void createInstanceOfMonitor(String displayType,int size,int resolution){
		monitor = new Monitor(displayType, size, resolution);
	}
}

class Cpu {
	int ram;
	int rom;
	String processor;
	int gc;
	Keyboard keybord;
	Mouse mouse;
	Speaker speaker;

	Cpu(int ram,int rom,String processor,int gc)
	{
		this.ram=ram;
		this.rom=rom;
		this.processor=processor;
		this.gc=gc;
	}
	public void displayCpu(){
		System.out.println("*** CPU Details ***");
		System.out.println("RAM:"+this.ram + "GB");
		System.out.println("ROM:"+this.rom + "GB");
		System.out.println("Processor:"+this.processor);
		System.out.println("Graphic User:"+this.gc + "GB");
		System.out.println();
	}

	public void createInstanceOfKeybord(String brand,int noOfKeys,String type,int noOfColour){
		keybord = new Keyboard(brand, noOfKeys, type, noOfColour);
	}
	public void createInstanceOfMouse(String brand,int noOfbuttons,String type,boolean scroll){
		mouse = new Mouse(brand, noOfbuttons, type, scroll);
	}
	public void createInstanceOfSpeaker(String brand,int noOfSpeakers,String type,int watt){
		speaker = new Speaker(brand, noOfSpeakers, type, watt);
	}
}

class Keyboard{
	String brand;
	int noOfKeys;
	String type;
	int noOfColour;

	Keyboard(String brand,int noOfKeys,String type,int noOfColour){
		this.brand=brand;
		this.noOfKeys=noOfKeys;
		this.noOfColour=noOfColour;
		this.type=type;
	}
	public void displayKeyboard(){

		System.out.println("*** Keyboard Details ***");
		System.out.println("Brand:"+this.brand);
		System.out.println("No Of Keys:"+this.noOfKeys);
		System.out.println("No Of Colour:"+this.noOfColour);
		System.out.println("Type of Keyboard:"+this.type);
		System.out.println();
	}
}

class Mouse
{
	String brand;
	int noOfbuttons;
	String type;
	boolean scroll;

	Mouse(String brand,int noOfbuttons,String type,boolean scroll){
		this.brand=brand;
		this.noOfbuttons=noOfbuttons;
		this.scroll=scroll;
		this.type=type;
	}
	public void displayMouse(){

		System.out.println("*** Mouse Details ***");
		System.out.println("Brand:"+this.brand);
		System.out.println("No Of Buttons:"+this.noOfbuttons);
		System.out.println("Is there scroll Button or not:"+this.scroll);
		System.out.println("Type of Keyboard:"+this.type);
		System.out.println();

	}
}

class Monitor
{
	String displayType;
	int size;
	int resolution;
	Camera camera;

	Monitor(String displayType,int size,int resolution){
		this.displayType=displayType;
		this.size=size;
		this.resolution=resolution;
		
	}
	public void displayMonitor(){

		System.out.println("*** Monitor Details ***");
		System.out.println("Monitor Display Type:"+this.displayType);
		System.out.println("Size of the Monitor:"+this.size);
		System.out.println("Resolution of the Monitor:"+this.resolution + "Px");
		System.out.println();
	}

	public void createInstanceOfCamera(String brand,int lensinmm,String type,double price,int displaysize){
		camera = new Camera(brand, lensinmm, type, price, displaysize);
	}
}	

class Speaker{
	String brand;
	int noOfSpeakers;
	String type;
	double watt;

	Speaker(String brand,int noOfSpeakers,String type,int watt){
		this.brand=brand;
		this.noOfSpeakers=noOfSpeakers;
		this.watt=watt;
		this.type=type;
	}
	public void displaySpeaker(){

		System.out.println("*** Speakers Details ***");
		System.out.println("Brand:"+this.brand);
		System.out.println("No Of Speakers:"+this.noOfSpeakers);
		System.out.println("Watt:"+this.watt);
		System.out.println("Type of Keyboard:"+this.type);
		System.out.println();
	}
}

class Camera{
	String brand;
	int lensinmm;
	String type;
	double price;
	int diplaysize;

	Camera(String brand,int lensinmm,String type,double price,int displaysize){
		this.brand=brand;
		this.lensinmm=lensinmm;
		this.price=price;
		this.type=type;
		this.diplaysize=diplaysize;
	}
	public void displayCamera(){

		System.out.println("*** Camera Details ***");
		System.out.println("Brand:"+this.brand);
		System.out.println("Lens in mm:"+this.lensinmm);
		System.out.println("Price of camera:"+this.price);
		System.out.println("Type of Keyboard:"+this.type);
		System.out.println("Display Size :"+this.diplaysize);
		System.out.println();
	}
}


class ComputerDriver{
	public static void main(String[] args) {
		Computer obj = new Computer("HP", 75000);
		obj.displayComputer();
		obj.createInstanceOfCpu(16, 512, "i7", 4);
		obj.cpu.displayCpu();
		obj.createInstanceOfMonitor("LCD", 15, 1080);
		obj.monitor.displayMonitor();
		obj.monitor.createInstanceOfCamera("Nikon", 52, "Web", 1500, 120);
		obj.monitor.camera.displayCamera();
		obj.cpu.createInstanceOfKeybord("Logitech", 102, "Mechanical", 3);
		obj.cpu.keybord.displayKeyboard();
		obj.cpu.createInstanceOfMouse("Logitech", 4, "Wired", true);
		obj.cpu.mouse.displayMouse();
		obj.cpu.createInstanceOfSpeaker("Sony", 2, "Wireless", 25);
		obj.cpu.speaker.displaySpeaker();
		
	}
	
}