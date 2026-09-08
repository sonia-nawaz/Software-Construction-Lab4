/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
import java.util.HashMap;
import java.util.Map;

public class TreasureMap {

    public static void main(String[] args) {
        Map<String, Double> treasures = new HashMap<>();
        treasures.put("beach", 25.0);
        treasures.put("palm", 50.0);
        treasures.put("cove", 75.0);

        System.out.println("Initial map: " + treasures);

        int mapSize = treasures.size();
        double updatedPalm = treasures.get("palm") + mapSize;
        treasures.put("palm", updatedPalm);

        System.out.println("Map size at update time: " + mapSize);
        System.out.println("Updated map: " + treasures);

        double total = 0.0;
        for (double value : treasures.values()) {
            total += value;
        }

        System.out.println("Total sum of all treasure values: " + total);
    }
}