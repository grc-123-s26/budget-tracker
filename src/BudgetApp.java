import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class BudgetApp {
    public static void main(String[] args) {
        // BudgetCategory groceries = new BudgetCategory("Groceries", 500, 401);
        // System.out.println(groceries);

        Scanner scan = new Scanner(System.in);
        List<BudgetCategory> allCategories = new ArrayList<>();


        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            allCategories.add(new BudgetCategory(category, limit, spent));
            
        }
        Collections.sort(allCategories);

        System.out.println(allCategories);

        System.out.println();

        Collections.sort(allCategories, Collections.reverseOrder());

        System.out.println(allCategories);

        System.out.println(overPercent(allCategories));
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
        int difference = 0;
        for (BudgetCategory c : categories) {
            difference += c.getDifference();
        }
        
        return difference;
    }

    public static String overPercent(List<BudgetCategory> categories) {
        double over = 0;
        for (BudgetCategory c : categories) {
            if (c.getDifference() < 0) {
                over += 1;
            }
        }
        String percentage = over / categories.size() * 100 + "%";

        return "The percent that budget has gone over is " + percentage;
    }
}
