
import java.util.Scanner;

public class AvatarTester {
public static void main (String [] args)
{
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the name of your avatar: ");
    String name = in.nextLine();
    Avatar avatar1 = new Avatar(name, 0);

    for(int i = 1; i < 4; i++) {
        System.out.println("Please enter the level for game " + i + ": ");
        int newLevel = in.nextInt();
        avatar1.setLevel(newLevel);
    }
    System.out.println("Avatar Name: " + avatar1.getName() + "\nLevel: " + avatar1.getLevel());



}
}