package FahrengeitToCelsius;

public class Run421 {
    public static void main (String[] args){ //точка входу, або оголошуємо метод мейн з такими то параметрами

        FahrengeitToCelsius converter2 = new FahrengeitToCelsius ("Температура в градусах Цельсія становитиме ", 6678);
// Тут хочу щоб мені поянили як це точно називається

        System.out.println(converter2.getTextExplanation() + converter2.getDegreeInCelsius());
// Виводимо на екран рішення задачі
    }
    }
