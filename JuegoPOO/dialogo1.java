import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dialogo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dialogo1 extends World
{

    /**
     * Constructor for objects of class dialogo1.
     * 
     */
    public dialogo1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1190, 690, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        next next = new next();
        addObject(next,1056,639);
    }
}
