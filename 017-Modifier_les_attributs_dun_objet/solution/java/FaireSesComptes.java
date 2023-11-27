/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jnesis
 */
public class FaireSesComptes {

    public static void main(String[] args) {
        Compte compteCourant=new Compte();
        compteCourant.type='C';
        compteCourant.solde=253.50f;
        Compte compteEpargne=new Compte();
        compteEpargne.type='E';
        compteEpargne.solde=1600f;
        
        compteCourant.solde=compteCourant.solde-56;
        compteCourant.solde=compteCourant.solde-35;
        compteCourant.solde=compteCourant.solde-15;
        compteCourant.solde=compteCourant.solde-125.50f;
        
        compteEpargne.solde=compteEpargne.solde-150;
        compteCourant.solde=compteCourant.solde+150;
        
        compteCourant.solde=compteCourant.solde-68;
        compteCourant.solde=compteCourant.solde-99;
        
        System.out.println("Il reste "+compteCourant.solde+" Euros en fin de semaine sur le compte courant");
        System.out.println("Il reste "+compteEpargne.solde+" Euros en fin de semaine sur le compte épargne");
        
    }
    
}
