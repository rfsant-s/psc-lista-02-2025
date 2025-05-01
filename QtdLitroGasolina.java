import java.util.Scanner;
public class QtdLitroGasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Informe o valor do litro da gasolina: ");
        double valor = scanner.nextDouble();

        System.out.print("Informe a quantidade de litro solitada: ");
        double qtd_litro = scanner.nextDouble();

        System.out.print("O valor a ser pago é: " + valor * qtd_litro);
    }
}
