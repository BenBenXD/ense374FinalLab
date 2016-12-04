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
public class NewAnimal {
    private static final int MAX_AGE;
    private String  name;
    private String type;
    private int age;
    private boolean alive;
    public Location location;
    public boolean hunger;
    public String foodType;
    private Field field;
    
public void NewAnimal(String n, int ag, void breed, void death, Location location, void hunger){
    
}
public String name(){
    
}
private String Type(){
    
}
public int age(int a){
    
}
public void increaseInAge(){
 age++;
if(age > MAX_AGE) {
death();
}   
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
public void breed(){
    
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
public void Hunger(){
    
}
public void hunt(){
    
}
public int addAnimal(){
    
}
public list addAnimalList(){
    
}
    
    
    
}
