package work;

public class Employee {
 String fullName;
 int department;
 int salary;
static int id = 0;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id++;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "Имя сотрудника='" + fullName + '\'' +
                ", отдел=" + department +
                ", зарплата=" + salary +
                '}';
    }



    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
       return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment ( int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого отдела не существует. Выберите от 1 до 5.");
        }
        this.department= department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

}

