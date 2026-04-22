public class BudgetCategory {
    private String name;
    private double limit;
    private double spent;

    public BudgetCategory(String name, double limit, double spent) {
        this.name = name;
        this.limit = limit;
        this.spent = spent;
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
    
}