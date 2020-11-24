public class RationalNumber extends Number{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno){
    super();
    if(deno ==0){
      deno = 1;
      nume = 0;
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
    return (double)numerator/(double)denominator;
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
    if(denominator==1){
      return "" + numerator;
    }
    if(numerator==0){
      return "0";
    }
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

  public RationalNumber add(RationalNumber other){
    int nume1 = numerator * other.getDenominator();
    int nume2 = other.getNumerator() * denominator;
    int diff = nume1 + nume2;
    int commonDeno = denominator * other.getDenominator();
    return new RationalNumber(diff,commonDeno);
  }
  public RationalNumber subtract(RationalNumber other){
    int nume1 = numerator * other.getDenominator();
    int nume2 = other.getNumerator() * denominator;
    int diff = nume1 - nume2;
    int commonDeno = denominator * other.getDenominator();
    return new RationalNumber(diff,commonDeno);
  }

}
