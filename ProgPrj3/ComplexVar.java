
/**
 * Write a description of class ComplexVar here.
 * 
 * @Thomas Nocera
 * @March 20, 2015
 */
public class ComplexVar
{
    private double reNumber, imNumber;
    
    public ComplexVar() {
        reNumber = 0;
        imNumber = 0;
    }
    
    public ComplexVar(double reNum, double imNum){
        reNumber = reNum;
        imNumber = imNum;
    }
    
    public double getReNumber() {
        return reNumber;
    }
    
    public double getImNumber() {
        return imNumber;
    }
    
    public void setReNumber(double reNum) {
        reNumber = reNum;
    }
    
    public void setImNumber(double imNum){
        imNumber = imNum;
    }
    
    public double modZ() {
        return Math.hypot(reNumber, imNumber);
    }
    
    public String toPolar() {
        double modZ = Math.hypot(reNumber, imNumber);
        double theta1 = Math.acos(reNumber / modZ);
        double theta2 = -(Math.acos(reNumber / modZ));
        String polar;
        if(imNumber >= 0) {
            return String.format("%.03fe^(i(%.03f + 2πn)", modZ, theta1);
        }else{
            return String.format("%.03fe^(i(%.03f + 2πn)", modZ, theta2);
        }
    }
    
    public ComplexVar multiply(ComplexVar c){
            double x = reNumber;
            double y = imNumber;
            double u = c.getReNumber();
            double v = c.getImNumber();
            ComplexVar mult = new ComplexVar();
            mult.setReNumber((x * u) - (v * y));
            mult.setImNumber((x * v) + (y * u));
            return mult;
    }
    
    public ComplexVar conjugate() {
        ComplexVar c = new ComplexVar(reNumber, (-imNumber));
        return c;
    }
    /* 
    public String findRoots(double root){
       
    }
    */
    public String toString() {
        return String.format("Z = %.03f + i(%.03f)", reNumber, imNumber);
    }
}
