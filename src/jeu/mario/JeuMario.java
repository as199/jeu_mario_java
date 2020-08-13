/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.mario;


import javax.swing.JFrame;

/**
 *
 * @author assane
 */
public class JeuMario {

    public static Scene scene; 
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame fenetre = new JFrame("Jeu style Mario réaliser par Assane Dione");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(700, 360);
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);
        fenetre.setAlwaysOnTop(true);
        // Instanciation de l'objet scene
        scene = new Scene();		
        fenetre.setContentPane(scene); // On associe la scene à la fenétre de l'application
        fenetre.setVisible(true);
    }
    
}
