
public class Customer {
	Dominos orderPizza;
	public void eat(){
		System.out.println("eat!");
	}
	public Customer() {
		// TODO Auto-generated constructor stub
		System.out.println("I am a customer, I will order a pizza");
		orderPizza=new Dominos();
		eat();
	}

}
