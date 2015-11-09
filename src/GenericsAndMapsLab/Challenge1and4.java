/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsAndMapsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author John
 */
public class Challenge1and4 {
    
    
    public static void main(String[] args) {
        Employee person1 = new Employee("Selas", "John","103-45-5345",2);
        Employee person2 = new Employee("Smith", "Bob","858-56-8885",7);
        Employee person3 = new Employee("Allen", "Joe","756-75-3564",9);
        Employee person4 = new Employee("Flanders", "Ned","756-75-3564",3);
        
        Set<Employee> set = new TreeSet<Employee>();
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        
        
        List<Employee> list = new ArrayList<>(set);
        // normal sort by ssn
        System.out.println("Normal sort by ssn");
        System.out.println(" ");
        Collections.sort(list);
        
        
        Employee emp = null;
        Iterator<Employee> e = list.iterator();
        while( e.hasNext() ) {
           emp  = e.next();
            System.out.println(emp);
        }
        System.out.println(" ");
        // sort by lastname
        System.out.println("Sort by lastname");
        System.out.println(" ");
        Collections.sort(list, new EmployeeByLastName());
        
        
        Iterator<Employee> ee = list.iterator();
        while( ee.hasNext() ) {
           emp  = ee.next();
            System.out.println(emp);
        }
        
    }
    
    
    
}
