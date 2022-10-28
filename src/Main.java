public class Main {
    public static void main(String[] args) {
// Задание 1
        System.out.println("Задание 1");
        byte hotelCategory = 5;
        System.out.println("Значение переменной hotelCategory с типом byte равно " + hotelCategory);
        short hotelCapacity = 5700;
        System.out.println("Значение переменной hotelCapacity с типом short равно " + hotelCapacity);
        int hotelStuff = 34200;
        System.out.println("Значение переменной hotelStuff с типом integer равно " + hotelStuff);
        long hotelCredit = 27400000L;
        System.out.println("Значение переменной hotelCredit с типом long равно " + hotelCredit);
        float hotelWorkingDay = 8.5f;
        System.out.println("Значение переменной hotelWorkingDay с типом float равно " + hotelWorkingDay);
        double hotelAverageSalary = 700.527;
        System.out.println("Значение переменной hotelAverageSalary с типом double равно " + hotelAverageSalary);
        boolean hotelOpened = true;
        System.out.println("Значение переменной hotelOpened с типом boolean равно " + hotelOpened);

// Задание 2
        float f = 27.12f;
        long l = 987678965549L;
        byte b1 = 2;
        short sh1 = 786;
        boolean bl = false;
        short sh2 = 569;
        double d = -159;
        int i = 27897;
        byte b2 = 67;
// Задание 3
        System.out.println("Задание 3");
        byte lpClass = 23;
        byte asClass = 27;
        byte eaClass = 30;
        short paperAmount = 480;
        float paperLimit = paperAmount / (lpClass + asClass + eaClass);
        System.out.println("На каждого ученика рассчитано " + (int) paperLimit + " листов бумаги");
// Задание 4
        System.out.println("Задание 4");
        byte prodM = 16 / 2;
        int prod20M = prodM * 20;
        int prod24H = prodM * 60 * 24;
        int prod3D = prodM * 60 * 24 * 3;
        int prodMM = prodM * 60 * 24 * 91;
        System.out.println("За 20 минут машина произвела бутылок " + (int) prod20M+ " штук ");
        System.out.println("За сутки машина произвела бутылок " + (int) prod24H+ " штук ");
        System.out.println("За 20 минут машина произвела бутылок " + (int) prod3D+ " штук ");
        System.out.println("За 20 минут машина произвела бутылок " + (int) prodMM+ " штук ");
// Задание 5
        System.out.println("Задание 5");
        byte schoolTotal = 120;
        byte classWhite = 2;
        byte classBrown = 4;
        int classTotal = classBrown + classWhite;
        int classNumber = schoolTotal / classTotal;
        int schoolTotalWhite = classNumber * classWhite;
        int schoolTotalBrown = classNumber * classBrown;
        System.out.println("В школе, где " + classNumber +" классов, нужно " +
                schoolTotalWhite + " банок белой краски и " + schoolTotalBrown +
                " банок коричневой краски");
// Задание 6
        System.out.println("Задание 6");
        short bananaWeight = 5 * 80;
        short milkWeight = 200 / 100 * 105;
        short plumberWeight = 2 * 100;
        short eggWeight = 70 * 4;
        int totalWeight = bananaWeight + milkWeight + plumberWeight + eggWeight;
        float totalWeightKg = totalWeight / 1000;
        System.out.println("Вес спорт-завтрака составляет " + totalWeightKg + " кг");
// Задание 7
        System.out.println("Задание 7");
        byte days250 = 7 * 1000 / 250;
        byte days500 = 7 * 1000 / 500;
        System.out.println("На похудение по 250 грассов в день уйдет " + days250 + " дней");
        System.out.println("На похудение по 500 грассов в день уйдет " + days500 + " дней");
        System.out.println("В среднем на похудение уйдет " + (float) (days250 + days500) / 2 + " дней");
// Задание 8
        System.out.println("Задание 8");
        int MashaSalary = 67760;
        int DanSalary = 83690;
        int ChrisSalary = 76230;
        float MashaSalaryNew = 67760 * 1.1f;
        float DanSalaryNew = 83690 * 1.1f;
        float ChrisSalaryNew = 76230 * 1.1f;
        System.out.println("Маша теперь получает " + (int) MashaSalaryNew +
                " рублей. Годовой доход вырос на " + (int) (MashaSalaryNew - MashaSalary) * 12 + " рублей.");
        System.out.println("Денис теперь получает " + (int) DanSalaryNew +
                " рублей. Годовой доход вырос на " + (int) (DanSalaryNew - DanSalary) * 12 + " рублей.");
        System.out.println("Кристина теперь получает " + (int) ChrisSalaryNew +
                " рублей. Годовой доход вырос на " + (int) (ChrisSalaryNew - ChrisSalary) * 12 + " рублей.");
    }
}