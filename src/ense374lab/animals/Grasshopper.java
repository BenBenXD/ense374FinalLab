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
public class Grasshopper extends NewAnimal{
private static final int MAX_AGE= 18;
private static final int MAX_HUNGER= 7;

private Field field;
public int age;
private String foodType;
public Location location;
private boolean alive;
private boolean hunger; 
            
public void Grasshopper(int age, Location location, boolean hunger){
    
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
public void increaseAge(){
age++;
if(age > MAX_AGE) {
death();
}
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
public void move(){
    
}
    
}
