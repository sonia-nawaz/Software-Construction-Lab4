/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseManager {

    public void removeUnsafe(List<String> subjects) {
        try {
            for (String course : subjects) {
                if (course.startsWith("6.")) {
                    subjects.remove(course);
                }
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("Caught expected exception: " + e);
        }
    }

    public void removeSafe(List<String> subjects) {
        Iterator<String> iter = subjects.iterator();
        while (iter.hasNext()) {
            String course = iter.next();
            if (course.startsWith("6.")) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {
        CourseManager manager = new CourseManager();

        List<String> unsafeList = new ArrayList<>(
                List.of("6.045", "6.005", "8.03", "6.813", "14.03"));
        System.out.println("Before (unsafe attempt): " + unsafeList);
        manager.removeUnsafe(unsafeList);
        System.out.println("After unsafe attempt (list may be inconsistent): " + unsafeList);

        System.out.println();

        List<String> subjects = new ArrayList<>(
                List.of("6.045", "6.005", "8.03", "6.813", "14.03"));
        System.out.println("Before (safe removal): " + subjects);
        manager.removeSafe(subjects);
        System.out.println("After safe removal: " + subjects);
    }
}