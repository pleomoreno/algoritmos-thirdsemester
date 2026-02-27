import java.util.Calendar;
import java.util.Scanner;

public class TesteBubble {
    public static void main(String[] args) {
        NossoVetor v;
        int t;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\ndigite o tamanho do vetor (0 encerra): ");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();
            //System.out.println(v);
            System.out.println("ordenando...");
            long inicio = new Calendar().getTimeInMillis();
            v.bubbleSort();
            long fim = new Calendar().getTimeInMillis();
            System.out.println("tamanho: " + t + ", tempo: " + (fim-inicio) + " ms");
            //System.out.println(v);
            System.out.print("\ndigite o tamanho do novo vetor (0 encerra): ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}