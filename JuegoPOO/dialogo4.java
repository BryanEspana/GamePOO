import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dialogo4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dialogo4 extends World
{

    /**
     * Constructor for objects of class dialogo4.
     * 
     */
    public dialogo4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1190, 700, 1);
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new dialogo5());
        }
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        transparenteCompleto transparenteCompleto = new transparenteCompleto();
        addObject(transparenteCompleto,606,359);
    }
}
