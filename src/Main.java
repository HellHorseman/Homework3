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
    byte allStudents = (byte) (studentsLudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna);
    short paper = 480;
    byte sheetOnStudent = (byte) (paper / allStudents);
        System.out.println("На каждого ученика рассчитано " + sheetOnStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte time = 2;
        int bottlePerMin = bottle / time;
        byte timeLap1 = 20;
        int perTwentyMin = bottlePerMin * timeLap1;
        System.out.println("За " + timeLap1 + " минут машина произвела " + perTwentyMin + " штук бутылок");
        short day = 24 * 60;
        int perDay = day * bottlePerMin;
        System.out.println("За " + day + " минут машина произвела " + perDay + " штук бутылок");
        int threeDays = day * 3;
        int perThreeDays = threeDays * bottlePerMin;
        System.out.println("За " + threeDays + " минут машина произвела " + perThreeDays + " штук бутылок");
        int month = day * 30;
        int perMonth = month * bottlePerMin;
        System.out.println("За " + month + " минут машина произвела " + perMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");

    }public static void task6 () {
        System.out.println("Задача 6");

    }public static void task7 () {
        System.out.println("Задача 7");

    }public static void task8 () {
        System.out.println("Задача 8");

    }
}