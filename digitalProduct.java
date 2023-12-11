import java.util.Scanner;
public class DigitalProduct extends Product {
  private String format;
  private String downloadLink;

  public DigitalProduct() {
    super();
    this.format = "N.A.";
    this.downloadLink = "N.A.";
  }

  public DigitalProduct(String name, double price, String sku, String format, String downloadLink) {
    super(name, price, sku);
    this.format = format;
    this.downloadLink = downloadLink;
  }

  public double calculateSalesTax() {
      double taxRate = 0.05; 
      return getPrice() * taxRate;
  }

  public void displayDetails() {
    super.displayDetails();
    System.out.println("Digital Product Format: " + getFormat());
    System.out.println("Digital Product Download Link: " + getDownloadLink());
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public String getDownloadLink() {
    return downloadLink;
  }

  public void setdownloadLink(String downloadLink) {
    this.downloadLink = downloadLink;
  }

  public void editDetails() {
      super.editDetails();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter new format: ");
      String newFormat = scanner.nextLine();
      this.setFormat(newFormat);

      System.out.println("Enter new link: ");
      String newDownloadLink = scanner.nextLine();
      this.setdownloadLink(newDownloadLink); 
  }
}