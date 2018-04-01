

public class Pizza
{
	private String size;
	private int numCheeseToppings;
	private int numHamToppings;
	private int numPepperoniToppings;

	// Default constructor
	public Pizza()
	{
		size = "Large";
		numCheeseToppings = 1;
		numHamToppings = 0;
		numPepperoniToppings = 0;
	}
	
	//Copy constructor
	public Pizza(Pizza original){
		if(original == null)
		{
			System.out.println("Fatal Error");
			System.exit(0);
		}
		
		size = original.size;
		numCheeseToppings = original.numCheeseToppings;
		numHamToppings = original.numHamToppings;
		numPepperoniToppings = original.numPepperoniToppings;
	   }

	//Parameterized constructor
	public Pizza(String pizzaSize, int cheese,
				 int ham, int pepperoni)
	{
		size = pizzaSize;
		numCheeseToppings = cheese;
		numHamToppings = ham;
		numPepperoniToppings = pepperoni;
	}

	//Set method to set the sizeOfPizza variable
	public void setPizzaInfo(String newSize, int cheese,
				  int ham, int pepperoni)
	{
		size = newSize;
		numCheeseToppings = cheese;
		numHamToppings = ham;
		numPepperoniToppings = pepperoni;
	}

	//Get method to get the sizeOfPizza variable
	public String getSize()
	{
		return size;
	}

	//Set method to set the noCheeseToppings variable
	public void setNumCheeseToppings(int toppings)
	{
		numCheeseToppings = toppings;
	}
	
	//Get method to get the numCheeseToppings variable
	public int getNumCheeseToppings()
	{
		return numCheeseToppings;
	}

	//Get method to get the numHamToppings variable
	public int getNumHamToppings()
	{
		return numHamToppings;
	}

	//Set method to set the numHamToppings variable
	public void setNumHamToppings(int toppings)
	{
		numHamToppings = toppings;
	}
	
	//Get method to get the numPepperoniToppings variable
	public int getNumPepperoniToppings()
	{
		return numPepperoniToppings;
	}

	//Set method to set the numPepperoniToppings variable
	public void setNumPepperoniToppings(int toppings)
	{
		numPepperoniToppings = toppings;
	}
	
	//methtod to calculate the cost
	public double calcCost()
	{
		double baseCost = 10;
		if (size.equalsIgnoreCase("Small"))
		{
			baseCost = 10;
		}
		else if (size.equalsIgnoreCase("Medium"))
		{
			baseCost = 12;
		}
		else if (size.equalsIgnoreCase("Large"))
		{
			baseCost = 14;
		}
		else
		{
			System.out.println("Error, unknown size.");
			return 0;
		}
		return baseCost +
		  (numHamToppings + numCheeseToppings +
		   numPepperoniToppings)*2;
	}

	//Method to get the size of pizza , number of toppings and the total cost
	public String getDescription()
	{
		return "Size: " + size + ", Cheese Toppings: "
				+ numCheeseToppings +
			   " Pepperoni Toppings: " + numPepperoniToppings +
			   " Ham Toppings: " + numHamToppings +
			   ". Cost: " + calcCost();
	}

} 

