import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dialogo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dialogo2 extends World
{

    /**
     * Constructor for objects of class dialogo2.
     * 
     */
    public dialogo2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1190, 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        next next = new next();
        addObject(next,1058,640);
        removeObject(next);
        next2 next2 = new next2();
        addObject(next2,1049,636);
    }
}
