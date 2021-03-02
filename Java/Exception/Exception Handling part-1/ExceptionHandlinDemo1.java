class ExceptionDemo{

	public static void main(String[] args){
	
		System.out.println("In main");
		fun();
		System.out.println("After fun in main");

	}
	
	static void fun(){
		System.out.println("In fun");
		gun();
	}

	
	static void gun(){
		System.out.println("In gun");
		

	}

}
