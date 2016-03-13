package HW_4_1;

public class Triangle {
    private String textExplanation;
    private double baseOfTriangle;
    private double heightOfTriangle;
    private double squareOfTriangle;

    Triangle (String explanation, double base, double height){
        this.textExplanation = explanation;
        this.baseOfTriangle = base;
        this.heightOfTriangle = height;
        squareOfTriangle = 0.5*getBaseOfTriangle()*getHeightOfTriangle();
    }

    public String getTextExplanation(){
        return textExplanation;
    }

    public double getBaseOfTriangle() {
        return baseOfTriangle;
    }

    public double getHeightOfTriangle() {
        return heightOfTriangle;
    }

    public double getSquareOfTriangle() {
        return squareOfTriangle;
    }




}
