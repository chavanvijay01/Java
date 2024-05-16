

class Demo2{
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.m1();
	}
	public void m1(){
		System.out.println("Hello from m1()");
		Demo3 obj1 = new Demo3();
		obj1.m2();
	}
}

class Demo3{
	public void m2(){
		System.out.println("Hello from M2()");
		m3();
	}
	public void m3(){
		System.out.println("Hello from M3()");
	}

}