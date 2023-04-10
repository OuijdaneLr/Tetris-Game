package fr.eseo.e3.poo.projet.blox.modele.pieces;


import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;

public class OPieceTest {

	@Test
	public void testOPiece() {
		Coordonnees c = new Coordonnees(2,4);
		OPiece p= new OPiece(c, Couleur.BLEU);
		assertEquals(c, p.getCoordonnees(),"Error");
		assertEquals(Couleur.BLEU, p.getCouleur(),"Error");
		p.setCouleur(Couleur.ORANGE);
		assertEquals(Couleur.ORANGE, p.getCouleur(),"Error");
		
	
		assertEquals(2,p.getElement().get(0).getCoordonnees().getAbscisse(),"Error");
		assertEquals(2,p.getElement().get(1).getCoordonnees().getAbscisse(),"Error");
		assertEquals(3,p.getElement().get(2).getCoordonnees().getOrdonnee(),"Error");
		assertEquals(4,p.getElement().get(3).getCoordonnees().getOrdonnee(),"Error");
		 assertEquals(c,p.getCoordonnees(),"Error"); 

        assertEquals("OPiece :\n\t(2, 4) - BLEU\n\t(2, 3) - BLEU\n\t(3, 3) - BLEU\n\t(3, 4) - BLEU\n",p.toString(),"Error");
        
        assertEquals(2,p.getCoordonnees().getAbscisse(),"Error"); 
        assertEquals(4,p.getCoordonnees().getOrdonnee(),"Error"); 

	}

}
