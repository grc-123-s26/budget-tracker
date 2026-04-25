import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<BudgetCategory> categories = new ArrayList<>();
        //BudgetCategory fastFood = new BudgetCategory("fastFood", 100, 300);
        //System.out.println(fastFood);

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            BudgetCategory budgetCategory = new BudgetCategory(category, limit, spent);
            categories.add(budgetCategory);
            //String limitString = String.format("$%.2f", limit);
            //String spentString = String.format("$%.2f", spent);
            //System.out.println("The budget limit for " + category + " was: " + limitString + " but the actual spend was " + spentString);
        }

        Collections.sort(categories, Collections.reverseOrder());
        System.out.println(categories);

        int difference = budgetDifference(categories);
        System.out.println("Total difference: " + difference);

        double average = averageDifference(categories);
        System.out.println("Average difference: " + average);
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
        int total = 0;

        for (BudgetCategory category : categories) {
            total += category.getSpent() - category.getLimit();
        }
        return total;
    }

    public static int averageDifference(List<BudgetCategory> categories) {
        return (int) budgetDifference(categories) / categories.size();
    }
}
