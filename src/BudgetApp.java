import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<BudgetCategory> budgets = new ArrayList<>();

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();
            
            /* 
            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);
            System.out.println("The budget limit for " + category + " was: " + limitString + 
                               " but the actual spend was " + spentString);
            */
            budgets.add(new BudgetCategory(category, limit, spent));
        }
        
        //For testing
        //BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);

        //Sort and print off the list of BudgetCategorys
        Collections.sort(budgets, Collections.reverseOrder());
        for(BudgetCategory x : budgets)
        {
            System.out.println(x);
        }

        //Print off the budget difference
        System.out.println("\nYour total budget difference: $" + budgetDifference(budgets) + ".00" /*Got lazy sorry*/);
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
        int total = 0;
        for(BudgetCategory x : categories)
        {
            total += x.getDifference();
        }
        return total;
    }
}
