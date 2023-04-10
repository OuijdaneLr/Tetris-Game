package fr.eseo.e3.poo.projet.blox.vue;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

import fr.eseo.e3.poo.projet.blox.modele.Coordonnees;
import fr.eseo.e3.poo.projet.blox.modele.Couleur;
import fr.eseo.e3.poo.projet.blox.modele.Element;
import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;


public class VuePiece {
	 public static final double MULTIPLIER_TEINTE = 0.7;

	    private final Piece piece;
	    private final int taille;

	    public VuePiece(Piece piece, int taille) {
	        this.piece = piece;
	        this.taille = taille;
	    }

	    public Color teinte(Color couleur) {
	        int r = couleur.getRed();
	        int g = couleur.getGreen();
	        int b = couleur.getBlue();

	        r = (int) (r + (255 - r) * MULTIPLIER_TEINTE);
	        g = (int) (g + (255 - g) * MULTIPLIER_TEINTE);
	        b = (int) (b + (255 - b) * MULTIPLIER_TEINTE);

	        return new Color(r, g, b);
	    }

	 
//	    public void afficherPiece(Graphics2D g2D) {
//	        Coordonnees refCoord = piece.getCoordonnees();
//	        List<Element> refElement = piece.getElement();
//
//	        for (Element e : piece.getElement()) {
//	            int x = e.getCoordonnees().getAbscisse() * taille;
//	            int y = e.getCoordonnees().getOrdonnee() * taille;
//
//	            if (e.equals(refElement)) {
//	               // g2D.setColor(teinte(((Element) refElement).getCouleur()));
//	            	g2D.setColor(teinte(refCoord.getCouleur()));
//	            } else {
//	                g2D.setColor(e.getCouleur());
//	            }
//
//	            g2D.fill3DRect(x, y, taille, taille, true);
//	        }
//	    }
	
	    
	    
	    public void afficherPiece(Graphics2D g2D) {
	        Coordonnees reference = this.piece.getCoordonnees();

	        for (Element e : this.piece.getElements()) {
	            Coordonnees coord = e.getCoordonnees();
	            Couleur couleur = e.getCouleur();
	            Color c = couleur.getCouleurPourAffichage();

	            if (coord.equals(reference)) {
	                c = teinte(c);
	            }

	            g2D.setColor(c);
	            g2D.fill3DRect(coord.getAbscisse() * taille, coord.getOrdonnee() * taille, taille, taille, true);
	        }
	    }
}
