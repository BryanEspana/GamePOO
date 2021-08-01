import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class dog extends Actor
{
    GifImage Camina = new GifImage("walkdog.gif");
    GifImage afk = new GifImage("AFKdog.gif");
    private boolean facingLeft = false;
    public boolean mover = false;
    private double deltaX = 0;
    private double deltaY = 0;
    public void act()
    {  
        setImage(afk.getCurrentImage());
        getCommand();
    }
    private void getCommand()
    {
    if(Greenfoot.isKeyDown("Down"))
    {
        afk = Camina;

        move(10);
    } else 
    {
        stop();
        if(facingLeft)
        {
            afk = afk;
        }

    }
    }
    private void stop()
    {
        deltaX = 0;
    }
}
