package c4;

import java.io.Serializable;

public class Employee implements Serializable {

    private String empld;
    private String empName;
    private Address address;
    private String email;
    private String password;


    public Employee( String empld,String empName,Address address,String email,String password ) {
            this.address=address;
            this.empld=empld;
            this.empName=empName;
            this.email=email;
            this.password=password;
    }

    public String getEmpld() {
        return empld;
    }

    public void setEmpld(String empld) {
        this.empld = empld;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empld='" + empld + '\'' +
                ", empName='" + empName + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}