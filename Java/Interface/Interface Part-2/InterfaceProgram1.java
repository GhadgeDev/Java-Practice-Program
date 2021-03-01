interface MumbaiMarket{

/*	default void quality(){	
		System.out.println("Best Quality !");
	}

*/
	static void quality(){	
		System.out.println("Best Quality !");
	}
	void price();


}
class SunilsShop implements MumbaiMarket{
	public void price(){
		System.out.println("500-600Rs.");
	}


}
class TilakRoad implements MumbaiMarket{

	public void price(){
		System.out.println("800-1000Rs.");
	}


}
class Test{

	public static void main(String[] args){
		
		MumbaiMarket obj1 = new TilakRoad();
		//obj1.quality();
		MumbaiMarket.quality();
		
		obj1.price();
	
		SunilsShop obj2 = new SunilsShop();
		//obj2.quality();
		MumbaiMarket.quality();
		
		obj2.price();

	}
}
