public class Bateau {
    String nom;
    
    static String lettreVersMorse(String lettre) {
        if(lettre.equals("S")){
            return "...";
        } else if(lettre.equals("O")){
            return "---";
        } else {
            return " ";
        }
    }
    
    static String morseVersLettre(String morse) {
        if(morse.equals("...")){
            return "S";
        } else if(morse.equals("---")){
            return "O";
        } else {
            return " ";
        }
    }
}