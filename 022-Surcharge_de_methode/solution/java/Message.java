/**
 *
 * @author jnesis
 */
public class Message {
    
    public String contactVoix(String telephone){
        return contactVoix("téléphone",telephone);
    }
    
    public String contactVoix(String moyen, String identifiant){
        return "Tentative de contact voix avec "+identifiant+" par "+moyen;
    }
    
    public String contactTexte(String email){
        return contactVoix("email",email);
    }
    
    public String contactTexte(String moyen, String identifiant){
        return "Tentative de contact texte avec "+identifiant+" par "+moyen;
    }
    
}
