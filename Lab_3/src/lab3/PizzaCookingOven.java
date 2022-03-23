package lab3;

public class PizzaCookingOven {
	
	private String pizzaType;

	private String pizzaSize;
	
	public PizzaCookingOven() {
		pizzaType = "DOUBLECHEESE";
		pizzaSize = "S";
	}

	public PizzaCookingOven(String pizzaType, String pizzaSize) {
		if(pizzaType.equals("DOUBLECHEESE") || pizzaType.equals("VEGGIE") || pizzaType.equals("PEPPERONI")) {
			this.pizzaType = pizzaType; 
		}
		else {
			throw new IllegalArgumentException("Pizza type is not one of the following choices DOUBLECHEESE , VEGGIE or PEPPERONI");
		}
		if(pizzaSize.equals("S") || pizzaSize.equals("M") || pizzaSize.equals("L") || pizzaSize.equals("XL") || pizzaSize.equals("XXL")) {
			this.pizzaSize = pizzaSize; 
		}
		else {
			throw new IllegalArgumentException("Pizza size is not one of the following choices S, M,L , XL or XXL.");
		}
	}

	public PizzaCookingOven(PizzaCookingOven otherOrder) {
		this(otherOrder.pizzaType, otherOrder.pizzaSize);
	}

	private void set(String newPizzaType, String newPizzaSize) {
		if(pizzaType.equals("DOUBLECHEESE") || pizzaType.equals("VEGGIE") || pizzaType.equals("PEPPERONI")) {
			this.pizzaType = newPizzaType; 
		}
		else {
			throw new IllegalArgumentException("Pizza type is not one of the following choices DOUBLECHEESE , VEGGIE or PEPPERONI");
		}
		if(pizzaSize.equals("S") || pizzaSize.equals("M") || pizzaSize.equals("L") || pizzaSize.equals("XL") || pizzaSize.equals("XXL")) {
			this.pizzaSize = newPizzaSize; 
		}
		else {
			throw new IllegalArgumentException("Pizza size is not one of the following choices S, M,L , XL or XXL.");
		}
	}

	public void setPizzaType(String newPizzaType) {
		if(pizzaType.equals("DOUBLECHEESE") || pizzaType.equals("VEGGIE") || pizzaType.equals("PEPPERONI")) {
			this.pizzaType = newPizzaType; 
		}
		else {
			throw new IllegalArgumentException("Pizza type is not one of the following choices DOUBLECHEESE , VEGGIE or PEPPERONI");
		}
	}

	public void setPizzaSize(String newPizzaSize) {
		if(pizzaSize.equals("S") || pizzaSize.equals("M") || pizzaSize.equals("L") || pizzaSize.equals("XL") || pizzaSize.equals("XXL")) {
			this.pizzaSize = newPizzaSize; 
		}
		else {
			throw new IllegalArgumentException("Pizza size is not one of the following choices S, M,L , XL or XXL.");
		}
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public String getPizzaSize() {
		return pizzaSize;
	}

	double typeTime;
	
	double sizeTime;
	
	int cook_time;
	
	public int pizzaCookTime() {
		
		if(this.pizzaType.equals("DOUBLECHEESE")) {
			typeTime = 5;
		}
		else if (this.pizzaType.equals("VEGGIE")) {
			typeTime = 7;
		}
		else if (this.pizzaType.equals("PEPPERONI")) {
			typeTime = 9;
		}
		
		if(this.pizzaSize.equals("S")) {
			sizeTime = 2;
		}
		else if(this.pizzaSize.equals("M")) {
			sizeTime = 2.45;
		}
		else if(this.pizzaSize.equals("L")) {
			sizeTime = 4.5;
		}
		else if(this.pizzaSize.equals("XL")) {
			sizeTime = 6;
		}
		else if(this.pizzaSize.equals("XXL")) {
			sizeTime = 8.5;
		}
		
		int x = (int) (2 + typeTime + sizeTime * 2.5);
		cook_time = (int) (Math.floor(x));
		return cook_time;
	}

	@Override
	public String toString() {
		String str = "Pizza Cooking Order for (" + pizzaType + ", " + pizzaSize + ") and cooking time is " + pizzaCookTime() + " minutes";
		return str;
	}

}