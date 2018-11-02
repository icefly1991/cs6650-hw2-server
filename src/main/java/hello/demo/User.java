package hello.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "User")
public class User {
  @Id
//  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer userId;
  
  @Column(name = "StepCount")
  private Integer stepCounts;
  
  public Integer getUserId() {
    return userId;
  }
  
  public void setUserId(int userId) {
    this.userId = userId;
  }
  
  public void setStep(int day, int steps) {
    stepCounts = steps;
  }
  
  public void addStep(int day, int steps) {
    stepCounts = stepCounts + steps;
  }
  
  public Integer getCurrentStepCount() {
    return stepCounts;
  }
  
  public Integer getSingleStepCount(int day) {
    if (day < 1) {
      throw new IndexOutOfBoundsException("no such day in the user's record");
    }
    return stepCounts;
  }
  
//  public List<Integer> getStepCountsInRange(int startDay, int numDays) {
//    if (startDay < 1 || startDay + numDays - 1 > stepCounts.size()) {
//      throw new IndexOutOfBoundsException("the range is out of bound");
//    }
//    List<Integer> res = new ArrayList<>();
//    for (int i = 0; i < numDays; i++) {
//      res.add(startDay - 1 + i);
//    }
//    return res;
//  }
  
  
}

