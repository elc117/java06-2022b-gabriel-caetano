import java.time.LocalDate;
import java.util.ArrayList;

public class TrackAssignments {
  public static void main(String[] args) {
    
    ArrayList<Assignment> list = new ArrayList<Assignment>();
    list.add(new GroupAssignment(LocalDate.of(2022,9,15), "jamboard", "teamMate1, teamMate2"));
    list.add(new Assignment(LocalDate.of(2022,9,22),"java01"));
    list.add(new GroupAssignment(LocalDate.of(2022,9,27), "java02", "teamMate1"));
    list.add(new GroupAssignment(LocalDate.of(2022,10,13), "java06", "teamMate1"));


    System.out.println("\n==> Printing all assignment **OBJECTS**:");
    for (Assignment item : list) {
      System.out.println(item);
    }

    System.out.println("\n==> Printing all assignment **MESSAGES**:");
    for (Assignment item : list) {
      System.out.println(item.message());
    }
    
    for (Assignment item : list) {
      if (item.getDescription() == "jamboard") {
        item.complete(LocalDate.now());
      }
    }

    System.out.println("\n==> Printing all assignment messages **AGAIN**:");
    for (Assignment item : list) {
      System.out.println(item.message());
    }

    // COMPLETE-ME: count completed assignments
    long doneAssignments = countDone(list);
    System.out.println("Done assignments: " + doneAssignments);
  }

  private static long countDone(ArrayList<Assignment> list) {
    return list.stream().filter((Assignment item) -> !item.isPending()).count();
  }
}