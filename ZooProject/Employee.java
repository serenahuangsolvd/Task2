public class Employee extends Person {
    private String employeeID;
    private int age;
    private double salary;
    private String department;

    public Employee(String name, String email, String employeeID, int age, double salary, String department) {
        super(name, email);
        this.employeeID = employeeID;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}