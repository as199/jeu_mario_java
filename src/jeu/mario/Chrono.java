/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.mario;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author assane
 */
public class Chrono implements Runnable  {

    private final int PAUSE = 3; // temps d'attente entre deux tour de boucle
    @Override
    public void run() {
        
        while(true){
            JeuMario.scene.repaint();
                    
            try {
                Thread.sleep(PAUSE);
            } catch (InterruptedException ex) {
                Logger.getLogger(Chrono.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
