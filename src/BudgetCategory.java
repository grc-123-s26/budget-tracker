public class BudgetCategory implements Comparable<BudgetCategory> {
    
    // instance variables
    private String name;
    private double budgetLimit;
    private double actualSpend;

    // constructor
    public BudgetCategory(String name, double budgetLimit, double actualSpend) {
        this.name = name;
        this.budgetLimit = budgetLimit;
        this.actualSpend = actualSpend;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getBudgetLimit() {
        return budgetLimit;
    }

    public double getActualSpend() {
        return actualSpend;
    }

    // toString method
    public String toString() {
        return "The budget limit for " + name + " was: $" + budgetLimit +
               " but the actual spend was $" + actualSpend;
    }


    public int compareTo(BudgetCategory other) 
    {
        double thisDiff = this.actualSpend - this.budgetLimit;
        double otherDiff = other.actualSpend - other.budgetLimit;

        return Double.compare(thisDiff, otherDiff);
    }

    public double budgetDifference() 
    {
    return actualSpend - budgetLimit;
    
    }
}