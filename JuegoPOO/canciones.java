    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class canciones here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class canciones extends Actor
    {
        public GreenfootSound cancion_nivel1A = new GreenfootSound("audio2.mp3");
        public GreenfootSound cancion_menu = new GreenfootSound("audio1.mp3");
        public GreenfootSound caminar = new GreenfootSound("caminar.mp3");
        public GreenfootSound trotar = new GreenfootSound("trotar.mp3");
        private boolean cambio = true;
        /**
         * Act - do whatever the canciones wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
    public void act() 
    {
        if(cambio){
            canciones();
            cambio = false;
            cancion_menu.setVolume (30);
        }
        if(cancion_menu.isPlaying() == false){cancion_menu.play();}
    }    
    public void canciones()
    {
        if (getWorld() instanceof ScrollingWorld){
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
