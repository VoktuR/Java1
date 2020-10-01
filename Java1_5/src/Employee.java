public class Employee {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private byte age;

    public Employee() {

    }

    public Employee(String name, String post, String email, String phoneNumber, int salary, byte age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployee() {
        System.out.println("Name: " + name + "\nPost: " + post + "\nEmail: " + email + "\nPhoneNumber: " + phoneNumber + "\nSalary: " + salary + "\nAge: " + age);
    }

    public String getName() {
        return name;
    }
    public String getPost() {
        return post;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getSalary() {
        return salary;
    }
    public byte getAge() {
        return age;
    }

}
