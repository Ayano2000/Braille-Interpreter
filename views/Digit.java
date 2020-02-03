package views;

public class Digit extends Output {
    public Digit(char c) {
        super(c);
        switch(c) {
            case '0':
                System.out.println("*.\n..\n..\n**\n");
                break;
            case '1':
                System.out.println("*.\n*.\n..\n**\n");
                break;
            case '2':
                System.out.println("**\n..\n..\n**\n");
                break;
            case '3':
                System.out.println("**\n..\n..\n**\n");
                break;
            case '4':
                System.out.println("**\n.*\n..\n**\n");
                break;
            case '5':
                System.out.println("*.\n.*\n..\n**\n");
                break;
            case '6':
                System.out.println("**\n*.\n..\n**\n");
                break;
            case '7':
                System.out.println("**\n**\n..\n**\n");
                break;
            case '8':
                System.out.println("*.\n**\n..\n**\n");
                break;
            default:
                System.out.println(".*\n*.\n..\n**\n");
        }
    }
}