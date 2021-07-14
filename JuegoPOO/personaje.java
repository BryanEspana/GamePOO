import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class personaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class personaje extends Actor
{
    GifImage myGif = new GifImage("afkR.gif");
    GifImage afkaniR = new GifImage("afkR.gif");
    GifImage afkaniL = new GifImage("afkL.gif");
    GifImage walkaniR = new GifImage("walkR.gif");
    GifImage walkaniLeft = new GifImage("walkL.gif");
    GifImage runainL = new GifImage("RunL.gif");
    GifImage runR = new GifImage("RunR.gif");
    private double deltaX = 0;
    private double deltaY = 0;
    private int walkSpeed = 5;
    private int jumpHeight = 6;
    private boolean inTheAir = false;
    private int groundHeight = (getImage().getHeight())/2;
    private int sideWidht = (getImage().getWidth())/2;
    private World myWorld;
    private boolean facingLeft = false;
    private int paused = 15;
    int worldHeight;
    int worldWidth;
    private int speed = 2;
    private int vspeed = 0;
    private int acceleration = 2;
    private double fallspeed = 0.4;

    int count = 0;
    int conteo2 = 1;
    
    public void addedToWorld(World myWorld)
    {
        this.myWorld = myWorld;
        this.worldHeight = myWorld.getHeight();
        this.worldWidth = myWorld.getWidth();
    }
    public void act() 
    {
        setImage( myGif.getCurrentImage());
        GetCommand();
        if(inTheAir)
        {
            fall();
        }
        else{
            GetCommand();
        }
    }
    private void walk(String direction)
    {
        if(direction == "left")
            deltaX = walkSpeed*-1;
        else
            deltaX = walkSpeed;
    }
    private void stop()
    {
        deltaX = 0;
    }
    public void GetCommand()
    {
        if(Greenfoot.isKeyDown("Left") & Greenfoot.isKeyDown("shift"))
        {
            setImage(runainL.getCurrentImage());
            walk("left");
            moveLeft();
            myGif = runainL;
        }
        if(Greenfoot.isKeyDown("Right") & Greenfoot.isKeyDown("shift"))
        {
            setImage(runR.getCurrentImage());
            walk("right");
            moveRight();
            myGif = runR;
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            setImage(walkaniLeft.getCurrentImage());
            walk("left");
            moveLeft();
            myGif = walkaniLeft;
        }
        if(Greenfoot.isKeyDown("Right"))
        {
            walk("right");
            moveRight();
            myGif = walkaniR;
        }
        else
        {
            stop();
            if(facingLeft)
            {
                myGif = afkaniL;
            }
            else
            {
                myGif = afkaniR;
            }
        }
        if(Greenfoot.isKeyDown("up"));
        {
            jump();
        }
    }
    public void jump()
    {
        deltaY += jumpHeight;
        inTheAir = true;
    }
    public void onGround() 
    {
        double newX = getX() + deltaX;
        double newY = getY() - deltaY;
        
        Actor platformBelow = getOneObjectAtOffset (0, groundHeight +5, piso.class);
        if(platformBelow != null)
        {
            if(deltaY < 0)
            {
            deltaY = 0;
            inTheAir = false;
            GreenfootImage platformImage = platformBelow.getImage();
            int topOfPlatform = platformBelow.getY() - platformImage.getHeight()/2;
            newY = topOfPlatform - groundHeight;
        }
        } else if(getY()>= worldHeight - groundHeight)
        {
            deltaY = 0;
            inTheAir = false;
                
        }
        setLocation((int)newX,(int)newY);
    }
    public void fall()
    {
        deltaY -= fallspeed; 
    }
    public void moveLeft()
    {
        setLocation(getX()-speed, getY());
    }
    public void moveRight()
    {
        setLocation(getX()+speed, getY());
    }
    public void animate()
    {
        if(Greenfoot.isKeyDown("left")) facingLeft=true;
        if(Greenfoot.isKeyDown("Right")) facingLeft= false;
    }
    public void  aparecer()
    {
        
    }
}

