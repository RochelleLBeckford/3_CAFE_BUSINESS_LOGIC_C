import java.util.ArrayList;

/**
 * CafeUtil
 * ? Methods all go here
 */
public class CafeUtil {
/**
 * @param Weeks
 * @return
 */

    //? 1st part -> int getStreakGoal
    public int getStreakGoal() {
        int sum = 0;
        // adding up th rewards so far
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        return sum; 
    }


    //? Part b -> Ninja Bonus -> add numsWeek as param 
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        // adding up th rewards so far
        for (int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum; 
    }


    //? 2nd part -> double getOrderTotal(double[]prices)
    public double getOrderTotal(double[]prices) {
        double sum = 0;
        // iterate through prices in array 
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }


    //? void displayMenu(ArrayList<String>menuitems)
    public void displayMenu(ArrayList<String>menuItems) {
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.printf("Index: %d, Menu Item: %s %n", i, menuItems.get(i));
        }
    }

    //? addCustomer(ArrayList<String>customers)
    // public String message () {
    //     return "Please enter your name:";
    // }
    public ArrayList<String> addCustomer(ArrayList<String> customers) {
        //? Part a -> print this string to console
        // System.out.println("Please enter your name: ");

        //? Part b -> get user input from the terminal and store it in the variable
        String userName = System.console().readLine("Please enter your name: ");
        
        //? Part c -> print username to concole -> "Hello, "[username here]
        System.out.printf("Hello, %s %n", userName);
        
        //? part d -> there are _ ppl in front of you
        System.out.printf("There are %d people in front of you ", customers.size());
        
        //? part e -> add customer name to given customers list -> print list
        customers.add(userName);
        // customers.add("Dominic");
        // customers.add("Tyler");
        // System.out.println(customers);
        return customers;
    }
}