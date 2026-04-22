/**
 * This class has 3 fields, the category which is what the
 * money is being spent on, the limit which is how much needs
 * to be payed, and the spent which is the amount of money 
 * spent on the category.
 * 
 * @author Elijah D. Rhodes
 * @version April 2026
 */
public class BudgetCategory implements Comparable<BudgetCategory>{
    private String category;
    private double limit;
    private double spent;

    public BudgetCategory(String category, double limit, double spent)
    {
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }

    public String getCategory(){return category;}
    public double getLimit(){return limit;}
    public double getSpent(){return spent;}

    public String toString()
    {
        String limitString = String.format("$%.2f", limit);
        String spentString = String.format("$%.2f", spent);
        return "The budget limit for " + category + " was: " + limitString + " but the actual spend was " + spentString; 
    }

    public double getDifference()
    {
        return spent - limit;
    }

    public int compareTo(BudgetCategory x)
    {
        return Double.valueOf(this.getDifference()).compareTo(Double.valueOf(x.getDifference()));
    }
}