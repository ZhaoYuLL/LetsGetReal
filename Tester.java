public class Tester{
  public static void main(String[] args){
    RealNumber a = new RealNumber(5.5);

    RealNumber b = new RealNumber(-3.5);
    System.out.println("Is " + a + " equals to " + b + ": "+ a.equals(b));
    System.out.println(a + " + " + b + " = " + a.add(b));
    System.out.println(a + " * " + b + " = " + a.multiply(b));
    System.out.println(a + " / " + b + " = " + a.divide(b));
    System.out.println(a + " - " + b + " = " + a.subtract(b));



  }
}
