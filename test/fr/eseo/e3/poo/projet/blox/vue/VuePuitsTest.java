package fr.eseo.e3.poo.projet.blox.vue;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Dimension;

import org.junit.jupiter.api.Test;


import fr.eseo.e3.poo.projet.blox.modele.Puits;
import fr.eseo.e3.poo.projet.blox.vue.VuePuits;
public class VuePuitsTest {

	@Test
    public void testConstructeurAvecUnParametre() {
        Puits puits = new Puits();
        VuePuits vuePuits = new VuePuits(puits);
        assertEquals(VuePuits.TAILLE_PAR_DEFAUT, vuePuits.getTaille());
        assertSame(puits, vuePuits.getPuits());
    }
    
    @Test
    public void testConstructeurAvecDeuxParametres() {
        Puits puits = new Puits();
        int taille = 50;
        VuePuits vuePuits = new VuePuits(puits, taille);
        assertEquals(taille, vuePuits.getTaille());
        assertSame(puits, vuePuits.getPuits());
    }
    
    @Test
    public void testSetters() {
        Puits puits1 = new Puits();
        Puits puits2 = new Puits();
        int taille1 = 50;
        int taille2 = 50;
        VuePuits vuePuits = new VuePuits(puits1, taille1);
        
        assertEquals(new Dimension(puits1.getLargeur() * taille1, puits1.getProfondeur() * taille1), vuePuits.getPreferredSize());

        vuePuits.setPuits(puits2);
        
        assertSame(puits2, vuePuits.getPuits());
        assertEquals(new Dimension(puits2.getLargeur() * taille1, puits2.getProfondeur() * taille1), vuePuits.getPreferredSize());

        vuePuits.setTaille(taille2);
        assertSame(puits2, vuePuits.getPuits());
        assertEquals(taille2, vuePuits.getTaille());
        assertEquals(taille2, vuePuits.getTaille());
        assertEquals(new Dimension(puits2.getLargeur() * taille2, puits2.getProfondeur() * taille2), vuePuits.getPreferredSize());
        
    }
}

