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
        int savingsPerMonth = 15_000;
        int totalSavings = 0;
        int i = 1;
        while (totalSavings < 2_459_000){
            totalSavings = totalSavings + savingsPerMonth;
            System.out.println("Месяц № " + i + ", сумма накоплений равна " + totalSavings);
            i++;
        }
        i--;
        System.out.println("2_459_000 рублей вы накопите за: " + i + " месяцев");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        while ( i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        i--;
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int totalPopulation = 12_000_000;
        int birthRatePer1000 = 17;
        int deathRatePer1000 = 12;
        int totalBirthRatePerYear = (totalPopulation/1_000) * birthRatePer1000;
        int totalDeathRatePerYear = (totalPopulation/1_000) * deathRatePer1000;
        for (int i = 1; i <= 10; i++) {
            totalPopulation = totalPopulation + totalBirthRatePerYear - totalDeathRatePerYear;
            System.out.println("Год " + i + ", численность населения составляет " + totalPopulation);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        double totalSavings = 15_000;
        double percent = 0.07;
        int i = 1;
        for (; totalSavings < 12_000_000; i++) {
            totalSavings = totalSavings + (totalSavings * percent);
            System.out.println("Месяц " + i + ", сумма накоплений " + (int) totalSavings);
        }
        i--;
        System.out.println("Всего нужно будет копить " + i + " Месяцев");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        double totalSavings = 15_000;
        double percent = 0.07;
        int i = 1;
        for (; totalSavings < 12_000_000; i++) {
            totalSavings = totalSavings + (totalSavings * percent);
            if (i%6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + (int) totalSavings);
            }
        }
        i--;
        System.out.println("Всего нужно будет копить " + i + " Месяцев");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        double totalSavings = 15_000;
        double percent = 0.07;
        int totalYears = 9;
        int monthsPerYear = 12;
        int totalMonths = totalYears * monthsPerYear;
        int j = 1;
        for (int i = 1; i <= totalMonths; i++) {
            totalSavings = totalSavings + (totalSavings * percent);
            if (i%6 == 0) {
                System.out.println("Полугодие " + j + ", сумма накоплений " + (int) totalSavings);
                j++;
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int friday = 3; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-ое число. Необходимо подготовить отчёт");
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int year = 0;
        int start = 1823;
        int end = 2123;
        for (year = start; year < end; year++){
                if (year % 79 == 0) {
                    System.out.println(year);
                }
        }
    }

}