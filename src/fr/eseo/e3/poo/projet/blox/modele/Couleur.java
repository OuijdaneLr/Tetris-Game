package fr.eseo.e3.poo.projet.blox.modele;
//
//public enum Couleur {
//
//		ROUGE,
//		ORANGE,
//		BLEU,
//		VERT,
//		JAUNE,
//		CYAN,
//		VIOLET;
//
//	 
//}

import java.awt.Color;

public enum Couleur {
	ROUGE(Color.RED),
	ORANGE(Color.ORANGE),
	BLEU(Color.BLUE),
	VERT(Color.GREEN),
	JAUNE(Color.YELLOW),
	CYAN(Color.CYAN),
	VIOLET(Color.MAGENTA);

	private final Color couleurPourAffichage;

	private Couleur(Color couleurPourAffichage) {
		this.couleurPourAffichage = couleurPourAffichage;
	}

	public Color getCouleurPourAffichage() {
		return couleurPourAffichage;
	}
}

