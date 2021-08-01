import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class personajeanimacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class personajeanimacion extends Actor
{
    GifImage myGif = new GifImage("afkR.gif");
    public void act()
    {
        setImage(myGif.getCurrentImage());
    }
}
