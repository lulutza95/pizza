import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        System.out.println("cum va numiti?");
        String om = a.nextLine();
        System.out.println("In cat timp doriti sa va angajati " + om +" ?");
        String om2= a.nextLine();
        System.out.println("Care sunt pasii pe care trebuie sa ii urmezi pentru a te putea angaja " +om +" ?");
        String om3 = a.nextLine();
        System.out.println("De cand doresti sa incepi " + om +" ?");
        String om4= a.nextLine();
        System.out.println(" Va multumesc pentru timpul acordat si raspunsurile date,vom reveni cat de " +
                "curand " + om);
    }
}
