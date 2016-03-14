package CelsiusToFahrengeit;

/**
 * Created by IIOPIIIEHb on 03/14/2016.
 */
public class RunFourTwo {
    public static void main (String[] args){ //точка входу, або оголошуємо метод мейн з такими то параметрами

        CelsiusToFahrenheit converter = new CelsiusToFahrenheit ("Температура в градусах Фаренгейта становитиме ", 33.7777);
// Тут хочу щоб мені поянили як це точно називається

        System.out.println(converter.getTextExplanation() + converter.getDegreeInFahrenheit());
// Виводимо на екран рішення задачі
    }
}
