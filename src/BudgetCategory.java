public class BudgetCategory implements Comparable<BudgetCategory> {
    private String name;
    private double limit;
    private double spent;
    private double difference;

    public BudgetCategory(String name, double limit, double spent) {
        this.name = name;
        this.limit = limit;
        this.spent = spent;
        this.difference = limit - spent;
    }


    public String getName() {
        return name;
    }
    public double getLimit() {
        return limit;
    }
    public double getSpent() {
        return spent;
    }
    public double getDifference() {
        return difference;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setLimit(double limit) {
        this.limit = limit;
        this.difference = limit - this.spent;
    }
    public void setSpent(double spent) {
        this.spent = spent;
        this.difference = this.limit - spent;
    }


    @Override
    public String toString() {
        return "BudgetCategory  \nname= " + name + 
                               "\nlimit= " + limit + 
                               "\nspent= " + spent + 
                               "\ndifference= " + difference + "\n";
    }

    public int compareTo(BudgetCategory other) {
        if (this.difference > other.difference) {return 1;}
        if (this.difference < other.difference) {return -1;}
        return 0;
    }
}