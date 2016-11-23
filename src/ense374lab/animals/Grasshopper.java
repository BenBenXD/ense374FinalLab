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
public class Grasshopper {
private static final int MAX_AGE;
private static final int BREED;
private static final int MAX_HUNGER;
private static final int MAX_BIRTHS;
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
public Location location(){
    
}
public boolean checkBreed(){
    
}
public int breed(){
    
}
public void move(){
    
}
    
}
