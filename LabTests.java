/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

public class LabTests {

    @Test
    public void testStringAndStringBuilderProduceSameResult() {
        String a = StringPerformance.buildString(50);
        String b = StringPerformance.buildStringBuilder(50);
        assertEquals(a, b);
    }

    @Test
    public void testCourseManagerRemovesCorrectSubjects() {
        List<String> subjects = new ArrayList<>(
                List.of("6.045", "6.005", "8.03", "6.813", "14.03"));
        new CourseManager().removeSafe(subjects);
        assertEquals(List.of("8.03", "14.03"), subjects);
    }

    @Test
    public void testTreasureMapUpdateAndSum() {
        Map<String, Double> treasures = new HashMap<>();
        treasures.put("beach", 25.0);
        treasures.put("palm", 50.0);
        treasures.put("cove", 75.0);

        int size = treasures.size();
        treasures.put("palm", treasures.get("palm") + size);
        assertEquals(53.0, treasures.get("palm"));

        double total = 0.0;
        for (double v : treasures.values()) total += v;
        assertEquals(153.0, total);
    }

    @Test
    public void testZooListIsUnmodifiable() {
        zoo z = new zoo();
        List<String> animals = z.getAnimals();
        assertThrows(UnsupportedOperationException.class, () -> animals.add("flamingo"));
    }
}