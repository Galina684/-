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
    public void departmentNumber(int newDepartment) {
        if (newDepartment >= 1 && newDepartment <= 5) {
            this.department = newDepartment;
        } else {
            throw new RuntimeException("Такого отдела не существует. Выберите от 1 до 5.");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
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

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

}

