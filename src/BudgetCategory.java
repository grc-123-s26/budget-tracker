/**
 * This class has 3 fields, the category which is what the
 * money is being spent on, the limit which is how much needs
 * to be paid, and the spent which is the amount of money 
 * spent on the category.
 * 
 * @author Elijah D. Rhodes
 * @version April 2026
 */
public class BudgetCategory implements Comparable<BudgetCategory>{
    private String category;
    private double limit;
    private double spent;

    //********************CONSTRUCTORS********************//
    /**
     * This constructor accepts every value and adds them to
     * the class.
     * 
     * @param category What the money is being spent on.
     * @param limit How much should be paid.
     * @param spent How much was spent on the category.
     */
    public BudgetCategory(String category, double limit, double spent)
    {
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }

    //********************METHODS********************//
    /**
     * This method returns the category.
     * @return What the money is being spent on.
     */
    public String getCategory(){return category;}

    /**
     * This method returns the limit.
     * @return The amount of money that should be paid.
     */
    public double getLimit(){return limit;}

    /**
     * This method returns the amount spent.
     * @return How much was spent on the category.
     */
    public double getSpent(){return spent;}

    /**
     * This method returns the class represented by a String format.
     * @return The string representation of the budget.
     */
    public String toString()
    {
        String limitString = String.format("$%.2f", limit);
        String spentString = String.format("$%.2f", spent);
        return "The budget limit for " + category + " was: " + limitString + " but the actual spend was " + spentString; 
    }

    /**
     * This method returns the spent subtracted by the limit, showing
     * either how much you over-paid, or how much you still owe.
     * @return The amount of money you ovepaid or still owe.
     */
    public double getDifference()
    {
        return spent - limit;
    }

    /**
     * Compares the getDifference values, making it able to sort the
     * list by the amount of money you owe / over-paid.
     * 
     * @param x The other BudgetCategory you're comparing to.
     * @return The difference between the 2 getDifference values.
     */
    public int compareTo(BudgetCategory x)
    {
        return Double.valueOf(this.getDifference()).compareTo(Double.valueOf(x.getDifference()));
    }
}