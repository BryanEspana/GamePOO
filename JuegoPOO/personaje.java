        import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
            /**
            * Write a description of class doctor here.
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
        GifImage runainR = new GifImage("RunR.gif");
        GifImage subir = new GifImage("walkR.gif");
        GifImage morir = new GifImage("dead.gif");
        public GreenfootSound cancion_nivel1A = new GreenfootSound("audio2.mp3");
        public GreenfootSound cancion_menu = new GreenfootSound("audio1.mp3");
        public GreenfootSound caminar = new GreenfootSound("run.mp3");

        private boolean cambio = true;
        int speed = 2;
        int count = 0;
        int conteo2 = 1;
        private int jumpHeight = 10;
        private int walkSpeed = 4;
        private int RunSpeed = 8;
        private double fallSpeed = 0.4;
        private boolean facingLeft = false;
        private int pausem = 50;
        private int paused = 15;
        private boolean disparoani = false;
        private boolean tocarHoyo = false;
        private boolean tocarDog = false;
        private boolean inTheAir = false;
        private double deltaX = 0;
        private double deltaY = 0;
        private int groundHeight = (getImage().getHeight())/2;
        private int sideWidht = (getImage().getWidth())/2;
        private World myWorld;
        int worldHeight;
        int worldWidth;

        
        public void addedToWorld(World myWorld)
        {
            this.myWorld = myWorld;
            this.worldHeight = myWorld.getHeight();
            this.worldWidth = myWorld.getWidth();
        }
        public void act() 
        {
            setImage(myGif.getCurrentImage());
            if(tocarHoyo)
            {
                muerte();
            }
            else{
            if(inTheAir)
            {
                fall();
            }
            else{
                getCommand();
            }
            move();
            aparecer();
            animate();
            hoyoHit();
            hitDog();
        }
        //if(cambio){
        //    canciones();
        //    cambio = false;
        //    cancion_menu.setVolume (50);
        //}
        //if(cancion_menu.isPlaying() == false){cancion_menu.play();}
        }
        private void run(String direction)
        {
            if(direction == "left")
                deltaX = RunSpeed*-1;
            else
                deltaX = RunSpeed;
        }
        /**public void canciones()
        {
            if (getWorld() instanceof fondo2){
                cancion_menu.stop();
                cancion_menu = cancion_nivel1A;
            }
                if (getWorld() instanceof fondo2){
                cancion_menu.stop();
                cancion_menu = cancion_nivel1A;
            }
                if (getWorld() instanceof menu){
                cancion_menu.stop();
                cancion_menu = cancion_menu;
            }
        }
        */
        private void walk(String direction)
        {
            if(direction == "left")
                deltaX =walkSpeed*-1;
            else
                deltaX = walkSpeed;
        }
        private void stop()
        {
            deltaX = 0;
        }
        private void jump()
        {
            deltaY += jumpHeight;
            inTheAir = true;
        }
        private void fall()
        {
            deltaY -= fallSpeed;
        }
        private void move()
        {
            double newX = getX() + deltaX;
            double newY = getY() - deltaY;
            Actor underBox = getOneObjectAtOffset(0,groundHeight, Grama.class);
            if(underBox != null)
            {
                if(deltaY < 0)
            {
                deltaY = 0;
                inTheAir = false;
                GreenfootImage platformImage = underBox.getImage();
                int topOfPlatform = underBox.getY() - platformImage.getHeight()/2;
                newY = topOfPlatform - groundHeight;
            }
            } else if(getY()>= worldHeight - groundHeight)
            {
                deltaY = 0;
                inTheAir = false;
                
            } else  {
                inTheAir = true;
            }
            Actor under = getOneObjectAtOffset(0,groundHeight + 5, Grama.class);
            if(under != null)
            {
                if(deltaY < 0)
                {
                deltaY = 0;
                inTheAir = false;
                GreenfootImage platformImage = under.getImage();
                int topOfPlatform = under.getY() - platformImage.getHeight()/2;
                newY = topOfPlatform - groundHeight;
            }
            } else if(getY()>= worldHeight - groundHeight)
            {
                deltaY = 0;
                inTheAir = false;
                
            } else  {
                inTheAir = true;
            }
            setLocation((int)newX,(int)newY);
        }
        private void getCommand()
        {
        ScrollingWorld meineWelt;
        meineWelt = (ScrollingWorld)this.getWorld();
        if(Greenfoot.isKeyDown("left") & Greenfoot.isKeyDown("shift"))
        {
            run("left");
            myGif = runainL;
            meineWelt.changeBackgroundX(-10);
        }
        else if(Greenfoot.isKeyDown("right") & Greenfoot.isKeyDown("shift"))
        {
            run("right");
            myGif = runainR;
            meineWelt.changeBackgroundX(10);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            //walk("left");
            myGif = walkaniLeft;
            meineWelt.changeBackgroundX(-8);
            /**if (caminar.isPlaying() != true){
            caminar.stop();
            caminar.play();}*/
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            //walk("right");
            myGif = walkaniR;
            meineWelt.changeBackgroundX(8);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            jump();
            meineWelt.changeBackgroundX(+-5);
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
        }}
        private void muerte()
        {
            myGif = morir;
            if (pausem>0){pausem--;}
            else{
            World myWorld = getWorld();
            myWorld.removeObject(this);
            GameOver gameover = new GameOver();
            myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
        }
        }
        private void animate()
        {
           if (Greenfoot.isKeyDown("left")) facingLeft = true;
           if (Greenfoot.isKeyDown("right")) facingLeft = false;
        
        }
    public void aparecer()
    {
        if (getWorld().getObjects(hoyo.class).isEmpty()){
        if (getWorld() instanceof ScrollingWorld){
        getWorld().addObject(new personaje(),91,685);}
    }
    }
    private void hoyoHit()
    {
        Actor hoyoHit = getOneIntersectingObject(hoyo.class);
        if(hoyoHit != null)
            {tocarHoyo = true;
    }
    }
    private void hitDog()
    {
        Actor hitDog = getOneIntersectingObject(dogL.class);
        if(hitDog != null)
            {tocarDog = true;
    }
    }
}

