import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenfootSound cancion_menu = new GreenfootSound("audio1.mp3");
    public GreenfootSound cancion_nivel1A = new GreenfootSound("audio2.mp3");
    private boolean cambio = true;
    public void act()
    {
        cancion_menu.play();
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new dialogo1());
        if(cambio){
            canciones();
            cambio = false;
            cancion_menu.setVolume (30);
        }
            if(cancion_menu.isPlaying() == false){cancion_nivel1A.play();}
    }
    }
        public void canciones()
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
}
