
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2= scanner.nextDouble();
        System.out.println("A Soma dos números é: " + (n1 + n2));
        System.out.println("A Subtração dos números é: " + (n1 - n2));
        System.out.println("A Multiplicação dos números é: " + (n1 * n2));
        System.out.println("A Divisão dos números é: " + (n1 / n2));
    }
}
