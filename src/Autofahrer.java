import java.util.Scanner;
public class Autofahrer { //
    public static void main(String[] args) {
        double kP100K = 4.7; // Liter
        double oVP1000K = 0.4; // Liter
        double dIK;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Fahrstrecke in Kilometern ein: ");
        dIK = scanner.nextDouble();
        scanner.close();
        double kv = (dIK / 100) * kP100K;
        double ov = (dIK / 1000) * oVP1000K;

        /* Man kann lediglich zwischen 1 und X Litern erwerben,
        nicht beispielsweise 0,6 Liter oder ähnliche Bruchteile */

        int oe = (int) (ov);
        double oel = (double) (ov);
        if (oel >= 0.5)
        {
            oe= oe +1;
        }

        System.out.println("Für die Fahrstrecke von " + dIK + " km benötigen Sie:");
        System.out.println("Kraftstoffverbrauch: " + kv + " Liter");
        System.out.println("Ölverbrauch: " + oe + " Liter " +"( "+ ov +" ) L " );
    }



    }

