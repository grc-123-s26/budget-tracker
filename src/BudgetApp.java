import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //BudgetCategory groceries = new BudgetCategory("Groceries", 500,401);
            List<BudgetCategory> categories = new ArrayList<>();

            while(scan.hasNextLine()) {
            String category = scan.nextLine();
            double limit = scan.nextDouble();
            double spent = scan.nextDouble();

            categories.add(new BudgetCategory(category,limit, spent));

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);
            
    }
    Collections.sort(categories,Collections.reverseOrder());
    System.out.println(categories);
    for(BudgetCategory c:categories){
        System.out.println(c.getName());
    }
    int diff = budgetDifference(categories);
    System.out.println("Total difference = "+ diff);
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
        double total = 0;
        for(BudgetCategory x: categories){
            total+=(x.getSpent()-x.getLimit());
        }

        return (int) total;
    }
    
}
