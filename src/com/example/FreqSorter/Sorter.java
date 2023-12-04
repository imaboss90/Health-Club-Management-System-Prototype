package com.example.FreqSorter;
import java.util.stream.Collectors;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Sorter {
  public static void main(String[] args) {
    int n = 10; // change this value to change the number of top members to display
    Map<String, Integer> visits = new HashMap<>();
    try {
      File file = new File("file.txt");
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] parts = line.split(":");
        String name = parts[0];
        int count = Integer.parseInt(parts[1].trim().split(" ")[0]);
        visits.put(name, count);
      }
      List<Map.Entry<String, Integer>> sortedVisits = visits.entrySet()
          .stream()
          .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
          .limit(n)
          .collect(Collectors.toList());

      System.out.println("Top " + n + " most frequent members:");
      for (Map.Entry<String, Integer> entry : sortedVisits) {
        System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
      }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
