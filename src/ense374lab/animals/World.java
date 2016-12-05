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
public class World {
public NewAnimal animal;
public int x;
public int y;
public NewAnimal addAnimal(){
    
}
public NewAnimal getAnimal(NewAnimal an){
    return an;
}
public Location map(int x,int y){
    
}
public static enum direction {
    
NORTH, SOUTH, EAST, WEST
};  
public enum Creature {
    grass,
    trees_shrubs,
    Bluejay,
    Caterpillar,
    Deer,
    Fox,
    Wolf,
    Hawk,
    Grasshopper,
    Mouse,
    Rabbit,
    Squirrel;


public static char WhatCreature(Creature organism) {
switch(organism) {
case Bluejay:
    return 'B';
case Caterpillar:
    return 'C';
case Deer:
    return 'D';
case Fox:
    return 'F';
case Grasshopper:
    return 'G';
case Hawk:
    return 'H';
case Mouse:
    return 'M';
case Rabbit:
    return 'R';
case Squirrel:
    return 'S';
case Wolf:
    return 'W';
case grass:
    return 'g';
case trees_shrubs:
    return 't';
default:
    return '#';
}
}
}


}
