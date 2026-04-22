public class BudgetCategory {
    private String product; 
    private double expectedCost;
    private double trueCost; 

    public BudgetCategory(String product, double expected, double actual) {
        this.product = product; 
        this.expectedCost = expected;
        this.trueCost = actual; 
    }

    public String getProduct() {
        return this.product; 
    }

    public double getExpectedCost() {
        return this.expectedCost; 
    }

    public double getTrueCost() {
        return this.trueCost; 
    }

    @Override
    public String toString() {
        return "BudgetCategory [product=" + product + ", expectedCost=" + expectedCost + ", trueCost=" + trueCost + "]";
    }    
}