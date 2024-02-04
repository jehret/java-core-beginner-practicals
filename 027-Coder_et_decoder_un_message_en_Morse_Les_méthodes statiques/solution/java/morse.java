public class Morse {

    public static void main(String[] args) {
        String messageDetresse = Bateau.lettreVersMorse("S") + " "+ Bateau.lettreVersMorse("O") +" "+ Bateau.lettreVersMorse("S");
        
        System.out.println("Message de détresse :" + messageDetresse);
        
        String messageTraduit = Bateau.morseVersLettre("...") + Bateau.morseVersLettre("---") + Bateau.morseVersLettre("...");
        
        System.out.println(messageDetresse + " signifie : " + messageTraduit);
    
    }

}