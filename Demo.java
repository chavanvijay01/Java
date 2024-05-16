

class Demo{

	String str1 = "Hi i am from demo class";
	public static void main(String[] args) {
		System.out.println("Hello from main");
		Demo1 obj = new Demo1();
		obj.m1();
	}
}
class Demo1{
	static Demo obj = new Demo();

	void m1(){
		System.out.println("Hi from m1()");
		System.out.println(obj.str1);
		m2();
	}

	void m2(){
		System.out.println("Hi from m2()");
		System.out.println(obj.str1);
		m3();
	}
	void m3(){
		System.out.println("Hi form m3() static");
		System.out.println(obj.str1);
	}
}