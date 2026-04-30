import java.util.List;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        //comment out wavw 1 code
        /*
        BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);

        System.out.println(groceries.getName());
        System.out.println(groceries.getBudgetLimit());
        System.out.println(groceries.getActualSpend());
        System.out.println(groceries);
        */

        //create list
        List<BudgetCategory> categories = new ArrayList<>();

        
        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            //remove print statement
            // create object, add to list
            BudgetCategory bc = new BudgetCategory(category, limit, spent);
            categories.add(bc);
        }

        Collections.sort(categories, Collections.reverseOrder());

        //print after loop
        for (BudgetCategory bc : categories) 
         {
            System.out.println(bc);

        }


    for (BudgetCategory bc : categories) 
    {

    System.out.println("Difference: $" + bc.budgetDifference());
    }


    double totalDifference = 0.0;

    for (BudgetCategory bc : categories)
    {
    totalDifference += bc.budgetDifference();
    }

    double averageDifference = totalDifference / categories.size();

    System.out.println("Average over/under budget: $" + averageDifference);

}


    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 4
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
        return -1;
    }
}
