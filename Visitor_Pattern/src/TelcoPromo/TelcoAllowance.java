
import java.util.*;

public class TelcoAllowance implements UsagePromo {

	private static Map<String, Integer> allowanceMap;

	static {
	    allowanceMap = Map.ofEntries(
	        Map.entry("Smart", 15),
	        Map.entry("Globe", 10),
	        Map.entry("Ditto", 8)
	    );
	}

    @Override
    public String showAllowance(String telcoName, double money) {
        int dataAllowance = allowanceMap.get(telcoName);
        return "Offers a data allowance of " + dataAllowance + " GB for " + money + " pesos per month";
    }

    public String showAllowance(TelcoSubscription telco) {
        return this.showAllowance(telco.getTelcoName(), telco.getPromoPrice());
    }

}