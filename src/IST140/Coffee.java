package IST140;

import java.util.Scanner;

/**
 * Coffee Class used for In Class Practice
 *
 * @author smv159
 * Last updated @version 2/7/23
 */
public class Coffee {

    public boolean isIced;      //Whether Coffee is Iced or not
    public String flavor;       //Add a Flavor to Coffee
    public String cream;        //Add Cream to the Coffee
    public String size;         //Size of the Coffee
    public String roast;        //Type of Roast
    private boolean drank;      //Whether the Coffee was drank or not

    /**
     * Create a new Coffee instance.
     *
     * @param isIced
     * @param flr
     * @param crm
     * @param size
     * @param roast
     */
    public Coffee(boolean isIced,
                  String flr,
                  String crm,
                  String size,
                  String roast) {
        this.isIced = isIced;
        flavor = flr;
        cream = crm;
        this.size = size;
        this.roast = roast;
        drank = false;
    }

    //TODO: Update to add rating and "customized" outputs

    /**
     * Simulates drinking the coffee.  Updates the drank value.
     */
    public void drinkMyCoffee() {
        //Update drank variable
        drank = true;
//        drank = !drank;
        //Output to the user that we finished the coffee
        System.out.println("You finished your coffee.");
    }

    // ------------- Getter Methods ------------------
    public String getSize() { return size; }

    // ------------- Setter Methods ------------------
    public void setSize(String s) { size = s; }

    /**
     * @return  Output of the Coffee information
     */
    public String toString() {
        return "Coffee:\n" +
                (isIced ? "Iced Coffee\n" : "Hot Coffee\n") +
                "Flavor = " + flavor + "\n" +
                "Cream = " + cream + "\n" +
                "Size = " + size + "\n" +
                "Roast = " + roast + "\n" +
                (drank ? "Empty Coffee Cup\n" : "Full Coffee Cup\n") ;
    }

    // Main method to create and "interact" with the Coffee
    public static void main(String[] args) {
        //Scanner object used for input
        Scanner input = new Scanner(System.in);

        //Default flavor and cream values
        String flavor = "black";
        String cream = "no cream";

        //Check to see if they want to add Flavor or Cream
        System.out.println("Do you want to add a flavor or cream? (Enter Yes, if so.): ");
        String response = input.nextLine();

        //Check the user's response to the above question
        //Accepts 'Yes', 'yes' or 'YES'
        if (response.equalsIgnoreCase("Yes"))
        {
            //Input values
            System.out.println("Enter the flavor: ");
            flavor = input.nextLine();
            System.out.println("Enter the cream: ");
            cream = input.nextLine();
        }
        //Create new Coffee object
        Coffee coffee = new Coffee(true, flavor, cream,
                "Small", "Medium");
        //Output Coffee
        System.out.println(coffee);
        //Change size
        coffee.setSize("Large");
        //Output Coffee
        System.out.println(coffee);
        //Drink the coffee
        coffee.drinkMyCoffee();
        //Output Coffee
        System.out.println(coffee);
    }

}
