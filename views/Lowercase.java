package views;

public class Lowercase extends Output {
    public Lowercase(char c) {
        super(c);
        switch(c) {
            case 'a':
                System.out.println("*.\n..\n..\n");
                break;
            case 'b':
                System.out.println("*.\n*.\n..\n");
                break;
            case 'c':
                System.out.println("**\n..\n..\n");
                break;
            case 'd':
                System.out.println("**\n.*\n..\n");
                break;
            case 'e':
                System.out.println("*.\n.*\n..\n");
                break;
            case 'f':
                System.out.println("**\n*.\n..\n");
                break;
            case 'g':
                System.out.println("**\n**\n..\n");
                break;
            case 'h':
                System.out.println("*.\n**\n..\n");
                break;
            case 'i':
                System.out.println(".*\n*.\n..\n");
                break;
            case 'j':
                System.out.println(".*\n**\n..\n");
                break;
            case 'k':
                System.out.println("*.\n..\n*.\n");
                break;
            case 'l':
                System.out.println("*.\n*.\n*.\n");
                break;
            case 'm':
                System.out.println("**\n..\n*.\n");
                break;
            case 'n':
                System.out.println("**\n.*\n*.\n");
                break;
            case 'o':
                System.out.println("*.\n.*\n*.\n");
                break;
            case 'p':
                System.out.println("**\n*.\n*.\n");
                break;
            case 'q':
                System.out.println("**\n**\n*.\n");
                break;
            case 'r':
                System.out.println("*.\n**\n*.\n");
                break;
            case 's':
                System.out.println(".*\n*.\n*.\n");
                break;
            case 't':
                System.out.println(".*\n**\n*.\n");
                break;
            case 'u':
                System.out.println("*.\n..\n**\n");
                break;
            case 'v':
                System.out.println("*.\n*.\n**\n");
                break;
            case 'w':
                System.out.println(".*\n**\n.*\n");
                break;
            case 'x':
                System.out.println("**\n..\n**\n");
                break;
            case 'y':
                System.out.println("**\n.*\n**\n");
                break;
            default:
                System.out.println("*.\n.*\n**\n");
        }
    }
}