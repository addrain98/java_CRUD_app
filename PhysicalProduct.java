import java.util.Scanner;
public class PhysicalProduct extends Product {
  private String size;
  private double weight;
  private String color;

  public PhysicalProduct() {
    super();
    this.size = "NA";
    this.weight = 0.0;
    this.color = "NA";
  }

  public PhysicalProduct(String name, double price, String sku, String size, double weight, String color) {
    super(name, price, sku);
    this.size = size;
    this.weight = weight;
    this.color = color;
  }

  public void displayDetails() {
    super.displayDetails();
    System.out.println("Product Size: " + getSize());
    System.out.println("Product Weight: $" + getWeight());
    System.out.println("Product Color: " + getColor());
  }

  public double calculateSalesTax() {
      double taxRate = 0.09;
      return getPrice() * taxRate;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void editDetails() {
    super.editDetails();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter new size: ");
    String newSize = scanner.nextLine();
    this.setSize(newSize);

    System.out.println("Enter new weight: ");
    double newWeight = scanner.nextDouble();
    this.setWeight(newWeight);

    System.out.println("Enter new color: ");
    String newColor = scanner.nextLine();
    this.setColor(newColor);
  }

}