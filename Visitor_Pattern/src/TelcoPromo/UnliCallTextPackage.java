

import java.util.*;

public class UnliCallTextPackage implements UnliCallOffer {

	private static final Map<String, String> unliCallOfferMap = new LinkedHashMap<>() {{
	    put("Smart", "Do not offer any free calls or texts, and you will be charged per use.\n");
	    put("Globe", "Comes with unlimited calls and texts to subscribers within their network. \n\t\t\t\t\tCalls and texts to other networks are charged extra.\n");
	    put("Ditto", "Includes unlimited calls and texts to all networks within the country.\n");
	}};
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliCallText ? unliCallOfferMap.getOrDefault(telcoName, "Telco Name not Found") : "Do not offer any free calls or texts, and you will be charged per use.";
    }

    public String showUnliCallsTextOffer(TelcoSubscription telco) {
        return this.showUnliCallsTextOffer(telco.getTelcoName(), telco.isUnliCallText());
    }
}