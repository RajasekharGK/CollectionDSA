public class Emp implements Comparable<Emp> {
    private int empId;
    private String empName;

    public Emp(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Emp e) {
        return (this.empId<e.empId) ? -1 : (this.empId == e.empId) ? 0 : 1;
    }
}
