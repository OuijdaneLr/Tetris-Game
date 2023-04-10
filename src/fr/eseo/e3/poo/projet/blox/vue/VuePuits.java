package fr.eseo.e3.poo.projet.blox.vue;

import javax.swing.JPanel;

import fr.eseo.e3.poo.projet.blox.modele.Puits;
import fr.eseo.e3.poo.projet.blox.modele.pieces.Piece;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.awt.Color;

public  class VuePuits extends JPanel implements PropertyChangeListener {
  // public  class VuePuits extends JPanel{
    public static final int TAILLE_PAR_DEFAUT = 50;
    private Puits puits;
    public int taille;
   
   
   private VuePiece vuePiece;

    public VuePuits(Puits puits) {
        this(puits, TAILLE_PAR_DEFAUT);
       
    }

    public VuePuits(Puits puits, int taille) {
        this.puits = puits;
        this.taille = taille;
        setPreferredSize(new Dimension(puits.getLargeur() * taille, puits.getProfondeur() * taille));
        setBackground(Color.WHITE);
       

    }

    public Puits getPuits() {
        return puits;
    }

    public int getTaille() {
        return taille;
    }

    public void setPuits(Puits puits) {
        this.puits = puits;
        setPreferredSize(new Dimension(puits.getLargeur() * taille, puits.getProfondeur() * taille));
       repaint();
    }

    public void setTaille(int taille) {
        this.taille = taille;
        setPreferredSize(new Dimension(puits.getLargeur() * taille, puits.getProfondeur() * taille));
        //repaint();
    }

    public VuePiece getVuePiece() {
        return vuePiece;
    }

    private  void setVuePiece(VuePiece vuePiece) {
        this.vuePiece = vuePiece;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.LIGHT_GRAY);
        int hauteur = puits.getProfondeur();
        int largeur = puits.getLargeur();
        for (int i = 0; i <= hauteur; i++) {
            g2d.drawLine(0, i * taille, largeur * taille, i * taille);
        }
        for (int i = 0; i <= largeur; i++) {
            g2d.drawLine(i * taille, 0, i * taille, hauteur * taille);
        }

        if (vuePiece != null) {
            vuePiece.afficherPiece(g2d);
        }
       
        g2d.dispose();
    }
    
    
    
    

    
    
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("pieceActuelle")) {
            VuePiece vuePiece = new VuePiece(puits.getPieceActuelle(), taille);
            setVuePiece(vuePiece);
            repaint();
        }
    }
   
    
}
