import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hoyo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class hoyo extends Actor
{
    /**
     * Act - do whatever the hoyo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    boolean edge = false;
    public void act()
    {
        count++;
        edge = false;
        if (edge = false){
        hitTheEdge();
        }
    }
    private void hitTheEdge()
    {
        int x = getX();
        World myWorld = getWorld();
        int myWorldWidth = myWorld.getWidth() - 1;
        if(x == 0 || x == myWorldWidth)
        {
            count = 120;
            edge = true;
        }
    }
}
