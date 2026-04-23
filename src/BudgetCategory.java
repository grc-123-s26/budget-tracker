public class BudgetCategory implements Comparable<BudgetCategory>{
    private String name;
    private double limit;
    private double spent; 

    public BudgetCategory(String name, double limit, double spent){
        this.name = name; 
        this.limit = limit; 
        this.spent = spent;  
    }

    public String toString(){
        return "Category = " +name + " Limit = " + limit +" Spent = "+ spent;
    }

    public int compareTo(BudgetCategory other){
        double thisDiff = this.spent - this.limit;
        double otherDiff = other.spent - other.limit;
        
        return Double.compare(thisDiff, otherDiff); 
    }
    public String getName(){
        return name; 
    }
    public double getLimit(){
        return limit;
    }
    public double getSpent(){
        return spent; 
    }
}