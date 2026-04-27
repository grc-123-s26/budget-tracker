public class BudgetCategory implements Comparable<BudgetCategory>{
    private String name;
    private double limit;
    private double spent;

    public BudgetCategory(String name, double limit, double spent) {
        this.name = name;
        this.limit = limit;
        this.spent = spent;
    }

    public String toString() {
        return "'" + this.name + "' category:\n" + "Limit: $" + this.limit + "\nSpent: $" + this.spent;
    }

    public String getName() {
        return this.name;
    }

    public double getLimit() {
        return this.limit;
    }

    public double getSpent() {
        return this.spent;
    }

    public double getDifference() {
        return this.limit - this.spent;
    }
    
    public int compareTo(BudgetCategory other) {
        double thisDifference = this.getDifference();
        double otherDifference = other.getDifference();

        if (thisDifference < otherDifference) {
            return -1;
        } else if (thisDifference > otherDifference) {
            return 1;
        }
        return 0;
    }
}