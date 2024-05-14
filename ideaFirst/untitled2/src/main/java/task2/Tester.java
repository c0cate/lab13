package task2;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester() {
        this("Неизвестно", "Неизвестно", 0, "Неизвестно", 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Неизвестно", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void printInfo(boolean showSalary) {
        printInfo();
        if (showSalary) {
            System.out.println("Зарплата: " + salary);
        }
    }

    public void printInfo(boolean showSalary, boolean showExperience) {
        printInfo(showSalary);
        if (showExperience) {
            System.out.println("Опыт работы: " + expirienceInYears + " год(а)");
        }
    }

    public static void greetTester() {
        System.out.println("Привет, тестировщик!");
    }
}



