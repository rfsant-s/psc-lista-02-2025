import java.util.Scanner;

public class EuroTrip {

    public static void main(String[] args) {
   Scanner scanner = new Scanner (System.in);
        System.out.println("Informe o valor da passagem para Alemanha: ");
        double valor_ale = scanner.nextDouble ();
        System.out.println("Informe o valor da passagem para Portugal: ");
        double valor_por = scanner.nextDouble ();
        System.out.println("Informe o valor da passagem para Itália: ");
        double valor_ita = scanner.nextDouble ();
        System.out.println("Digite a quantidade total de pessoas que irão nesta viagem: ");
        double qtd_pessoas = scanner.nextDouble ();

        double total = valor_ale+valor_ita+valor_por;
        double soma_gastos = total*qtd_pessoas;
        System.out.println("O valor total da viagem somando a quantidade total de pessoas será: " + soma_gastos);
        System.out.println("Cada pessoa irá pagar: " + total);    
    }

    }