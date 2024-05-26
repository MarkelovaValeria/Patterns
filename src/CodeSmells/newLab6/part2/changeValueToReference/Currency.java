package CodeSmells.newLab6.part2.changeValueToReference;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    private String code;
    private static Map<String, Currency> currencyMap = new HashMap<>();

    public Currency(String code){
        this.code = code;
    }

    public static synchronized Currency getInstance(String code) {
        if (!currencyMap.containsKey(code)) {
            currencyMap.put(code, new Currency(code));
        }
        return currencyMap.get(code);
    }

    public String getCode() {
        return code;
    }
}
