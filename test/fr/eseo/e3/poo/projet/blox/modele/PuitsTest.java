/*package fr.eseo.e3.poo.projet.blox.modele;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Puits;
import fr.eseo.e3.poo.projet.blox.modele.pieces.IPiece;
import fr.eseo.e3.poo.projet.blox.modele.pieces.OPiece;
import org.junit.jupiter.api.BeforeEach;

	 public class PuitsTest {

	 	private Puits puits;

	 	@BeforeEach
	 	public void setUp() throws Exception {
	 		this.puits = new Puits();
	 	}

	 	@Test
	 	public void testConstructeur() {
	 		assertEquals(Puits.LARGEUR_PAR_DEFAUT, this.puits.getLargeur());
	 		assertEquals(Puits.PROFONDEUR_PAR_DEFAUT, this.puits.getProfondeur());

	 		this.puits = new Puits(10, 20);
	 		assertEquals(10, this.puits.getLargeur(),"Error");
	 		assertEquals(20, this.puits.getProfondeur(),"Error");
	 	}

	 	@Test
	 	public void testSetLargeur() {
	 		assertThrows(IllegalArgumentException.class, () -> {
	 			this.puits.setLargeur(4);
	 		});
	 		assertThrows(IllegalArgumentException.class, () -> {
	 			this.puits.setLargeur(16);
	 		});
	 		this.puits.setLargeur(10);
	 		assertEquals(10, this.puits.getLargeur());
	 	}

	 	@Test
	 	public void testSetProfondeur() {
	 		assertThrows(IllegalArgumentException.class, () -> {
	 			this.puits.setProfondeur(14);
	 		});
	 		assertThrows(IllegalArgumentException.class, () -> {
	 			this.puits.setProfondeur(26);
	 		});
	 		this.puits.setProfondeur(20);
	 		assertEquals(20, this.puits.getProfondeur());
	 	}

	 	@Test
	 	public void testGetSetPieceSuivante() {
	 		OPiece piece = new OPiece(new Coordonnees(0, 0), Couleur.BLEU);
	 		this.puits.setPieceSuivante(piece);

	 		assertEquals(piece, this.puits.getPieceSuivante());

	 		IPiece piece2 = new IPiece(new Coordonnees(0, 0), Couleur.JAUNE);
	 		this.puits.setPieceSuivante(piece2);

	 		assertEquals(piece, this.puits.getPieceActuelle());
	 		assertEquals(piece2, this.puits.getPieceSuivante());
	 	}

	 	@Test
	 	void testToString() {
	 		String expected = "Puits : Dimension" + Puits.LARGEUR_PAR_DEFAUT + " * " + Puits.PROFONDEUR_PAR_DEFAUT
	 				+ "\nPiece Actuelle : <aucune>\nPiece suivante : <aucune>\n";
	 		assertEquals(expected, this.puits.toString());

	 		OPiece piece = new OPiece(new Coordonnees(0, 0), Couleur.BLEU);
	 		this.puits.setPieceSuivante(piece);

	 		expected = "Puits : Dimension" + Puits.LARGEUR_PAR_DEFAUT + " * " + Puits.PROFONDEUR_PAR_DEFAUT
	 				+ "\nPiece Actuelle : <aucune>\nPiece suivante : " + piece.toString() + "\n";
	 		assertEquals(expected, this.puits.toString());
	 	}
	 }
	

*/

package fr.eseo.e3.poo.projet.blox.modele;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;


import fr.eseo.e3.poo.projet.blox.modele.pieces.IPiece;
import fr.eseo.e3.poo.projet.blox.modele.pieces.OPiece;
import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;

public class PuitsTest {
	
	
	private Puits puits;
	
	@Before
	public void setUp() {
		puits = new Puits();
	}
	
	
	@Test
	  public void testConstructeurParDefaut() {
	    Puits puits = new Puits();
	    assertNotNull(puits);
	    assertEquals(6, puits.getLargeur());
	    assertEquals(17, puits.getProfondeur());
	    assertNull(puits.getPieceActuelle());
	    assertNull(puits.getPieceSuivante());
	    assertEquals("Puits : Dimension 6 x 17\nPiece Actuelle : <aucune>\nPiece Suivante : <aucune>\n",puits.toString(),"Error");
	  }

	@Test
	  public void testConstructeurAvecParametres() {
	    Puits puits = new Puits(8, 20);
	    assertNotNull(puits);
	    assertEquals(8, puits.getLargeur());
	    assertEquals(20, puits.getProfondeur());
	    assertNull(puits.getPieceActuelle());
	    assertNull(puits.getPieceSuivante());
	  }

	  @Test(expected=IllegalArgumentException.class)
	  public void testConstructeurAvecParametresMauvaisesValeurs() {
	    Puits puits = new Puits(3, 30);
	  }

	@Test
	public void testGetLargeur() {
		assertEquals(6, puits.getLargeur());
	}

	@Test
	public void testSetLargeur() {
		puits.setLargeur(10);
		assertEquals(10, puits.getLargeur());
	}

	

	@Test
	public void testGetProfondeur() {
		assertEquals(17, puits.getProfondeur());
	}

	@Test
	public void testSetProfondeur() {
		puits.setProfondeur(20);
		assertEquals(20, puits.getProfondeur());
	}
	/*
	@Test(expected = IllegalArgumentException.class)
	public void testSetProfondeurTooSmall() {
		puits.setProfondeur(14);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetProfondeurTooLarge() {
		puits.setProfondeur(26);
	}*/
	
	@Test
 	public void testGetSetPieceSuivante() {
 		OPiece piece = new OPiece(new Coordonnees(0, 0), Couleur.BLEU);
 		this.puits.setPieceSuivante(piece);

 		assertEquals(piece, this.puits.getPieceSuivante());

 		IPiece piece2 = new IPiece(new Coordonnees(0, 0), Couleur.JAUNE);
 		this.puits.setPieceSuivante(piece2);

 		assertEquals(piece, this.puits.getPieceActuelle());
 		assertEquals(piece2, this.puits.getPieceSuivante());
 	}
	
	
//	@Test
//	public void testToString() {
//		
//		String expected = "Puits : Dimension" + Puits.LARGEUR_PAR_DEFAUT + " x  " + Puits.PROFONDEUR_PAR_DEFAUT
// 				+ "\nPiece Actuelle : <aucune>\nPiece suivante : <aucune>\n";
// 		assertEquals(expected, puits.toString());
//
// 		OPiece piece = new OPiece(new Coordonnees(0, 0), Couleur.BLEU);
// 		puits.setPieceSuivante(piece);
//
// 		expected = "Puits : Dimension" + Puits.LARGEUR_PAR_DEFAUT + " * " + Puits.PROFONDEUR_PAR_DEFAUT
// 				+ "\nPiece Actuelle : <aucune>\nPiece suivante : " + piece.toString() + "\n";
// 		assertEquals(expected, this.puits.toString());
//	}
}