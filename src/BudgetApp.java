import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<BudgetCategory> tracker = new ArrayList<>();
        /*BudgetCategory concerts = new BudgetCategory("Concerts", 200.0, 400.0);
        System.out.println(concerts);
        System.out.println(concerts.getName());
        System.out.println(concerts.getLimit());
        System.out.println(concerts.getSpent());*/

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();
            tracker.add(new BudgetCategory(category, limit, spent));
            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);
            /*System.out.println("The budget limit for " + category + " was: " + limitString + 
                               " but the actual spend was " + spentString);*/
        }
        for(int i=0; i<tracker.size(); i++){
            System.out.println(tracker.get(i));
        }

        Collections.sort(tracker);
        System.out.println(tracker);
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
