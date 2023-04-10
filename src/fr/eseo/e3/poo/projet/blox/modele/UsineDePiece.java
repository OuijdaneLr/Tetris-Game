package fr.eseo.e3.poo.projet.blox.modele;


import fr.eseo.e3.poo.projet.blox.modele.pieces.*;


import java.util.Random;

	public class UsineDePiece {
		public static final int ALEATOIRE_COMPLET = 0;
	    public static final int ALEATOIRE_PIECE = 1;
	    public static final int CYCLIC = 2;

	    public static int mode = ALEATOIRE_PIECE;
	    //private static int cyclicIndex = 2;
	    private static final Random random = new Random();
	   // private static boolean isIpiece = false;

	    private UsineDePiece() {
	        // On ne veut pas qu'une instance de cette classe soit créée, car toutes les méthodes sont statiques
	    }

	    public static void setMode(int mode) {
	        UsineDePiece.mode = mode;
	        //cyclicIndex = 0;
	    }
	    
	    public static int getMode() {
	        return mode;
	    }
	    
//	    /**
//	     * Crée une nouvelle pièce de façon cyclique, en respectant l'ordre des types de pièces
//	     * et les couleurs associées.
//	     * @return La pièce créée.
//	     */
//	    public static Piece creerPieceCyclique(Piece piece, int type, Coordonnees coordonnees) {
//	    	if(type == 1) {
//        		piece =  new OPiece(coordonnees, Couleur.ROUGE);
//        		piece = new IPiece(coordonnees, Couleur.ORANGE);
//        	}
//        	else if(type == 0){
//        		piece =  new OPiece(coordonnees, Couleur.ROUGE);
//        		piece = new IPiece(coordonnees, Couleur.ORANGE);
//        	}
//	        
//	        return piece;
//	    }
//	    
//
//	    public static Piece genererPiece() {
//	        Piece piece = null;
//	        Coordonnees coordonnees = new Coordonnees(2, 3);
//	        int type = 0;
//	        switch (mode) {
//	            case CYCLIC:
//		            type = random.nextInt(2);
//		        	System.out.println("cyclic - indice = "+type+", isIpiece = "+isIpiece);
//		            if (type == 0 && isIpiece == true) {
//	                    piece = new OPiece(coordonnees, Couleur.ROUGE);
//	                    isIpiece = false;
//	                } else if(type == 1 && isIpiece == false){
//	                    piece = new IPiece(coordonnees, Couleur.ORANGE);
//	                    isIpiece = true;
//	                } else if(type == 0 && isIpiece == false){
//	                    piece = new IPiece(coordonnees, Couleur.ORANGE);
//	                    isIpiece = true;
//	                } else if(type == 1 && isIpiece == true){
//	                    piece = new OPiece(coordonnees, Couleur.ROUGE);
//	                    isIpiece = false;
//	                }
//	                break;
//	                
//	            case ALEATOIRE_COMPLET:
//	                int typeAleatoire = random.nextInt(2);
//	                Couleur couleur = Couleur.values()[random.nextInt(Couleur.values().length)];
//	    	        
//	                switch (typeAleatoire) {
//	                    case 0:
//	    		        	System.out.println("aleat complet - indice = "+type+", isIpiece = "+isIpiece);
//	                        piece = new IPiece(new Coordonnees(2, 3), couleur);
//	                        isIpiece = true;
//	                        break;
//	                    case 1:
//
//	    		        	System.out.println("aleat complet - indice = "+type+", isIpiece = "+isIpiece);
//	                        piece = new OPiece(new Coordonnees(2, 3), couleur);
//	                        isIpiece = false;
//	                        break;
//	                }
//	                break;
//	                
//	            case ALEATOIRE_PIECE:
//	                int typePieceAleatoire = random.nextInt(2);
//	                
//	                switch (typePieceAleatoire) {
//	                    case 0:
//
//	    		        	System.out.println("aleat piece - indice = "+type+", isIpiece = "+isIpiece);
//	                        piece = new IPiece(new Coordonnees(2, 3), Couleur.ORANGE);
//	                        isIpiece = true;
//	                        break;
//	                    case 1:
//
//	    		        	System.out.println("aleat piece - indice = "+type+", isIpiece = "+isIpiece);
//	                        piece = new OPiece(new Coordonnees(2, 3), Couleur.ROUGE);
//	                        isIpiece = false;
//	                        break;
//	                }
//	                break; 
//        }
//        return piece;
//    
//	       /*
//	        //boolean b = true;
//	        if (mode == ALEATOIRE_COMPLET) {
//	            int type = random.nextInt(2);
//	        	System.out.println("ALEATOIRE_COMPLET - type ====>"+type);
//	            if(type == 0) {
//	        		piece =  new OPiece(coordonnees, couleur);
//	        	}
//	        	else if(type == 1){
//	        		piece = new IPiece(coordonnees, couleur);
//	        	}
//	            
//	        } else if (mode == ALEATOIRE_PIECE) {
//	            int type = random.nextInt(2);
//	        	System.out.println("ALEATOIRE_PIECE - type ====>"+type);
//	            if(type == 0) {
//	        		piece =  new OPiece(coordonnees, Couleur.ROUGE);
//	        	}
//	        	else if(type == 1){
//	        		piece = new IPiece(coordonnees, Couleur.ORANGE);
//	        	}
//	        } else  if (mode == CYCLIC) {
//
//	        	int type = random.nextInt(2);
//	        	System.out.println("CYCLIC - type ====>"+type);
//	        	piece = creerPieceCyclique(piece, type, coordonnees);
//	        }
//	        
//	        return piece;*/
//	    }
	    
	    static private boolean isModeCyclic=true;
	    
	    /**
	     * @return Piece
	     */
	    public static Piece genererPiece() {
	    	Couleur couleur = Couleur.values()[random.nextInt(Couleur.values().length)];
	    	Coordonnees coordonnees = new Coordonnees(2, 3);
	    	switch(mode) {
	    	case ALEATOIRE_COMPLET:
	    		//Random random;
	    		//random = new Random();
	    		if(random.nextBoolean())
	    			return new IPiece(new Coordonnees(2,3), couleur);
	    		else 
	    			return new OPiece(new Coordonnees(2,3), couleur);
	    		
	    	case ALEATOIRE_PIECE:
	    		//Random random2;
	    		//random2= new Random();
	    		if(random.nextBoolean())
	    			return new IPiece(coordonnees,Couleur.ORANGE);
	    		else
	    			return new OPiece(coordonnees,Couleur.ROUGE);
	    		
	    	case CYCLIC:
	    		if(isModeCyclic) {
	    			isModeCyclic=false;
	    			return new OPiece(coordonnees,Couleur.ROUGE);
	    		}
	    		else {
	    			isModeCyclic=true;
	    			return new IPiece(coordonnees,Couleur.ORANGE);
	    		}
	    		default:
	    			return null;
	    		
	    		}
	    		
	    	}
	    }
	
	
	