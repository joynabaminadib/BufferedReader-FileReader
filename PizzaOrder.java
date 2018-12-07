
import java.util.Scanner;
import java.text.DecimalFormat;
public class PizzaOrder
	{
		public static void main (String [] args)
		{
			//TASK #5 Create a DecimalFormat object with 2 decimal places
					
			//Create a Scanner object to read input
			Scanner keyboard = new Scanner (System.in);
			
			String firstName;					//user's first name
			boolean discount;		//flag, true if user is eligible for discount
			int inches;							//size of the pizza
			int crustType;					//code for type of crust
			String crust; //name of crust
			double cost;				//cost of the pizza
			final double TAX_RATE = .08;	//sales tax rate
			double tax;							//amount of tax
			char choice;						//user's choice
			String input;						//user input
			String toppings = "Cheese ";	//list of toppings	
			int numberOfToppings = 0;		//number of toppings
			
			//prompt user and get first name
			System.out.println("Welcome to Mike and Diane's Pizza");
			System.out.print("Enter your first name:  ");
			firstName = keyboard.nextLine();
			
			//determine if user is eligible for discount by
			//having the same first name as one of the owners
			//ADD LINES HERE FOR TASK #1
			
			if (firstName.equalsIgnoreCase("Mike") 
					|| firstName.equalsIgnoreCase("Diane") ) 
					discount = true;
					else
					discount = false;
			
			//prompt user and get pizza size choice
			System.out.println("Pizza Size (inches)   Cost");
			System.out.println("        10            $10.99");
			System.out.println("        12            $12.99");
			System.out.println("        14            $14.99");
			System.out.println("        16            $16.99");
			System.out.println("What size pizza would you like?");
			inches = keyboard.nextInt();
			//set price and size of pizza ordered
			//ADD LINES HERE FOR TASK #2
			if (inches == 10 )
			cost = 10.99; 
			else if (inches == 12)
			cost = 12.99;
			else if (inches == 14)
			cost = 14.99;
			else if (inches == 16)
			cost = 16.99;
			else {
			System.out.println("The number you have entered did not match with any of the choices, so your pizza size will be set to 12 inches. " );
			inches = 12;
			cost = 12.99;
			}
			//consume the remaining newline character
			keyboard.nextLine();	
			
			//prompt user and get crust choice
			System.out.println("What type of crust do you want? ");
			System.out.print("(1)Hand-tossed, (2) Thin-crust, or " +
				"(3) Deep-dish (enter 1, 2, or 3): ");
			input = keyboard.nextLine();
			crustType = input.hashCode();
		
			//set user's crust choice on pizza ordered
			//ADD LINES FOR TASK #3
			int type = 3;
			switch (crustType) {
			case 1 : crustType = 1 ;
					crust = "Hand-tossed";
					break;
			case 2 : crustType = 2 ;
					crust = "Thin-crust";
					break;
			case 3 : crustType = 3 ;
					crust = "Deep-dish";
					break;
			/*case 4 : crustType = 4 ;
			        crust = "Hand-tossed";
			        break;
			case 5 : crustType = 5 ;
			        crust =  "Thin-crust";
			        break;
			case 6 : crustType = 'd' ;
					crust = "Deep-dish";
					break;*/
		    default : System.out.println("Your input did not match with any of the choices, so a Hand-tossed crust will be made");
		    crust = "Hand-tossed";
			}
									
			//prompt user and get topping choices one at a time					
			System.out.println("All pizzas come with cheese."); 
			System.out.println("Additional toppings are $1.25 each,"
					+" choose from");
			System.out.println("Pepperoni, Sausage, Onion, Mushroom");
		
			//if topping is desired, 
			//add to topping list and number of toppings
			System.out.print("Do you want Pepperoni?  (Y/N):  ");
			input = keyboard.nextLine();
			choice = input.charAt(0);
			if (choice == 'Y' || choice == 'y')
			{
				numberOfToppings += 1;
				toppings = toppings + "Pepperoni ";
			}
			System.out.print("Do you want Sausage?  (Y/N):  ");
			input = keyboard.nextLine();
			choice = input.charAt(0);
			if (choice == 'Y' || choice == 'y')
			{
				numberOfToppings += 1;
				toppings = toppings + "Sausage ";
			}
			System.out.print("Do you want Onion?  (Y/N):  ");
			input = keyboard.nextLine();
			choice = input.charAt(0);
			if (choice == 'Y' || choice == 'y')
			{
				numberOfToppings += 1;
				toppings = toppings + "Onion ";
			}
			System.out.print("Do you want Mushroom?  (Y/N):  ");
			input = keyboard.nextLine();
			choice = input.charAt(0);
			if (choice == 'Y' || choice == 'y')
			{
				numberOfToppings += 1;
				toppings = toppings + "Mushroom ";
			}

			//add additional toppings cost to cost of pizza
			cost = cost + (1.25*numberOfToppings);
			
			//display order confirmation
			System.out.println();
			System.out.println("Your order is as follows: ");
			System.out.println(inches + " inch pizza");
			System.out.println(crust + " crust");
			System.out.println(toppings);		
			
			//apply discount if user is eligible
			//ADD LINES FOR TASK #4 HERE
			if ( discount == true )
				System.out.println("You are eligible for a $2.00 discount" );
				else
				System.out.println("You are not eligible for a $2.00 discount" );
			//EDIT PROGRAM FOR TASK #5
			//SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
			System.out.println("The cost of your order is: $" + cost);
				
			//calculate and display tax and total cost
			cost = (cost) + (numberOfToppings * 1.25);
			if (discount == true )
			cost = cost - 2; 
			else
			cost = cost;  
			
			tax = cost * TAX_RATE;
			System.out.println("The tax is:  $" + tax);
			System.out.println("The total due is:  $" + (tax+cost));
			
			System.out.println("Your order will be ready for pickup in 30 minutes.");
		}	
	}