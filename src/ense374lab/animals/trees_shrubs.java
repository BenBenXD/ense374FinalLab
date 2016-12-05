/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense374lab.animals;

/**
 *
 * @author BenBen
 */
public class trees_shrubs {
private static final int MAX_AGE=45;
 
public int age;
public Location location;
private boolean alive;
private boolean hunger;
private Field field;
            
public void trees_shrubs(int age, Location location){
    
}
public int increaseAge(){
 age++;
if(age > MAX_AGE) {
death();
}   
}
public void death(){
    
}
public void setlocation(Location newLocation){
   if(location != null) {
field.clear(location);
}
location = newLocation;
field.place(this, newLocation); 
}
public Location getlocation(){
    return location;
}
    
}
