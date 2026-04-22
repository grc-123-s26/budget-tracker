import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<BudgetCategory> budgetSheet = new ArrayList<>(); 

        // BudgetCategory rent = new BudgetCategory("Rent", 1400.00, 1300.00); 

        // System.out.println(rent.getProduct());
        // System.out.println(rent.getTrueCost());
        // System.out.println(rent.getExpectedCost());
        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            budgetSheet.add(new BudgetCategory(category, limit, spent));

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);
        }

        Collections.sort(budgetSheet, Collections.reverseOrder());

        System.out.println(budgetSheet);
        System.out.println(budgetDifference(budgetSheet)); 
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
        int sum = 0; 

        for (BudgetCategory category : categories) {
            sum += category.getDifference(); 
        }
        return sum; 
    }
}
