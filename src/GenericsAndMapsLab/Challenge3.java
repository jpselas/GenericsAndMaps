/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsAndMapsLab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author John
 */
public class Challenge3 {
    
    public static void main(String[] args) {
        
        
        Employee person1 = new Employee("Selas", "John","103-45-5345",2);
        Employee person2 = new Employee("Smith", "Bob","858-56-8885",7);
        Employee person3 = new Employee("Allen", "Joe","756-75-3564",9);
        Employee person4 = new Employee("Flanders", "Ned","756-75-3564",3);
        
        
        Map<String,Employee> map2 = new TreeMap<>();
        map2.put(person1.getSsn(),person1);
        map2.put(person2.getSsn(),person2);
        map2.put(person3.getSsn(),person3);
        map2.put(person4.getSsn(),person4);
        
        Set<String> keys = map2.keySet();
        for(String key : keys) {
            Employee found = map2.get(key);
            System.out.println(found.toString());
        }
        
        
        System.out.println(" ");
        System.out.println("Different sort with comparator using lastname");
        Collection<Employee> values = map2.values();
        
        
        List<Employee> sortedList = new ArrayList<Employee>(values);
        
        Collections.sort(sortedList, new EmployeeByLastName());
        for(Employee emp : sortedList) {
            System.out.println(emp);
        }
    }
    
    
}
