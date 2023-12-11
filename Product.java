import java.util.Scanner;
public abstract class Product implements ITaxable {
  private String name;
  private double price;
  private String sku;

  public Product() {
    this.name = "N/A";
    this.price = 0.0;
    this.sku = "N/A";
  }

  public Product (String name, double price, String sku){
    this.name = name;
    this.price = price;
    this.sku = sku;
    
  }

  public double calculateSaleTax() {
      double taxRate = 0.1;
      return price * taxRate;
  }

  public void displayDetails() {
    System.out.println("Product Name: " + getName());
    System.out.println("Product Price: $" + getPrice());
    System.out.println("Product SKU: " + getSku());
  }

    
  public String getName() {
    return name;
  }

  public void setName(String name) throws IllegalArgumentException{
    if (name != null && !name.isEmpty()){
      this.name = name;
    }
    else {
      throw new IllegalArgumentException("Invalid Name. Please enter a valid name or leave this empty.");
    }
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) throws IllegalArgumentException   {
    if (price >=0) {
      this.price = price;
    }
    else {
      throw new IllegalArgumentException("Invalid input. Please provide a valid input.");
    }
  }

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) throws IllegalArgumentException {
    if (sku != null && !sku.isEmpty()) {
      this.sku = sku;
    }
    else {
      throw new IllegalArgumentException("Invalid SKU. Please do not leave this blank");
    }
  }

  public void editDetails() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter new product name: ");
    String newName = scanner.nextLine();
    this.setName(newName);
    
    System.out.println("Enter new price: ");
    double newPrice = scanner.nextDouble();
    scanner.nextLine();
    this.setPrice(newPrice);

    System.out.println("Enter new SKU: ");
    String newSku = scanner.nextLine();
    this.setSku(newSku);
  }

}