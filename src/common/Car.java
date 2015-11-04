/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

/**
 *
 * @author John
 */
public class Car implements Comparable{
    private String vinNumber;

    public int compareTo(Object o) {
        Car targetCar = (Car)o;
        return this.getVinNumber().compareTo(targetCar.getVinNumber());
     
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.vinNumber != null ? this.vinNumber.hashCode() : 0);
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
        final Car other = (Car) obj;
        if ((this.vinNumber == null) ? (other.vinNumber != null) : !this.vinNumber.equals(other.vinNumber)) {
            return false;
        }
        return true;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }
    
    
    
}
