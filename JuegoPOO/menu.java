import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    public GreenfootSound cancion_menu = new GreenfootSound("audio1.mp3");
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 710, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        /*Play play = new Play();
        addObject(play,956,263);
        exit exit = new exit();
        addObject(exit,957,436);
        info info = new info();
        addObject(info,1132,54);
        titulo titulo = new titulo();
        addObject(titulo,329,119);*/
        titulo titulo = new titulo();
        addObject(titulo,322,135);
        Play play = new Play();
        addObject(play,934,264);
        exit exit = new exit();
        addObject(exit,936,463);
        info info = new info();
        addObject(info,1112,69);
    }
}
