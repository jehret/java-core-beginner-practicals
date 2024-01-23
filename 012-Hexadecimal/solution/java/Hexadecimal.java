public class Hexadecimal {

    public static void main(String[] args) {
        char hexadecimalValue = 'C';
        switch (hexadecimalValue) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println(hexadecimalValue);
                break;
            case 'A':
                System.out.println(10);
                break;
            case 'B':
                System.out.println(11);
                break;
            case 'C':
                System.out.println(12);
                break;
            case 'D':
                System.out.println(13);
                break;
            case 'E':
                System.out.println(14);
                break;
            case 'F':
                System.out.println(15);
                break;
            default:
                System.out.println("This is not an hexadecimal value");
        }
    }

}
