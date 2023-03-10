package hw6;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private int age;

    public Employee (String fullName, String position, String email, int phoneNumber, int age){
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.fullName = fullName;
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
} 
