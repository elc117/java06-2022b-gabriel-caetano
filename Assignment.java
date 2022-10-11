import java.time.LocalDate;

class Assignment {

  protected LocalDate dueDate;
  protected String description;
  protected boolean pending;
  protected LocalDate submitDate;
  
  public Assignment(LocalDate dueDate, String description) {
    this.dueDate = dueDate;
    this.description = description;
    this.submitDate = null;
    this.pending = true;
  }

  public String getDescription() {
    return this.description;
  }

  public boolean isPending() {
    return this.pending;
  }


  public void complete(LocalDate date) {
    this.submitDate = date;
    this.pending = false;
  }


  public int daysLeft() {
    return dueDate.compareTo(LocalDate.now());
  }

  private String status() {
    if (!this.pending) return "done";
    if (this.daysLeft() < 0) return "late";
    return "due in " + this.daysLeft() + " days";
  }


  public String message() {
    return "Assignment " + this.description + " is " + status();
  }

  public String toString() {
    String res = "{ dueDate='" + this.dueDate +
                "', description='" + this.description +
                "', pending='" + this.pending + 
                "', submitDate='" + this.submitDate + "'}";

    return res;
  }

}

