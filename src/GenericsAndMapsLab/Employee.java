/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsAndMapsLab;
import org.apache.commons.lang3.builder.CompareToBuilder;
/**
 *
 * @author John
 */
import java.util.*;

public class Employee implements Comparable{
    private String lastName;
    private String firstName;
    private String ssn;
    private int empId;

    public Employee(String lastName, String firstName, String ssn, int empId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
        this.empId = empId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object obj) {
        Employee e = (Employee)obj;
        
        return new CompareToBuilder()
               .append(this.ssn, e.ssn)
               .toComparison();
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + ", empId=" + empId + '}';
    }

   


    
}
