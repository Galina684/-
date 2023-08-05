package work;

import work.Employee;



public class Main {

    private static final Employee[] employees = {

            new Employee("Иванов Иван Иванович", 1, 50_000),
            new Employee("Сидоров Иван Петрович", 1, 70_000),
            new Employee("Петров Александр Евгеньевич", 4, 100_000),
            new Employee("Боширов Руслан Тимурович", 5, 150_000),
            new Employee("Толстой Лев Николаевич", 4, 150_000),
            new Employee("Пушкин Александр Сергеевич", 5, 75_000),
            new Employee("Лермонтов Михаил Юрьевич", 5, 125_000),
            new Employee("Гоголь Николай Васильевич", 3, 100_000),
            new Employee("Грибоедов Александр Сергеевич", 2, 150_000),
            new Employee("Тургенев Иван Сергеевич", 3, 150_000),
    };


    public static void printEmployees () {
        for (Employee employee : employees) ;
        System.out.println(employees);
    }

    public static int amountOfSalaries () {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    public static Employee minSalary () {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public static Employee maxSalary () {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    public static float averageSalary () {
        return amountOfSalaries() / (float) employees.length;
    }

    public static void printFullNames () {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }


    public static void main(String[] args
    ) {


        printEmployees();
        System.out.println();
        System.out.println("Сумма всех зарплат " + amountOfSalaries());
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой " + minSalary());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой " + maxSalary());
        System.out.println();
        System.out.println("Средняя зарплата " + averageSalary());
        System.out.println();
        printFullNames();

    }
}