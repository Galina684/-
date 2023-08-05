package work;

import java.util.Objects;

public class Employee {
    private Integer id;
 private String fullName;
 private Integer department;
 private Integer salary;
private static Integer idCounter = 1;


    public Employee(String fullName, Integer department, Integer salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

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

    public void setDepartment ( int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого отдела не существует. Выберите от 1 до 5.");
        }
        this.department= department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary);
    }
}

