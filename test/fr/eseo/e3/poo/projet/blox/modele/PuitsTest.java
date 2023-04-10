
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
	
	

}
