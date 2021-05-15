import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FirstClass {
    public static Pattern compile(String literal) {
        return null;
    }

    public static Pattern compile(String literal, int flags) {
        return null;
    }

    @Test
    public void firstMethod (){

        String text = "При написании даты используются арабские цифры (пара цифр для обозначения числа, пара цифр для месяца и четыре цифры для обозначения года), \n" +
        "разделительный знак — точка: 27.08.2007, 01.09.2007. Возможно также буквенно-цифровое обозначение даты: 5 марта 1999 г., 1 сентября 2007 г.\n" +
                "Цифровой способ \n" +
                "Цифровой способ является наиболее экономичным, поскольку сокращает длину написания даты и может одновременно служить кодом \n" +
                "при обработке документов. Элементы даты приводятся одной строкой арабскими цифрами, отделенными точками, \n" +
                "без переносов в такой последовательности: число, месяц, год. День месяца и месяц оформляются двумя парами арабских цифр (через точку), \n" +
                "год – четырьмя арабскими цифрами: Например:\n" +
                "01.09.2012. \n"+
                "Словесно-цифровой способ \n" +
                "Словесно-цифровой способ имеет несколько разновидностей. На документах со сведениями финансового характера \n" +
                "предыдущий пример выглядит следующим образом: 01 сентября 2012 года или 01 сентября 2012 г.\n";
        Pattern pattern = Pattern.compile("\\d" + "{1}\\d");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();
            System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
        }
        System.out.println(matcher.replaceFirst("PARAM"));
        System.out.println(matcher.replaceAll("Date"));
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(text);
    }
}


