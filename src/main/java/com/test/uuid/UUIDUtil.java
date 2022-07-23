package com.test.uuid;
import java.util.UUID;
/**
 * @author: mjt
 * time:2021-09-01
 * desription:
 */
public class UUIDUtil {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            System.out.println(getUuid());
        }

    }
    public static String getUuid(){
        UUID randomUUID = UUID.randomUUID();
        long mostSignificantBits = randomUUID.getMostSignificantBits();
        long leastSignificantBits = randomUUID.getLeastSignificantBits();
        String uuid = ConverUtils.numToHexStr(mostSignificantBits, 8) + ConverUtils.numToHexStr(leastSignificantBits, 8);
        return uuid;
    }
}