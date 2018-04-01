

public class PizzaOrder
{
	private Pizza pizza1, pizza2, pizza3;
	private int numPizzas;

	//Default constructor
	public PizzaOrder()
	{
		numPizzas = 0;
		pizza1 = null;
		pizza2 = null;
		pizza3 = null;
	}
	
	//Copy constructor
	public PizzaOrder(PizzaOrder original)
	{
		if(original == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		
		numPizzas = original.numPizzas;
		pizza1 = new Pizza(original.pizza1);
		pizza2 = new Pizza(original.pizza2);
		
	}
	
	//Set method to set the noOfPizza variable
	public void setNumPizzas(int num)
	{
		numPizzas = num;
	}

	//Set method to set the pizza1 object
	public void setPizza1(Pizza pizza)
	{
		pizza1 = pizza;
	}

	//Set method to set the pizza2 object
	public void setPizza2(Pizza pizza)
	{
		pizza2 = pizza;
	}

	//Get method to get the pizza1 object
	public Pizza getPizza1() {
		return pizza1;
	}

	//Get method to get the pizza2 object
	public Pizza getPizza2() {
		return pizza2;
	}

	//Get method to get the pizza3 object
	public Pizza getPizza3() {
		return pizza3;
	}


	//Get method to get the numPizzas value
	public int getNumPizzas() {
		return numPizzas;
	}

	//Set method to set the pizza3 object
	public void setPizza3(Pizza pizza)
	{
		pizza3 = pizza;
	}

	//Method to calculate the total cost of the order based on the number of order
	public double calcTotal()
	{
		double total = 0;
		if (numPizzas >= 1)
			total += pizza1.calcCost();
		if (numPizzas >= 2)
			total += pizza2.calcCost();
		if (numPizzas >= 3)
			total += pizza3.calcCost();
		return total;
	}

	//Main method to test the PizzaOrder class
	public static void main(String[] args)
	{
		// Creating a large pizza, 1 cheese, 1 ham Pizza
		 Pizza pizza1 = new Pizza("large", 1,0,1);
		 
		//Creating medium pizza, 2 cheese, 2 pepperoni
	     Pizza pizza2 = new Pizza("medium", 2,2,0);
	     
      //Creating object of PizzaOrder
	     PizzaOrder order1 = new PizzaOrder();
	     
	   //set the no of pizza and set the pizza objects
	     order1.setNumPizzas(2);
	     order1.setPizza1(pizza1);
	     order1.setPizza2(pizza2);
	   
	    //call the calcTotal method to get the total cost of the order
	     double total = order1.calcTotal();
	     System.out.println("Total cost of the order is : " +total);
		
	     //calling the copy constructor
		PizzaOrder order2 = new PizzaOrder(order1);
		order2.getPizza1().setNumCheeseToppings(3);
		
		//call the calcTotal method to get the total cost of the order
		double total1 = order2.calcTotal();
		System.out.println("The order total is " + total1);
		
		double origTotal = order1.calcTotal();
		System.out.println("This should be same as total is " + origTotal);
	}
} 
