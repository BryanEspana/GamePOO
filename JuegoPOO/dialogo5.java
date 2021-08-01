import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dialogo5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dialogo5 extends World
{

    /**
     * Constructor for objects of class dialogo5.
     * 
     */
    public dialogo5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        personaje personaje = new personaje();
        addObject(personaje,530,480);
        cercas cercas = new cercas();
        addObject(cercas,675,556);
        removeObject(personaje);
        removeObject(cercas);
        personajeanimacion personajeanimacion = new personajeanimacion();
        addObject(personajeanimacion,546,487);
        cercas cercas2 = new cercas();
        addObject(cercas2,675,556);
        personajeanimacion.setLocation(644,351);
        cercas2.setLocation(723,573);
        removeObject(cercas2);
        removeObject(personajeanimacion);
        addObject(personajeanimacion,677,486);
        addObject(cercas2,671,576);
        removeObject(cercas2);
        addObject(cercas2,671,582);
        cercas2.setLocation(925,500);
        dog dog = new dog();
        addObject(dog,925,500);
        removeObject(cercas2);
        personajeanimacion.setLocation(677,573);
        addObject(cercas2,677,573);
        removeObject(cercas2);
        removeObject(personajeanimacion);
        addObject(personajeanimacion,704,478);
        personajeanimacion.setLocation(676,570);
        addObject(cercas2,676,570);
        removeObject(personajeanimacion);
        cercas2.setLocation(697,469);
        addObject(cercas2,674,569);
        removeObject(cercas2);
        personajeanimacion personajeanimacion2 = new personajeanimacion();
        addObject(personajeanimacion2,684,495);
        personajeanimacion2.setLocation(670,566);
        cercas cercas3 = new cercas();
        addObject(cercas3,670,566);
        removeObject(cercas3);
        removeObject(personajeanimacion2);
        personajeanimacion personajeanimacion3 = new personajeanimacion();
        addObject(personajeanimacion3,304,489);
        cercas cercas4 = new cercas();
        addObject(cercas4,672,588);
        cercas4.setLocation(1182,623);
        nextultimo nextultimo = new nextultimo();
        addObject(nextultimo,1182,623);
        removeObject(cercas4);
        addObject(cercas4,673,576);
        removeObject(nextultimo);
        cercas4.setLocation(1201,638);
        nextultimo nextultimo2 = new nextultimo();
        addObject(nextultimo2,1201,638);
        removeObject(cercas4);
        removeObject(nextultimo2);
        addObject(cercas4,670,560);
        nextultimo nextultimo3 = new nextultimo();
        addObject(nextultimo3,1022,318);
    }
}
