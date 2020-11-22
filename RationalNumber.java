public class RationalNumber extends RealNumber{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno){
    super(0.0);
    if(deno ==0){
      deno = 1;
    }
    if(deno < 0){
      nume = -1*nume;
      deno = -1*deno;
    }
    denominator = deno;
    numerator = nume;
    reduce();
  }
  public double getValue(){
    return 0.0;
  }
  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(denominator,numerator);
  }

  public boolean equals(RationalNumber other){
    return(numerator==other.getNumerator() && denominator == other.getDenominator());
  }
  public String toString(){
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    while(b!=0){
      int r = a%b;
      a = b;
      b = r;
    }
    return a;
  }

  public void reduce(){
    int commonF = gcd(Math.abs(numerator),denominator);
    numerator = numerator / commonF;
    denominator = denominator/commonF;
  }

  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
  }

  public RationalNumber divide(RationalNumber other){
    return multiply(other.reciprocal());
  }
}
