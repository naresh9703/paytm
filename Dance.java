class Dance{
	int price=250;
	void printProdDetails(){
		System.out.println("product price = "+price+" "+"RS");
		System.out.println(this);
		
	} 
	public static void main(String args[]){
		Dance d = new Dance();
		d.printProdDetails();
		System.out.println(d);
	}
}