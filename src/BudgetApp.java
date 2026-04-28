import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<BudgetCategory> categories = new ArrayList<>();
        

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();
            
            BudgetCategory category = new BudgetCategory(name, limit, spent);
            category.getLimit();
            categories.add(category);

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

        }
        Collections.sort(categories);
        for (BudgetCategory category : categories) {
            System.out.println(category.toString() + "\n" + budgetDifferencePercentageString(category));
        }
        int difference = budgetDifference(categories);
        System.out.println("Total difference is " + difference);
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
        int totalDifference = 0;
        for (BudgetCategory category : categories) {
            totalDifference += category.getDifference();
        }
        return totalDifference;
    }
}
