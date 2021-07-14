import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fondo extends World
{

    /**
     * Constructor for objects of class fondo.
     * 
     */
    public fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200 , 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        personaje personaje = new personaje();
        addObject(personaje,218,470);
        Grama grama = new Grama();
        addObject(grama,923,602);
        grama.setLocation(709,667);
        grama.setLocation(859,656);
        grama.setLocation(703,635);
        grama.setLocation(807,639);
        grama.setLocation(743,631);
        grama.setLocation(763,627);
        grama.setLocation(949,622);
        grama.setLocation(696,627);
        grama.setLocation(785,645);
        piso piso = new piso();
        addObject(piso,785,645);
    }
}
