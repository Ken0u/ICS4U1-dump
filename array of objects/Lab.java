public class Lab {
   private final int CAPACITY;
   private int amountInstalled;
   private Computer[] computers;
   
   public Lab(int capacity) {
      CAPACITY = capacity;
      amountInstalled = 0;
      computers = new Computer[capacity];
   }
   
   public boolean installComputer(int serialNum, String manufacturer, int yearMade, int yearPurchased, double processorSpeed, int ramSize, int yearExpiry) {
      Computer temp = new Computer(serialNum, manufacturer, yearMade, yearPurchased, processorSpeed, ramSize, yearExpiry);
      
      for (int i = 0; i < CAPACITY; i++) {
         if (computers[i] == null) {
            computers[i] = temp;
            return true;
         }
      }
      
      return false;
   }
   
   public double averageAge() {
      double averageAge = 0;
      
      for (int i = 0; i < CAPACITY && computers[i] != null; i++) {
         averageAge += computers[i].age();
      }
      
      return averageAge / CAPACITY;
   }
      
   public Computer newest() {
      Computer newest = computers[0];
      
      for (int i = 1; i < CAPACITY && computers[i] != null; i++) {
         if (computers[i].age() < newest.age()) {
            newest = computers[i];
         }
      }
      
      return newest;
   }
   
   public Computer fastest() {
      Computer fastest = computers[0];
      
      for (int i = 1; i < CAPACITY && computers[i] != null; i++) {
         if (computers[i].getProcessorSpeed() > fastest.getProcessorSpeed()) {
            fastest = computers[i];
         }
      }
      
      return fastest;
   }
   
   public Computer largestMem() {
      Computer largestMem = computers[0];
      
      for (int i = 1; i < CAPACITY && computers[i] != null; i++) {
         if (computers[i].getRamSize() > largestMem.getRamSize()) {
            largestMem = computers[i];
         }
      }
      
      return largestMem;
   }
   
   public int amountFromManufacturer(String manufacturer) {
      int amount = 0;
      
      for (int i = 0; i < CAPACITY && computers[i] != null; i++) {
         if (computers[i].getManufacturer().equals(manufacturer)) {
            amount++;
         }
      }
      
      return amount;
   }
   
   public Computer[] expiringNextYear() {
      int arrayLength = 0;
      
      for (int i = 0; i < CAPACITY && computers[i] != null; i++) {
         if (computers[i].expiringNextYear()) {
            arrayLength++;
         }
      }
      
      Computer[] expiringNextYear = new Computer[arrayLength];
      
      for (int i = 0; i < CAPACITY && computers[i] != null; i++) {
         if (computers[i].expiringNextYear()) {
            for (int j = 0; j < expiringNextYear.length; j++) {
               if (expiringNextYear[j] == null) {
                  expiringNextYear[j] = computers[i];
               }
            }
         }
      }
      
      return expiringNextYear;
   }
}