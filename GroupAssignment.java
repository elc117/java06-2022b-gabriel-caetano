import java.time.LocalDate;

class GroupAssignment extends Assignment {
  private String teamMates;

  public String message() {
    return "Group Assignment " + this.description + " is " + this.status() + " call " + this.teamMates;    
  }

  public GroupAssignment(LocalDate dueDate, String description, String teamMates) {
    super(dueDate, description);
    this.teamMates = teamMates;
  } 
}