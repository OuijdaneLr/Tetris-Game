

package fr.eseo.e3.poo.projet.blox.modele;

import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;
import fr.eseo.e3.poo.projet.blox.modele.pieces.IPiece;
import fr.eseo.e3.poo.projet.blox.modele.pieces.OPiece;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class UsineDePieceTest {

	@BeforeClass
	public static void setUpClass() {
		System.out.println("Invoked once before all tests");
	}
	
    @Test
    public void testGenererPieceAleatoireComplet() {
        UsineDePiece.setMode(UsineDePiece.ALEATOIRE_COMPLET);
        Piece piece = UsineDePiece.genererPiece();
        assertNotNull(piece);
        System.out.println("Le mode : "+UsineDePiece.getMode()+" La piece : "+piece.toString());
    }

    @Test
    public void testGenererPieceAleatoirePiece() {
        UsineDePiece.setMode(UsineDePiece.ALEATOIRE_PIECE);
        Piece piece = UsineDePiece.genererPiece();
        assertNotNull(piece);
        System.out.println("Le mode : "+UsineDePiece.getMode()+" La piece : "+piece.toString());
    }

    @Test
    public void testGenererPieceCyclique() {
        UsineDePiece.setMode(UsineDePiece.CYCLIC);
        Piece piece = UsineDePiece.genererPiece();
      
        System.out.println("Le mode : "+UsineDePiece.getMode()+" La piece : "+piece.toString());
    }
}



