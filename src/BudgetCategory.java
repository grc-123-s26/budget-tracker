public class BudgetCategory implements Comparable<BudgetCategory> {
    private String catagory;
    private double spent;
    private double limit;

    @Override
    public String toString() {
        return "BudgetCategory [catagory=" + catagory + ", spent=" + spent + ", limit=" + limit + "]";
    }

    public BudgetCategory(String catagory, double limit, double spent) {
        this.catagory = catagory;
        this.spent = spent;
        this.limit = limit;
    }

    public String getCatagory() {
        return catagory;
    }

    public double getLimit() {
        return limit;
    }
    
    public double getSpent() {
        return spent;
    }

    public int compareTo(BudgetCategory other) {
        double thisDifference = limit - spent;
        double otherDifference = other.limit - other.spent;

        if (thisDifference < otherDifference) {
            return -1;
        } else if (thisDifference > otherDifference) {
            return 1;
        } else {
            return 0;
        }
    }
}