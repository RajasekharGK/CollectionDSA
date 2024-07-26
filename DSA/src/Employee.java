import java.util.Objects;

public class Employee {
    private Integer empNo;
    private String empName;
    private Double salary;

    public Employee(Integer empNo, String empName, Double salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNo.equals(employee.empNo) && empName.equals(employee.empName) && salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, empName, salary);
    }
}
