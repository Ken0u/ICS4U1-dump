class Vehicle {
  public void a(int i){System.out.print("vehicle");}
}
class Car extends Vehicle {
  public void a(double i){System.out.print("car");}
}
class Test {
   public static void main(String[] args) {
      Vehicle v = new Car();
      (v).a(1);
   }
}