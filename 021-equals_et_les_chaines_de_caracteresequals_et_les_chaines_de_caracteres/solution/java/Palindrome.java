public class Palindrome {
    
    public static void main(String... args){
        String original="saucisses";
        String inverse=new StringBuilder(original).reverse().toString();
        if (original.equals(inverse)){
            System.out.println(original+" est un palindrome");
        }
        else {
            System.out.println(original+" n'est pas un palindrome");
        }
        original="essayasse";
        inverse=new StringBuilder(original).reverse().toString();
        if (original.equals(inverse)){
            System.out.println(original+" est un palindrome");
        }
        else {
            System.out.println(original+" n'est pas un palindrome");
        }
    }

}