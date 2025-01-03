package redis;

public class OrderInfo {
 private String productName;
 private int amount;
 private long currentTimeMillis;

  public OrderInfo(String productName, int amount, long currentTimeMillis) {
    this.productName = productName;
    this.amount = amount;
    this.currentTimeMillis = currentTimeMillis;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public long getCurrentTimeMillis() {
    return currentTimeMillis;
  }

  public void setCurrentTimeMillis(long currentTimeMillis) {
    this.currentTimeMillis = currentTimeMillis;
  }
}
