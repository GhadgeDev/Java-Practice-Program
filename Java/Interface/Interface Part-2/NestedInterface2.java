class Outer{

	void m1(){
		System.out.println("Outer M1 !");
	}
	interface Inner{
		void m2();
	}

	
}
class xyz extends Outer implements Outer.Inner{

	public void m1(){
	
		System.out.println("Hi,m1");

	}

	public void m2(){
	
		System.out.println("Hi,m2");


	}

}

class Test {

	public static void main(String[] ar){
	
		Outer out = new xyz();

		Outer.Inner out2 = new xyz();
		out.m1();
		out2.m2();
		
		xyz obj1 = new xyz();
		obj1.m1();
		obj1.m2();
	
	}

}
