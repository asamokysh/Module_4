package HW_4_1;

public class RunFourOne {
    public static void main (String[] args){ //точка входу, або оголошуємо метод мейн з такими то параметрами

        Triangle threeside = new Triangle("Площа трикутника дорівнює ", 599.0001, 7507.145);



        System.out.println(threeside.getTextExplanation() + threeside.getSquareOfTriangle());

    }

}
