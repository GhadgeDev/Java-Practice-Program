interface x{

	void xyz();
	static public void display(){
		System.out.println("Hello");
	}
}

class y implements x{

	public void xyz(){

	}
	public static void main(String[] args){
		x xobj;
		x.display();
	}

}
