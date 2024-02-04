public class Fomo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Message message = new Message();
        System.out.println(message.contactVoix("0064223664715"));
        System.out.println(message.contactVoix("skype", "jpejnesis"));
        System.out.println(message.contactTexte("skype", "jpejnesis"));
    }
    
}