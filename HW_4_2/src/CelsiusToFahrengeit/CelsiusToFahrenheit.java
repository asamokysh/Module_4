package CelsiusToFahrengeit;

/**
 * Created by IIOPIIIEHb on 03/14/2016.
 */
public class CelsiusToFahrenheit {
    //оголошую класс типу public з іменем CelsiusToFahrenheit

    private String textExplanation; // оголошую змінні
    private double degreeInCelsius;
    private double degreeInFahrenheit;
    private final int PLUS_FIRST = 32;
    private final double MULTIPLY = 9/5;

    CelsiusToFahrenheit (String text, double celsius) { // роблю конструктор класу з явно вказаними сігнатурами
        this.textExplanation = text; //  ?
        this.degreeInCelsius = celsius;
        this.degreeInFahrenheit = getDegreeInCelsius()* getMULTIPLY() + getPLUS_FIRST();
    }
    public String getTextExplanation () { return textExplanation;} // задаю геттери
    public double getDegreeInFahrenheit () {return degreeInFahrenheit;}

    public double getDegreeInCelsius() {
        return degreeInCelsius;
    }

    public int getPLUS_FIRST() {
        return PLUS_FIRST;
    }

    public double getMULTIPLY() {
        return MULTIPLY;
    }
}
