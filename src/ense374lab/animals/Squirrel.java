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
public class Squirrel {
private static final int MAX_AGE;
private static final int BREED;
private static final int MAX_HUNGER;
private static final int MAX_BIRTHS;
 
public int age;
private String foodType;
public Location location;
private boolean alive;
private boolean hunger; 
 private Field field;           
public void Squirrel(int age, Location location, boolean hunger){
    
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
public void setlocation(Location newLo){
   if(location != null) {
field.clear(location);
}
location = newLo;
field.place(this, newLo); 
}
public Location getlocation(){
    return location;
}
public boolean checkBreed(){
    
}
public int breed(){
    
}
public void move(){
    
}
    
}
