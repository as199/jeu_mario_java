package jeu.mario;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import jeu.audio.Audio;

/**
 * 
 * @author assane
 */
public class Clavier implements KeyListener {
	@Override
	public void keyPressed(KeyEvent e) {
		if(JeuMario.scene.mario.isVivant() == true && JeuMario.scene.finDePartie() == false){
			// mario va vers la droite	
			if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				// Annule le d�calage de 1 cr�� par deplacementFond (PanJeu)
	        	if(JeuMario.scene.getxPos() == -1){ 
	        		JeuMario.scene.setxPos(0);
	        		JeuMario.scene.setxFond1(-50);
	        		JeuMario.scene.setxFond2(750);
	        	}
	        	JeuMario.scene.mario.setVersDroite(true);       	
	        	JeuMario.scene.mario.setMarche(true);
				JeuMario.scene.setDx(1);
			// mario va vers la gauche	
			}else if(e.getKeyCode() == KeyEvent.VK_LEFT){	
				// Annule le d�calage de 1 cr�� par deplacementFond (PanJeu)
	        	if(JeuMario.scene.getxPos() == 4431){ 
	        		JeuMario.scene.setxPos(4430);
	        		JeuMario.scene.setxFond1(-50);
	        		JeuMario.scene.setxFond2(750);
	        	}
				JeuMario.scene.mario.setVersDroite(false);       	
	        	JeuMario.scene.mario.setMarche(true);
				JeuMario.scene.setDx(-1);}			
			// mario saute
	        if(e.getKeyCode() == KeyEvent.VK_UP){ 
	        	JeuMario.scene.mario.setSaut(true);  
	        	Audio.playSound("/audio/saut.wav");
	        }
		}		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT){
			JeuMario.scene.mario.setMarche(false);
			JeuMario.scene.setDx(0);
		}				
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}
}
