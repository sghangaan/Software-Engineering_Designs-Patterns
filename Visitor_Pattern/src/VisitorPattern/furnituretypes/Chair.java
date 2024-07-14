package furnituretypes;

import Calculators.*;

public class Chair implements Furniture{
    private String prodName;
    private String size;

    public Chair(String prodName, String size) {
        this.prodName = prodName;
        this.size = size;
    }    
    
    @Override
    public String toString() {
        return "Product: " + prodName + ", (Size: " + size + ")";
    }

    @Override
    public double accept(ShippingCalc shipCalc, String size, double distanceKM) {
        return shipCalc.computeFlatShip(size, distanceKM);
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
