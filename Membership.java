public class Membership implements ITaxable {
  private String type;
  private double cost;

  public Membership(String type, double cost) {
    this.type = type;
    this.cost = cost;
  }

  public String getType() {
    return type;
  }

  public void setType(String type){
    this.type = type;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost){
    this.cost = cost;
  }

  public double calculateSaleTax() {
  double taxPercentage = 0.05; 
  return this.cost * taxPercentage;
  }
}