public class BudgetCategory {
    private String name;
    private double limit;
    private double spent;

    public BudgetCategory(String name, double limit, double spent){
        this.name = name;
        this.limit = limit;
        this.spent = spent;
    }

    public String getName(){
        return name;
    }

    public Double getLimit(){
        return limit;
    }

    public Double getSpent(){
        return spent;
    }

    public String toString(){
        return "The budget limit for " + name + " was: $" + limit + " but the actual spent was $" + spent;
    }

    
}