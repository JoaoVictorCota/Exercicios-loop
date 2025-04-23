import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ATIVIDADE WHILE");
        System.out.println("-------------------------------");
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
            System.out.println(" ");
            System.out.println("-------------------------------");
            System.out.println(" Atividade Do While");
            System.out.println("-------------------------------");
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




                int nota=0;
                double soma5 = 0;
                int quantidadeNotas = 0;
                String continuar;
        do {
            System.out.print("Digite uma nota (0 a 10): ");
            double nota1 = scanner.nextDouble();

            
            if (nota1 >= 0 && nota <= 10) {
                soma5 += nota;
                quantidadeNotas++;
            } else {
                System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
                continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        if (quantidadeNotas > 0) {
                double media = soma5 / quantidadeNotas;
            System.out.printf("Média das notas: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
                int tabuada = 5;    
            System.out.println("-------------------------------");   
            System.out.println("ATIVIDADE FOR");
            System.out.println("-------------------------------");
for ( int i = 1; i <= 10; i++){
                int resultado = tabuada * i;
        System.out.println(tabuada + " x " + i + " = " + resultado);
}
System.out.print("Digite um número para fatorial: ");
                int numero2 = scanner.nextInt();

                int fatorial = 1;
    

    for (int i = 1; i <= numero2; i++) {
                fatorial *= i;
    }

        System.out.println("O fatorial de " + numero2 + " é: " + fatorial);
                int resultadovetor = 0;
                int somatotal = 0;
                int vetor[] = {2,3,5,6,8,9,12,14,21,25};
    for ( int i = 0; i < vetor.length; i++){
                resultadovetor += vetor[i];
                 somatotal = vetor[i];
        
        System.out.println("Soma total do vetor: " + somatotal + " = " + resultadovetor );
       
    }
        System.out.println("Números ímpares de 1 a 100:");

    for (int i = 1; i <= 100; i++) {
        if (i % 2 != 0) {
        System.out.println(i);
        }
    }

            double valorinicial=0;
            double juros=0;
            int tempo=0;
            String capitalizacao;
            String iniciar;

do {
    System.out.println("Deseja gerar um calculo? (sim/nao)");

            iniciar=scanner.next(); System.out.println("Digite o valor inicial");
            valorinicial=scanner.nextDouble();

    System.out.println("Digite a taxa de juros anual");
            juros=scanner.nextDouble();

    System.out.println("Digite o tempo");
            tempo=scanner.nextInt();
    System.out.println("Deseja capitalização simples ou composta(s/c)");
            capitalizacao=scanner.next();
            double calculoMontanteSimples= valorinicial*( 1+ 1/100*tempo);
            double montanteComposta = valorinicial* Math.pow((1 + juros/ 100), tempo);
if (capitalizacao.equalsIgnoreCase("s")) {
    System.out.println("Seu montante foi: " + calculoMontanteSimples);
} else if (capitalizacao.equalsIgnoreCase("c")) {
    System.out.println("Seu montante foi: " + montanteComposta);
}

else if (iniciar.equalsIgnoreCase("nao")) {
    System.out.println("Programa encerrado.");
break;
}
}while (iniciar.equalsIgnoreCase("sim"));


        

    }

}
