class IndexOutOfBoundDemo{
	public static void main(String[] args){
	
		int arr[] = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		System.out.println("arr[0] : "+arr[0]);
//		System.out.println("arr[3] : "+arr[3]);

		String str = "Dev";

		System.out.println("str.charAt(0) : "+str.charAt(0));
		System.out.println("str.charAt(3) : "+str.charAt(3));
	
	}

}
