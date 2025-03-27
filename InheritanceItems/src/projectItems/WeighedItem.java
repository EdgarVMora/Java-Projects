package projectItems;

class WeighedItem extends PurchaseItem {
    private double weight;  

    public WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice); 
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return getUnitPrice() * weight;
    }

    public String toString() {
        return super.toString() + "  " + weight + "Kg  " + getPrice() + " SR";
    }
}
