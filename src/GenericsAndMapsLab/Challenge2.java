/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsAndMapsLab;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author John
 */
public class Challenge2 {
    
    public static void main(String[] args) {
        Employee person1 = new Employee("Selas", "John","103-45-5345",2);
        Employee person2 = new Employee("Smith", "Bob","858-56-8885",7);
        Employee person3 = new Employee("Allen", "Joe","756-75-3564",9);
        Employee person4 = new Employee("Flanders", "Ned","756-75-3564",3);
        Employee person5 = new Employee("Selas", "John","103-45-5345",8);
        Employee person6 = new Employee("Smith", "Bob","858-56-8885",5);
        Employee person7 = new Employee("Allen", "Joe","756-75-3564",1);
        Employee person8 = new Employee("Flanders", "Ned","756-75-3564",4);
         Map map = new HashMap();
         map.put(2,person1);
         map.put(7,person2);
         map.put(9,person3); 
         map.put(3,person4);
         map.put(8,person5);
         map.put(5,person6);
         map.put(1,person7);
         map.put(4,person8);
         
         Employee e = (Employee)map.get(9);
        System.out.println("Retrieving employee with emploee ID 9: " + e);
        
        System.out.println(" ");
        
        Set keys = map.keySet();
        for(Object key : keys) {
            Employee found = (Employee)map.get(key);
            System.out.println(found.toString());
        }
        
        
        
    }
        
        
        
}
