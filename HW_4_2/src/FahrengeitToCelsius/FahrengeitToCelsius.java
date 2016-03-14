package FahrengeitToCelsius;

public class FahrengeitToCelsius {
    //оголошую класс типу public з іменем CelsiusToFahrenheit

    private String textExplanation; // оголошую змінні
    private double degreeInCelsius;
    private double degreeInFahrenheit;
    private final int MINUS_FIRST = 32;
    private final double MULTI_PLYYY = 5/9;

    FahrengeitToCelsius (String text, double fahrengeit) { // роблю конструктор класу з явно вказаними сігнатурами
        this.textExplanation = text; //  ?
        this.degreeInFahrenheit = fahrengeit;
        this.degreeInCelsius = (getDegreeInFahrenheit() - getMINUS_FIRST())* 5/9;
    }
    public String getTextExplanation () { return textExplanation;} // задаю геттери
    public double getDegreeInFahrenheit () {return degreeInFahrenheit;}

    public double getDegreeInCelsius() {
        return degreeInCelsius;
    }

    public int getMINUS_FIRST() {
        return MINUS_FIRST;
    }

    public double getMULTI_PLYYY() {
        return MULTI_PLYYY;
    }
}
