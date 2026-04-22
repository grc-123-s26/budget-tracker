import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //BudgetCategory rent = new BudgetCategory("rent", 1400.00, 1600.00);
        List<BudgetCategory> sheet = new ArrayList<>();


        

        while(scan.hasNextLine()) {
            String category = scan.nextLine();

            double limit = scan.nextDouble();
            double spent = scan.nextDouble();


            sheet.add(new BudgetCategory(category, limit, spent)); //adds new object to your list.

            // Consume \n after spent input 
            if(scan.hasNextLine()) scan.nextLine();

            String limitString = String.format("$%.2f", limit);
            String spentString = String.format("$%.2f", spent);

        }

        Collections.sort(sheet, Collections.reverseOrder());
        System.out.println(sheet);


        //get the difference if over or under the budget.
        double diff = budgetDifference(sheet);
        System.out.println("Total over/under budget: " + diff);

        //get the average
        double avg = averageDifference(sheet);
        System.out.println("Average over/under the budget per category: " + avg);
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
    public static double budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 4
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
        double budget = 0;

        for(BudgetCategory category : categories) {
            budget += category.getDifference();
        }

        return budget;
    }


    //no longer doing the ASCII Chart, i am doing the average over/under budget.
    public static double averageDifference(List<BudgetCategory> categories) {
        double total = budgetDifference(categories);

        return total / categories.size();
    }
}
