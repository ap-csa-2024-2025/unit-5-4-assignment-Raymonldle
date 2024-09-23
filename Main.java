public class Main
{
  public static void main(String[] args)
  {
    // test your functions here to make sure they work
    System.out.println(distance(0,5,0,0));
    System.out.println(OneSolutionquadraticFormula(-2, 1, 1));
    System.out.println(OtherSolutionquadraticFormula(-2, 1, 1));
  }

  public static double distance(int x1, int y1, int x2, int y2){
    return (double) Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
  }

  public static double OneSolutionquadraticFormula(double a, double b, double c){
    
    return (-b + Math.sqrt((b * b) - (4 * a * c)))/ (2 * a);
    
  }

  public static double OtherSolutionquadraticFormula(double a, double b, double c){
    
    return (-b - Math.sqrt((b * b) - (4 * a * c)))/ (2 * a);
    
  }

  // Implement distance formula method here

  // implement one of your quadratic formula methods here

  // implement the other quadratic formula here
}
