package Calculators;

import java.util.HashMap;
import java.util.Map;

public class FurnitureShipCalc implements ShippingCalc{

    private static double baseCost = 70;
    private static double costPerKM = 10;

    private static Map<String, Double> sizeRateMap = new HashMap<>();

    static {
        sizeRateMap.put("small", 0.7);
        sizeRateMap.put("medium", 1.0);
        sizeRateMap.put("large", 1.3);
    }

    @Override
    public double computeFlatShip(String size, double distanceKM) {
        return baseCost;
    }

    @Override
    public double computeDistanceShip(String size, double distanceKM) {
        return baseCost + distanceKM * costPerKM * sizeRateMap.get(size);
    }

    @Override
    public double computeSizeShip(String size, double distanceKM) {
     
        if (distanceKM < 10) {
            distanceKM = 0;
        } else {
            distanceKM -= 10;
        }
 
        double sizeRate = sizeRateMap.get(size);

        return baseCost + (distanceKM * costPerKM) + (100 * sizeRate * sizeRate);
    }

}
