import java.util.Scanner;

public class NotasBimestrais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double n4 = scanner.nextDouble();
        System.out.println("A média bimestral deste aluno é: " + ((n1+n2+n3+n4)/4));

    }
}
