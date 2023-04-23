import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        sc.close();

        if(isFibonacci(num)) { //chama a função isFibonacci passando o número digitado como argumento
            System.out.println(num + " é um número de Fibonacci!");
        } else {
            System.out.println(num + " não é um número de Fibonacci!");
        }
    }

    //função que verifica se um número é um número de Fibonacci
    public static boolean isFibonacci(int num) {
        if(num == 0 || num == 1) { //se o número for 0 ou 1, retorna verdadeiro
            return true;
        }

        int fibo1 = 0; //inicializa as duas variáveis que irão guardar os valores da sequência de Fibonacci
        int fibo2 = 1;

        while(fibo2 < num) { //enquanto o segundo número da sequência de Fibonacci for menor que o número digitado
            int temp = fibo2; //armazena o valor de fibo2 em uma variável temporária
            fibo2 += fibo1; //soma os dois números da sequência para obter o próximo número
            fibo1 = temp; //atualiza o valor de fibo1 com o valor anterior de fibo2
        }

        if(fibo2 == num) { //se o número digitado for igual ao segundo número da sequência de Fibonacci, retorna verdadeiro
            return true;
        } else { //caso contrário, retorna falso
            return false;
        }
    }
}
