public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other){
    if (value == 0.0){
      return (other.getValue() == 0.0);
    }
    double diff = (value-other.getValue())/value;
    return Math.abs(diff)<0.001;
  }

}
