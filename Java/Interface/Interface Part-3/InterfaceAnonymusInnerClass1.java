class Player{

	void playerInfo(){
	
		System.out.println("Sachin Tendulkar ");

	}

}
class Batsman{

	
	public static void main(String[] args){
		Player p = new Player(){
	
				
	 
			void playerInfo(){	
				System.out.println("Virat");
			}
		
			void display(){
			
			}	
		};
		
		p.playerInfo();
		//p.display();
		
	
	}

}
