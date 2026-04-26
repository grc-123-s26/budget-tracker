public class BudgetCategory  implements Comparable<BudgetCategory>{
    private String category;
    private double limit;
    private double spent;

    public BudgetCategory(String category, double limit, double spent){
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }

    public String getCategory(){ return category;}
    public double getLimit(){return limit;}
    public double getSpent(){return spent;}

    public String toString(){
        String limitString = String.format("$%.2f", limit);
        String spentString = String.format("$%.2f", spent);
        return "The budget limit for " + category + " was: " + limitString + 
                               " but the actual spend was " + spentString;
    }

    public double getDifference(){
        return limit - spent;
    }

    public int compareTo(BudgetCategory other){
        return Double.valueOf(getDifference()).compareTo(other.getDifference());
    }
}