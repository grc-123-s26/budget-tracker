public class BudgetCategory {
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

    public double getSpent() {
        return spent;
    }

    public double getLimit() {
        return limit;
    }

}