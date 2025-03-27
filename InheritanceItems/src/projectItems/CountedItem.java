package projectItems;

class CountedItem extends PurchaseItem {
    private int quantity; 

    public CountedItem(String name, double unitPrice, int quantity) {
        super(name, unitPrice);     
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return getUnitPrice() * quantity;
    }

    public String toString() {
        return super.toString() + "  " + quantity + " unidades  " + getPrice() + " SR";
    }
}
