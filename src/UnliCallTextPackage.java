import java.util.*;

public class UnliCallTextPackage implements UnliCallOffer {
    private static Map<String, String> packageMap = new HashMap<>();

    static {
        packageMap.put("Smart", "No unlimited calls and texts.");
        packageMap.put("Globe", "Unlimited calls and texts within the network.");
        packageMap.put("Ditto", "Unlimited calls and texts to all networks.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return packageMap.getOrDefault(telcoName, "Unknown offer");
    }

}