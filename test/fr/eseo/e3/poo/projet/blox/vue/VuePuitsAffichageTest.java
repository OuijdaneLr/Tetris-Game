package fr.eseo.e3.poo.projet.blox.vue;

import static org.junit.jupiter.api.Assertions.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import fr.eseo.e3.poo.projet.blox.modele.Puits;
import fr.eseo.e3.poo.projet.blox.modele.UsineDePiece;
import fr.eseo.e3.poo.projet.blox.vue.VuePuits;


public class VuePuitsAffichageTest {
	


	 
	 public static void main(String[] args) {
	        JFrame frame = new JFrame("Puits");
	        Puits puits = new Puits();
	        VuePuits vuePuits = new VuePuits(puits);
	        frame.add(vuePuits);
	        frame.pack();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	        JFrame frame1 = new JFrame("Puits et taille");
	        frame1.add(new VuePuits(new Puits(), 50));
	        Puits puits1 = new Puits();
	        VuePuits vuePuits1 = new VuePuits(puits1);
	        frame1.add(vuePuits);
	        frame1.pack();
	        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame1.setLocationRelativeTo(null);
	        frame1.setVisible(true);
	    }
	
	
//
	 @Test
	    private void testConstructeurPuits() {
		// assertDoesNotThrow(() -> {
	        SwingUtilities.invokeLater(() -> {
	            // create a new JFrame with the title "Puits"
	            JFrame frame = new JFrame("Puits ");
	        	
	            // create an instance of VuePuits using the constructor with one parameter and add it to the JFrame
	            frame.add(new VuePuits(new Puits()));
	            // set the size of the JFrame to the preferred size of VuePuits
	            frame.pack();
	            // center the JFrame on the screen
	            frame.setLocationRelativeTo(null);
	            // set the default close operation to exit the application
	            //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	            // make the JFrame visible
	            frame.setVisible(true);
	         // wait for user input before closing the JFrame
	            //System.in.read();
	            // close the JFrame
	           // frame.dispose();
	        });
		// });
	        // wait for the GUI to be created
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	 }

	      
	    

	    @Test
	    private  void testConstructeurPuitsTaille() {
	    	assertDoesNotThrow(() -> {
	           SwingUtilities.invokeLater(() -> {
	            // create a new JFrame with the title "Puits et taille"
	           JFrame frame = new JFrame("Puits et taille");
	        	
	            // create an instance of VuePuits using the constructor with two parameters and add it to the JFrame
	            frame.add(new VuePuits(new Puits(), 50));
	            // set the size of the JFrame to the preferred size of VuePuits
	            frame.pack();
	            // center the JFrame on the screen
	            frame.setLocationRelativeTo(null);
	            // set the default close operation to exit the application
	            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	            // make the JFrame visible
	            frame.setVisible(true);
	         // wait for user input before closing the JFrame
	            //System.in.read();
	            // close the JFrame
	            frame.dispose();
	        });
	    	 });
	        // wait for the GUI to be created
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }


    

	    @Test
		public void testAjoutPieceVuePuits() {
			SwingUtilities.invokeLater(() -> {
				// create a new JFrame with the title "Puits avec piece"
				JFrame frame = new JFrame("Puits avec piece");
				// create an instance of VuePuits using the constructor with one parameter and add it to the JFrame
				Puits puits = new Puits();
				UsineDePiece.setMode(UsineDePiece.ALEATOIRE_PIECE);
			});
	    }}


	
	 
	 
