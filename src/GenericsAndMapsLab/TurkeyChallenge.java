/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsAndMapsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author John
 */
public class TurkeyChallenge {
    
    public static void main(String[] args) {
        
        Turkey t1 = new Turkey("Bily",20,10);
        Turkey t2 = new Turkey("Sally",10,7);
        Turkey t3 = new Turkey("John",22,1);
        Turkey t4 = new Turkey("Spencer",17,6);
        
        Set<Turkey> set = new TreeSet<>();
        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        
        
         List<Turkey> list = new ArrayList<>(set);
        // normal sort by ssn
        System.out.println("Normal sort by id");
        System.out.println(" ");
        Collections.sort(list);
        
        
        for(Turkey t : list){
            System.out.println(t);
        }
    }
    
    
}
