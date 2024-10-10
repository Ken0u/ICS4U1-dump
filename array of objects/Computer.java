public class Computer {
   private int serialNum;
   private String manufacturer;
   private int yearMade;
   private int yearPurchased;
   private double processorSpeed;
   private int ramSize;
   private int yearExpiry;
  
   public Computer(int serialNum, String manufacturer, int yearMade, int yearPurchased, double processorSpeed, int ramSize, int yearExpiry) {
      this.serialNum = serialNum;
      this.manufacturer = manufacturer;
      this.yearMade = yearMade;
      this.yearPurchased = yearPurchased;
      this.processorSpeed = processorSpeed;
      this.ramSize = ramSize;
      this.yearExpiry = yearExpiry;
   }

   public void setSerialNum(int serialNum) {
      this.serialNum = serialNum;
   }

   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }

   public void setYearMade(int yearMade) {
      this.yearMade = yearMade;
   }

   public void setYearPurchased(int yearPurchased) {
      this.yearPurchased = yearPurchased;
   }

   public void setProcessorSpeed(double processorSpeed) {
      this.processorSpeed = processorSpeed;
   }

   public void setRamSize(int ramSize) {
      this.ramSize = ramSize;
   }

   public void setYearExpiry(int yearExpiry) {
      this.yearExpiry = yearExpiry;
   }

   public int getSerialNum() {
      return serialNum;
   }

   public String getManufacturer() {
      return manufacturer;
   }

   public int getYearMade() {
      return yearMade;
   }

   public int getYearPurchased() {
      return yearPurchased;
   }

   public double getProcessorSpeed() {
      return processorSpeed;
   }

   public int getRamSize() {
      return ramSize;
   }

   public int getYearExpiry() {
      return yearExpiry;
   }
   
   public String toString() {
      return "serialNum=" + serialNum +
              ", manufacturer='" + manufacturer + '\'' +
              ", yearMade=" + yearMade +
              ", yearPurchased=" + yearPurchased +
              ", processorSpeed=" + processorSpeed +
              ", ramSize=" + ramSize +
              ", yearExpiry=" + yearExpiry +'\n';
   }
   
   public int age() {
      return yearPurchased - yearMade;
   }
   
   public boolean expiringNextYear() {
      return yearExpiry - yearPurchased == 1;
   }
}