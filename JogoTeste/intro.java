import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
    private int atraso = 0;
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(999, 718, 1); 
        prepare();
    }

    public void act(){
        //diálogo pers 1

        if  (Greenfoot.isKeyDown("enter") && (atraso == 0)){
            setBackground(new GreenfootImage("foto2.png"));
            atraso++;
        }//fim o if 1, , em que vai ser colocado a 2 img

        else{
            if(Greenfoot.isKeyDown("enter")){
                atraso = 0;
            }
        }

        if  (Greenfoot.isKeyDown("space")){
            setBackground(new GreenfootImage("img3.png"));
        }//fim o if 2, em que vai ser colocado a 3 img

        if  (Greenfoot.isKeyDown("shift")){
            mundo world = new mundo();
            Greenfoot.setWorld(world);

        }//fim o if 3

    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}
