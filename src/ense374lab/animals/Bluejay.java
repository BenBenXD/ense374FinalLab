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
public class Bluejay extends NewAnimal {
private static final int MAX_AGE= 20;
private static final int MAX_HUNGER=5;
 
public int age;
private String foodType;
public Location location;
private boolean alive;
private boolean hunger;
private Field field;
            
public void Bluejay(int age, Location location, boolean hunger){
    
}
public void death(){
  alive = false;
if(location != null)
{
field.clear(location);
location = null;
field=null;
}   
}
public void hunger(){
    
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
public void increaseAge(){
age++;
if(age > MAX_AGE) {
death();
}
}
public void move(){
    
}
    
}
