/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
package CollectionPackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentDirectory {

    private final Map<Integer, String> students;

    public StudentDirectory() {
        this.students = new HashMap<>();
    }

    // Method to add a student
    public void addStudent(int id, String name) {
        students.put(id, name);
    }

    // Homework 1 Task: Returns key set wrapped with Collections.unmodifiableSet()
    public Set<Integer> getAllIDs() {
        return Collections.unmodifiableSet(students.keySet());
    }

    // Main method to test the functionality directly
    public static void main(String[] args) {
        System.out.println("--- Testing Homework 1 ---");
        StudentDirectory directory = new StudentDirectory();
        directory.addStudent(101, "Alice");
        directory.addStudent(102, "Bob");

        Set<Integer> ids = directory.getAllIDs();
        System.out.println("Student IDs: " + ids);

        // Verify that modifying the set throws an exception
        try {
            System.out.println("Attempting to modify the returned Set...");
            ids.add(103);
        } catch (UnsupportedOperationException e) {
            System.out.println("Success! Caught expected exception: " + e.getClass().getName());
        }
    }
}
