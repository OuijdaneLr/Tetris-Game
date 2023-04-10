package fr.eseo.e3.poo.projet.blox.modele;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

public class CouleurTest {


	@Test
	public void testGetCouleurPourAffichage() {
		assertEquals(Color.RED, Couleur.ROUGE.getCouleurPourAffichage(), "Error");
		assertEquals(Color.ORANGE, Couleur.ORANGE.getCouleurPourAffichage(), "Error");
		assertEquals(Color.BLUE, Couleur.BLEU.getCouleurPourAffichage(), "Error");
		assertEquals(Color.GREEN, Couleur.VERT.getCouleurPourAffichage(), "Error");
		assertEquals(Color.YELLOW, Couleur.JAUNE.getCouleurPourAffichage(), "Error");
		assertEquals(Color.CYAN, Couleur.CYAN.getCouleurPourAffichage(), "Error");
		assertEquals(Color.MAGENTA, Couleur.VIOLET.getCouleurPourAffichage(), "Error");
	}

}
