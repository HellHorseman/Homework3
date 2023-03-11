public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
    byte lesson = 8;
    short course = 9;
    int profession = 11;
    long year = 365L;
    float g = 9.8F;
    double p = 3.1415926535897932;
        System.out.println("Уроков " + lesson);
        System.out.println("Курсов " + course);
        System.out.println("Профессия " + profession);
        System.out.println("Год " + year);
        System.out.println("Ускорение свободного падения " + g);
        System.out.println("Число пи " + p);
    }

    public static void task2 () {
        System.out.println("Задача 2");
    float a = 27.12f;
    long b = 987678965549L;
    float c = 2.786f;
    short d = 569;
    short e = -159;
    short f = 27897;
    byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
    byte studentsLudmilaPavlovna = 23;
    byte studentsAnnaSergeevna = 27;
    byte studentsEkaterinaAndreevna = 30;
    byte allStudents = (byte) (studentsLudmilaPavlovna + studentsAnnaSergeevna +
            studentsEkaterinaAndreevna);
    short paper = 480;
    int sheetOnStudent =  paper / allStudents;
        System.out.println("На каждого ученика рассчитано " + sheetOnStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time = 2;
        int bottlePerMin = bottle / time;
        byte timeLap1 = 20;
        int perTwentyMin = bottlePerMin * timeLap1;
        System.out.println("За " + timeLap1 + " минут машина произвела " + perTwentyMin +
                " штук бутылок");
        short day = 24 * 60;
        int perDay = day * bottlePerMin;
        System.out.println("За " + day + " минут машина произвела " + perDay + " штук бутылок");
        int threeDays = day * 3;
        int perThreeDays = threeDays * bottlePerMin;
        System.out.println("За " + threeDays + " минут машина произвела " + perThreeDays +
                " штук бутылок");
        int month = day * 30;
        int perMonth = month * bottlePerMin;
        System.out.println("За " + month + " минут машина произвела " + perMonth +
                " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        byte paintPerClass = (byte) (whitePaintPerClass + brownPaintPerClass);
        byte totalClasses = (byte) (totalPaint / paintPerClass);
        byte totalWhitePaint = (byte) (whitePaintPerClass * totalClasses);
        byte totalBrownPaint = (byte) (brownPaintPerClass * totalClasses);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint
                + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
    byte banana = 80;
    byte milk = 105;
    byte iceCream = 100;
    byte egg = 70;
    int totalBanana = banana * 5;
    int totalMilk = milk * 2;
    int totalIceCream = iceCream * 2;
    int totalEgg = egg * 4;
    int totlalWhightInGramms = totalBanana + totalMilk + totalIceCream + totalEgg;
    float totalWhightInKilo = totlalWhightInGramms / 1000f;
        System.out.println("Вес спортивного завтрака " + totlalWhightInGramms + " грамм, или "
        + totalWhightInKilo + " киллограмм");
    }
    public static void task7 () {
        System.out.println("Задача 7");
    byte totalFlow = 7;
    float minFlow = 250 / 1000f;
    float maxFlow = 500 / 1000f;
    float daysMinFlow = totalFlow / minFlow;
    float daysMaxFlow = totalFlow / maxFlow;
        System.out.println("При сбросе " + minFlow + " кг веса в день, необходимо "
                + daysMinFlow + " дней");
        System.out.println("При сбросе " + maxFlow + " кг веса в день, необходимо "
                + daysMaxFlow + " дней");
    float midFlow = (minFlow + maxFlow) / 2;
    float daysMidFlow = totalFlow / midFlow;
        System.out.println("При сбросе " + midFlow + " кг веса в день, необходимо "
                + daysMidFlow + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
    int mashaSalary = 67760;
    int denisSalary = 83690;
    int kristinaSalary = 76230;
    float indexMashaSalary = (mashaSalary / 100f) * 10 + mashaSalary;
    float indexDenisSalary = (denisSalary / 100f) * 10 + denisSalary;
    float indexKristinaSalary = (kristinaSalary / 100f) * 10 + kristinaSalary;
    int year = 12;
    int mashaYearSalary = mashaSalary * year;
    int denisYearSalary = denisSalary * year;
    int kristinaYearSalary = kristinaSalary * year;
    float mashaIndexPerYear = indexMashaSalary * year;
    float denisIndexPerYear = indexDenisSalary * year;
    float kristinaIndexPerYear = indexKristinaSalary * year;
    float mashaDifference = mashaIndexPerYear - mashaYearSalary;
    float denisDifference = denisIndexPerYear - denisYearSalary;
    float kristinaDifference = kristinaIndexPerYear - kristinaYearSalary;
        System.out.println("Маша теперь получает " + indexMashaSalary + " рублей." +
                " Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + indexDenisSalary + " рублей." +
                " Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + indexKristinaSalary + " рублей." +
                " Годовой доход вырос на " + kristinaDifference + " рублей");
    }
}