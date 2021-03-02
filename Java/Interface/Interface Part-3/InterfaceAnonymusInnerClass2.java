interface Player{

	void playerInfo();
}
class Batsman{

	
	public static void main(String[] args){
		Player p = new Player(){
	
				
	 
			public void playerInfo(){	
				System.out.println("Virat");
			}
		
			
	
		};
		
		Player p1  = new Player(){
		
			public void playerInfo(){
			
				System.out.println("Sachin");
			}

		};

		p.playerInfo();
		p1.playerInfo();
		//p.display();
		
	
	}

}
