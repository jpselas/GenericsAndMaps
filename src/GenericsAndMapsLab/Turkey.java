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
public class Turkey implements Comparable{
    private String name;
    private double weight;
    private int id;

    public Turkey(String name, double weight, int id) {
        this.name = name;
        this.weight = weight;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
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
        final Turkey other = (Turkey) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Turkey{" + "name=" + name + ", weight=" + weight + ", id=" + id + '}';
    }
    
    
    @Override
    public int compareTo(Object obj) {
        Turkey o = (Turkey)obj;
        
        return new CompareToBuilder()
               .append(this.id, o.id)
               .toComparison();
    }
    
    
    
    
}
