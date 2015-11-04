/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsAndMapsLab;

import java.util.Comparator;

/**
 *
 * @author John
 */
public class SortByName implements Comparator<Turkey>{
    

    @Override
    public int compare(Turkey o1, Turkey o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
