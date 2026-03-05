import java.util.*;

public class TelcoAllowance implements UsagePromo {
    
    private static Map<String, Integer> allowanceMap = new HashMap<>();

        static {
            allowanceMap.put("Smart", 15);
            allowanceMap.put("Globe", 10);
            allowanceMap.put("Ditto", 8);
        }

    @Override
    public String showAllowance(String telcoName, double money) {
        return allowanceMap.get(telcoName) + " GB for ₱"+ money;
    }
}