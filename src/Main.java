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
        int a = 4;
        byte b = 10;
        short c = 120;
        long d = 1002L;
        float e = 45.4f;
        double f = 34.2;



        System.out.println("Значение переменной с типом а равно " + a + "." + "\n" +
                "Значение переменной с типом а равно " + b + "." + "\n" +
                "Значение переменной с типом а равно " + c + "." + "\n" +
                "Значение переменной с типом а равно " + d + "." + "\n" +
                "Значение переменной с типом а равно " + e + "." + "\n" +
                "Значение переменной с типом а равно " + f + ".");

    }

    public static void task2 () {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;



        System.out.println("Значение переменной с типом а равно " + a + "." + "\n" +
                "Значение переменной с типом а равно " + b + "." + "\n" +
                "Значение переменной с типом а равно " + c + "." + "\n" +
                "Значение переменной с типом а равно " + d + "." + "\n" +
                "Значение переменной с типом а равно " + e + "." + "\n" +
                "Значение переменной с типом а равно " + f + "." + "\n" +
                "Значение переменной с типом а равно " + g + ".");

    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short sheets = 480;
        var student = lP + aS + eA;



        System.out.println("На каждого ученика приходится по " + sheets / student + " листов бумаги.");

    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte minute = 2;
        var bottleInMinute  = bottle / minute;
        byte minutte20 = 20;
        short day = 1440;
        short day3 = 4320;
        int mounth =43200;
        // посчитал сколько минут в каждом указанном в задании временном отрезке на калькуляторе


        System.out.println("За 20 минут машина произвела " + minutte20 * bottleInMinute + " штук бутылок." + "\n" +
                "За 1 день машина произвела " + day * bottleInMinute + " штук бутылок." + "\n" +
                "За 3 дня машина произвела " + day3 * bottleInMinute + " штук бутылок." + "\n" +
                "За 1 месяц минут машина произвела " + mounth * bottleInMinute + " штук бутылок.");

    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte allTin = 120;
        byte whiteTinKlass = 2;
        byte brownTinKlass = 4;
        int allTinklass = whiteTinKlass + brownTinKlass;
        int allKlass = allTin / allTinklass;
        int allWhiteTin = whiteTinKlass * allKlass;
        int allBrownTin = brownTinKlass * allKlass;



        System.out.println("В школе, где " + allKlass + " классов, нужно " +
                allWhiteTin +  " банок белой краски и " +
                allBrownTin + " банок коричневой краски.");

    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 5;
        byte weightBanana = 80;
        int weightAllBanana = banana * weightBanana;

        short milk = 2;
        byte  weightMilk = 105;
        int weightAllMilk = milk * weightMilk;

        byte iceCream = 2;
        byte weightIceCream = 100;
        int weightAllIceCream = iceCream * weightIceCream;

        byte egg = 4;
        byte weightEgg = 70;
        int weightAllEgg = egg * weightEgg;

        int allWeight = weightAllBanana + weightAllMilk + weightAllIceCream + weightAllEgg;
        int allWeightInKilo = allWeight / 1000;


        System.out.println("Вес всех продуктов в грамма " + allWeight +  ", а в килограммах " + allWeightInKilo + ".");

    }

    public static void task7 () {
        System.out.println("Задача 7");
        short needWeightGramm = 7000;
        // перевели килограммы в граммы для удобства рассчетов
        short loseWeight1 = 250;
        short loseWeight2 = 500;
        int dayLoseWeight1 = needWeightGramm / loseWeight1;
        int dayLoseWeight2 = needWeightGramm / loseWeight2;
        int middleLoseWeight = (dayLoseWeight1 + dayLoseWeight2) /2;


        System.out.println("Для того, чтобы сбросить 7 кг веса потребуется в среднем " + middleLoseWeight + " дней.");

    }

    public static void task8 () {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaPlus = masha / 100 * 10;
        int denisPlus = denis / 100 * 10;
        int kristinaPlus = kristina / 100 * 10;
        int mashaTotal = masha + mashaPlus;
        int denisTotal = denis + denisPlus;
        int kristinaTotal = kristina + kristinaPlus;



        System.out.println("Маша теперь получает " + mashaTotal + " рублей. Годовой доход вырос на " + mashaPlus
                + " рублей." + "\n" +
                "Денис теперь получает " + denisTotal + " рублей. Годовой доход вырос на " + denisPlus
                + " рублей." + "\n" +
                "Кристина теперь получает " + kristinaTotal + " рублей. Годовой доход вырос на " + kristinaPlus
                + " рублей.");

    }


}
