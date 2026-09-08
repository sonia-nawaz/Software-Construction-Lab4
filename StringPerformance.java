/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COMPUTER CORNER
 */public class StringPerformance {

    public static String buildString(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + i;
        }
        return s;
    }

    public static String buildStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 10000;

        long start1 = System.nanoTime();
        buildString(n);
        long end1 = System.nanoTime();
        double stringTimeMs = (end1 - start1) / 1_000_000.0;

        long start2 = System.nanoTime();
        buildStringBuilder(n);
        long end2 = System.nanoTime();
        double sbTimeMs = (end2 - start2) / 1_000_000.0;

        System.out.println("n = " + n);
        System.out.println("String concatenation time:      " + stringTimeMs + " ms");
        System.out.println("StringBuilder.append() time:    " + sbTimeMs + " ms");
        System.out.println("StringBuilder was approximately "
                + String.format("%.2f", stringTimeMs / sbTimeMs) + "x faster");
    }
}