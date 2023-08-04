package work;

import work.Employee;

import java.util.Arrays;

public class Main {

     public static void listOfEmployees(){

    }

    public static void amountOfSalaries(Employee[] employeesBook){
        int sum = 0;
        for (Employee employees: employeesBook) {
                sum = sum + employees.getSalary();
        }
        System.out.println("Сумма затрат на зарплату " + sum);
    }


   /* public static void minSalary(Employee[] employeesBook){
        int minSal = 0;
        for (Employee employees: employeesBook) {
            if (employees.getSalary() < minSal) {
                minSal = employees.getSalary();
            }
            System.out.println("Минимальная зарплата " + minSal);

        }
        public static void maxSalary(Employee[] employeesBook){
            int maxSal = -1;
            for (Employee employees: employeesBook) {
                if (employees.getSalary() > maxSal) {
                    maxSal = employees.getSalary();
                }
            }
            System.out.println("Максимальная зарплата " +maxSal);

        }

        public static void employeeName(String[] employeesBook){


        }*/

    public static void main(String[] args
    ) {

        Employee ivanov = new Employee("Иванов Иван Иванович", 7, 50_000);
        Employee sidorov = new Employee("Сидоров Иван Петрович", 1, 70_000);
        Employee petrov = new Employee("Петров Александр Евгеньевич", 5, 100_000);
        Employee boshirov = new Employee("Боширов Руслан Тимурович", 5, 150_000);
        Employee tolstoy = new Employee("Толстой Лев Николаевич", 10,150_000);
        Employee pushkin = new Employee("Пушкин Александр Сергеевич",5,75_000);
        Employee lermonyov = new Employee("Лермонтов Михаил Юрьевич",5,125_000);
        Employee gogol = new Employee("Гоголь Николай Васильевич", 3,100_000);
        Employee griboedov = new Employee("Грибоедов Александр Сергеевич",2,150_000);
        Employee turgenev = new Employee("Тургенев Иван Сергеевич",3,150_000);


        Employee[] employees = new Employee[10];
        employees[0] = ivanov;
        employees[1] = sidorov;
        employees[2] = petrov;
        employees[3] = boshirov;
        employees[4] = tolstoy;
        employees[5] = pushkin;
        employees[6] = lermonyov;
        employees[7] = gogol;
        employees[8] = griboedov;
        employees[9] = turgenev;

        employees[0].setSalary(55_000);
        employees[0].setDepartment(2);

        System.out.println(Arrays.toString(employees));
        System.out.println(Employee.getId());

            amountOfSalaries(employees);
            //minSalary(employees);
    }

}