/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zoo {

    private List<String> animals = new ArrayList<>(List.of("lion", "tiger", "bear"));

    public List<String> getAnimals() {
        return Collections.unmodifiableList(animals);
    }

    public static void main(String[] args) {
        zoo zoo = new zoo();
        List<String> readOnlyAnimals = zoo.getAnimals();

        System.out.println("Read-only animals: " + readOnlyAnimals);

        try {
            readOnlyAnimals.add("flamingo");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught expected exception: " + e);
        }

        System.out.println("List unchanged: " + readOnlyAnimals);
    }
}
