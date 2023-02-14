package feb13exam.lambda;

public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", mobNo=" + mobNo +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    private int empId;
    private String empName;
    private long mobNo;
    private String address;
    private float salary;

    public Employee(int empId, String empName, long mobNo, String address, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.mobNo = mobNo;
        this.address = address;
        this.salary = salary;
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

    public long getMobNo() {
        return mobNo;
    }

    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



}
