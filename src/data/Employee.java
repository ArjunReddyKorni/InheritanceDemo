package data;

public class Employee {
    private String name;
    private String dob;
    private int age;
    private  double salary;
    private Address address;


    public  void display() {
        System.out.println("Employee Details.");
        System.out.println("name = " + name);
        System.out.println("dob = " + dob);
        System.out.println("age = " + age);
        System.out.println("salary = " + salary);
        address.display();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
