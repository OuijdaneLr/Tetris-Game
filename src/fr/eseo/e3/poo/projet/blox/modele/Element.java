package fr.eseo.e3.poo.projet.blox.modele;

public class Element {
	
	       private Coordonnees coordonnees;
	       private Couleur couleur;
	       
		public Coordonnees getCoordonnees() {
			return coordonnees;
		}
		public void setCoordonnees(Coordonnees coordonnees) {
			this.coordonnees = coordonnees;
		}
		public Couleur getCouleur() {
			return couleur;
		}
		public void setCouleur(Couleur couleur) {
			this.couleur = couleur;
		}
	       
		
		public Element(Coordonnees coordonnees) {
			this.coordonnees= coordonnees;
			this.couleur= Couleur.ROUGE;
		}
		
		public Element(int abscisse, int ordonnee) {
			this.coordonnees = new Coordonnees (abscisse, ordonnee);
			this.couleur=Couleur.ROUGE;
			
		}
		
		public Element(Coordonnees coordonnees , Couleur couleur) {
			this.coordonnees= coordonnees;
			this.couleur=couleur;
			
		}
		
		public Element(int abscisse, int ordonnee, Couleur couleur) {
			this.couleur=couleur;
			//coordonnees.setAbscisse(abscisse);
			//coordonnees.setOrdonnee(ordonnee);
			this.coordonnees= new Coordonnees(abscisse, ordonnee);
		}
		@Override
		public String toString() {
			return coordonnees.toString()+" - "+ couleur.toString();
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((coordonnees == null) ? 0 : coordonnees.hashCode());
			result = prime * result + ((couleur == null) ? 0 : couleur.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Element other = (Element) obj;
			if (coordonnees == null) {
				if (other.coordonnees != null)
					return false;
			} else if (!coordonnees.equals(other.coordonnees))
				return false;
			if (couleur != other.couleur)
				return false;
			return true;
		}

		
		
		
	}


