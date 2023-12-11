import java.util.Random;

public class De {
    
    int lancerDe(){
        Random r = new Random();
        return r.ints(1, (6 + 1)).findFirst().getAsInt();        
    }
    
}