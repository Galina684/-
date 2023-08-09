package work;

import java.util.Objects;

public class Employee {
    private Integer id;
 private String fullName;
 private Integer department;
 private Integer salary;
private static Integer idCounter = 0;


    public Employee(String fullName, Integer department, Integer salary) {
        idCounter++;
        id = idCounter;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
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

    public Integer getId() {
        return id;
    }

    public static Integer getIdCounter() {
        return idCounter;
    }

    public void setDepartment(Integer department) {
        this.department = department;
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

