import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int[] tabela = {1,2,3,4,5,6,7,8,9,10};
        for(int i =0; i<tabela.length; i++){
            int multiplica = numero * tabela[i];
            String resposta = numero + " x " + tabela[i] + " = " + multiplica;
            System.out.println(resposta);
        }
    }
}
