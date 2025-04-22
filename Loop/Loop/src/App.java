import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int contador1 = 0;
        while (contador1 <= 50) {
            System.out.println(contador1++);
        }
        double numero;
        double soma = 0;
        System.out.print("Digite um número positivo (ou um número negativo para encerrar): ");
        numero = scanner.nextDouble();

        while (numero >= 0) {
            soma += numero;
            System.out.print("Digite outro número positivo (ou um número negativo para encerrar): ");
            numero = scanner.nextDouble();
        }
        System.out.println("A soma dos números positivos é: " + soma);

        System.out.println("Digite a senha:");
        int senha = scanner.nextInt();
        while (senha != 2007) {
            System.out.println("Senha inválida");
            System.out.println("Digite a senha:");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso permitido");

        int a = 0;
        int b = 1;
        int contador = 0;

        while (contador < 10) {
            System.out.print(a);

            if (contador < 9) {
                System.out.print(", ");
            }

            int proximo = a + b;
            a = b;
            b = proximo;
            contador++;
        }

        System.out.println(" Atividade Do While");

        int numero5 = 0;
        do {
            System.out.println("Digite um numero de 1 a 100");
            numero5 = scanner.nextInt();
        } while (numero5 < 1 || numero5 > 100);

        System.out.println("Numero digitado: " + numero5);

        int escolha = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção:");
            escolha = scanner.nextInt();

        } while (escolha < 1 || escolha > 3);
        System.out.println("Opção escolhida: " + escolha);
        if (escolha == 1 || escolha == 2) {
            System.out.println("Adicionando...");
        } else if (escolha == 3) {
            System.out.println("Saindo...");
        }
        Random sorteio= new Random();
           int minimo = 1;
          int  maximo = 20;
        int adivinha = 0;
        int numeroSortido = minimo + sorteio.nextInt(maximo - minimo + 1);
            int chances=0;
        
        do { System.out.println("Adivinhe o número entre 1 e 20:");
            adivinha = scanner.nextInt();
            
            chances++;
        }
            
            while (adivinha !=numeroSortido  );
        System.out.println(" Voce acertou o numero sorteado foi: " + numeroSortido + " " + "Voce teve " + (chances++));

        System.out.println("Deu certo");


        

    }

}
