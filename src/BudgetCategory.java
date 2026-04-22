public class BudgetCategory {
    private String category;
    private double limit;
    private double spent;

    public BudgetCategory(String category, double limit, double spent){
        this.category=category;
        this.limit=limit;
        this.spent=spent;

    }
    

    public String getCategory() {
        return category;
    }


    public double getLimit() {
        return limit;
    }


    public double getSpent() {
        return spent;
    }


    @Override
    public String toString() {

        return "BudgetCategory    category:" + category + " limit: $" + limit + " spent: $" + spent  ;
    }
    
}