import work.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee ivanov = new Employee("Иванов Иван Иванович", 7, 50_000);
        Employee sidorov = new Employee("Сидоров Иван Петрович", 1, 70_000);
        Employee petrov = new Employee("Петров Александр Евгеньевич", 5, 100_000);
        Employee boshirov = new Employee("Боширов Руслан Тимурович", 5, 150_000);

        Employee[] employees = new Employee[10];
        employees[0] = ivanov;
        employees[1] = sidorov;
        employees[2] = petrov;
        employees[3] = boshirov;

        employees[0].setSalary(55_000);


        System.out.println(Arrays.toString(employees));
        System.out.println(Employee.getId());

        /*public static void listOfEmployees(){

        }

        public static void amountOfSalaries(){
           int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i];
        }
        System.out.println(sum);
    }
       }
        public static void minSalary(){
           int minSal = employees[0];
            for (int i = 1; i < employees.length; i++) {
            if (employees[i] < minSal) {
                minSal = employees[i];
            }
                System.out.println("Минимальная зарплата" + minSal);
        }
        public static void maxSalary(){
          int maxSal = -1;
            for (int i = 0; i < employees.length; i++) {
            final int current = employees[i];
            if (current > maxSal) {
                maxSal = current;
            }
                System.out.println("Максимальная зарплата" +maxSal);
        }
        public static void employeeName(){

    }*/
    }

}