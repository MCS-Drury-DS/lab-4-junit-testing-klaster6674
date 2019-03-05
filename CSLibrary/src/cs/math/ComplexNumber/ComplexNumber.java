package cs.math.ComplexNumber;

import java.io.FileNotFoundException;

public class ComplexNumber  {

    private double realPart;
    private double imagPart;

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImagPart() {
        return imagPart;
    }

    public void setImagPart(double ImagPart) {
        this.imagPart = imagPart;
    }

    public void add(ComplexNumber otherCN) {
        double newRealPart = this.getRealPart() + otherCN.getRealPart();
        double newImagPart = this.getImagPart() + otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);

    }

    public static ComplexNumber add(ComplexNumber firstCN, ComplexNumber secondCN) {
        return firstCN;
    }

    public ComplexNumber (ComplexNumber cn){
        this.realPart = cn.getRealPart();
        this.imagPart = cn.getImagPart();
    }

    public void subt(ComplexNumber otherCN) {

        double newRealPart = this.getRealPart() - otherCN.getRealPart();
        double newImagPart = this.getImagPart() - otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }
    public static ComplexNumber sub(ComplexNumber firstCN, ComplexNumber secondCN) {

        return firstCN;
    }

    public void mult(ComplexNumber otherCN) {

        double newRealPart = this.getRealPart() *otherCN.getRealPart()
                -this.getImagPart() *otherCN.getImagPart();
        double newImagPart = this.getImagPart() * otherCN.getRealPart()
                +this.getRealPart() *otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }
    public static ComplexNumber mult(ComplexNumber firstCN, ComplexNumber secondCN) {

        return firstCN;
    }

    public void div(ComplexNumber otherCN) throws FileNotFoundException
    {

        double a = this.getRealPart();
        double b = this.getRealPart();
        double c = otherCN.getRealPart();
        double d = otherCN.getImagPart();
        double squaredC = (c*c);
        double squaredD = (d*d);
        double dividend  = (squaredC + squaredD);
        double divReal = ((a*c)+(b*d))/(dividend);
        double divImag = (((b*c)-(a*d))/(dividend));
        double newRealPart = divReal;
        double newImagPart = divImag;
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }

    public static ComplexNumber div(ComplexNumber firstCN, ComplexNumber secondCN) {

        return firstCN;
    }

    public void conj(ComplexNumber otherCN) {
        double newRealPart = this.getRealPart();
        double newImagPart = this.getImagPart() * -1;
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);

    }
    public static ComplexNumber conj(ComplexNumber firstCN, ComplexNumber secondCN) {

        return firstCN;
    }

    public ComplexNumber abs(ComplexNumber otherCN) {
        double newRealPart = Math.abs(this.getRealPart());
        double newImagPart = Math.abs(this.getImagPart());
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
        return new ComplexNumber();


    }
    public static double abs(ComplexNumber firstCN, ComplexNumber secondCN) {
        ComplexNumber cn1 = new ComplexNumber(firstCN);
        ComplexNumber cn2 = new ComplexNumber(secondCN);
        cn2.abs(cn1);
        return new ComplexNumber();
    }
    public static void ComplexNumber (ComplexNumber firstCN, ComplexNumber secondCN) {

    }
    public void ComplexNumber(){

    }

    /*public static double getRealPart(ComplexNumber firstCN, ComplexNumber secondCN) {


    }*/

    /*public static double getImagPart(ComplexNumber firstCN, ComplexNumber secondCN) {

    }*/
    public void setRealPart(ComplexNumber realPart){

    }
    /*public static void setRealPart(ComplexNumber firstCN, ComplexNumber secondCN) {

    }*/
    public void setImagPart(ComplexNumber imagPart) {

    }
    /*public static void setImagPart(ComplexNumber firstCN, ComplexNumber secondCN) {

    }*/
    public String toString(){
        return new String;

    }

    public static void main(String[] args)
    {
        ComplexNumber cn1= new ComplexNumber();
        System.out.println("CN1 real:" + cn1.getRealPart()+ "imag" + cn1.getImagPart());
        ComplexNumber cn2 = new ComplexNumber();
        cn1.mult(cn2);
        System.out.println("CN1 real" + cn2.getRealPart()+ "imag" + cn1.getImagPart());
    }


}