public class CoffeeKlatsch {

    public static void main(String[] args) {

        // Declare a reference to a CoffeeMachine.
        // Create a new CoffeeMachine and make the variable refer to it.
        CoffeeMachine machine = new CoffeeMachine();
      
        // Add water and beans to the CoffeeMachine.
        machine.addBeans();
        machine.addWater();
    
        // Get ready to grind some strong coffee in the CoffeeMachine.
        machine.setStrength("Strong");

        // Grind the beans.
        machine.grindBeans();
       
        // Declare a reference to a CoffeeCup.
        // Create a new CoffeeCup and make the variable refer to it.
        CoffeeCup cup = new CoffeeCup();
       
        // Have your CoffeeMachine brew coffee into the coffee cup.
        machine.brew(cup);
        
        // Drink from the cup.
        cup.drink();
   
        // Try to drink again --the cup is now empty.
        cup.drink();
       
        // Declare ANOTHER coffee cup reference and initialize it.
        CoffeeCup cup2 = new CoffeeCup();
	
        // Brew coffee into the new cup.
        machine.brew(cup2);
     
        // Try to drink from the first cup --it's still empty!
        cup.drink();
        
        // Drink from the second cup.
        cup2.drink();
      
        // Print a sigh of satisfaction.
        System.out.println("AHHHH");
	
    }
}