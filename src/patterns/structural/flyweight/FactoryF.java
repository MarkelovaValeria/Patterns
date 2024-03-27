package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryF {
    private static Map<String,CommonCharacteristic> map = new HashMap<>();

    public static CommonCharacteristic getCharacteristic(int damage, int level){
        String key = damage + "_" + level;
        if(!map.containsKey(key)){
            map.put(key, new CommonCharacteristic(damage,level));
        }
        return map.get(key);
    }
}
