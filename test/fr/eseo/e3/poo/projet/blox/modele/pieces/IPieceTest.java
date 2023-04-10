package fr.eseo.e3.poo.projet.blox.modele.pieces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.pieces.IPiece;
public  class IPieceTest {

	@Test
	public void testIPiece() {
		Coordonnees c= new Coordonnees(2,5);
		IPiece p= new IPiece(c, Couleur.BLEU);
		assertEquals(new Coordonnees(2,5), p.getCoordonnees(),"Error");
		assertEquals(Couleur.BLEU,p.getCouleur(),"Error");
		
		p.setCouleur(Couleur.JAUNE);
		assertEquals(Couleur.JAUNE, p.getCouleur(),"Error");
		
		assertEquals(2,p.getElement().get(0).getCoordonnees().getAbscisse(),"Error");
		assertEquals(4,p.getElement().get(1).getCoordonnees().getOrdonnee(),"Error");
		assertEquals(3,p.getElement().get(2).getCoordonnees().getOrdonnee(),"Error");
		assertEquals(6,p.getElement().get(3).getCoordonnees().getOrdonnee(),"Error");

		//p.setPosition(2,6);
        assertEquals(2,p.getCoordonnees().getAbscisse(),"Error"); 
        assertEquals(5,p.getCoordonnees().getOrdonnee(),"Error"); 
		
        
	}

}
