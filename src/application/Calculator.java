package application;

// Importa a classe Scanner para leitura de entrada do usuário
import java.util.Scanner;

// Importa a classe Operations que contém métodos para operações matemáticas
import entities.Operations;

public class Calculator {

    public static void main(String[] args) {
        // Instanciando as classes.
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para leitura de entrada do usuário
        Operations cal = new Operations();   // Cria um objeto Operations para realizar operações matemáticas
        
        // Variável resp inicia o loop.
        char resp = 's'; // Inicializa a variável 'resp' com 's' para controlar o loop do programa
    
        // Inicia um loop que continua até que 'resp' seja igual a 'n'
        while (resp != 'n') {
            // O comando System.out.println mostra uma mensagem no console, o println faz uma quebra de linha no final.
            System.out.println("----------Calculadora----------");
            System.out.println("Soma-1");
            System.out.println("Subtração-2");
            System.out.println("Multiplicação-3");
            System.out.println("Divisão-4");
            System.out.println();
            
            // O comando print sem o "ln" mostra a mensagem sem a quebra de linha no final.
            System.out.print("Escolha uma opção: ");
            
            // Aqui a variável option recebe o valor digitado pelo usuário
            int option = sc.nextInt(); // Lê a opção escolhida pelo usuário e armazena na variável 'option'
            
            System.out.println();
            
            // Aqui as variáveis recebem os valores digitados pelo usuário.
            System.out.print("Valor1: ");
            double value1 = sc.nextDouble(); // Lê o primeiro valor digitado pelo usuário e armazena em 'value1'
            System.out.print("Valor2: ");
            double value2 = sc.nextDouble(); // Lê o segundo valor digitado pelo usuário e armazena em 'value2'
            
            System.out.println();
            
            // Calcula o resultado com base na opção escolhida e nos valores fornecidos, e imprime o resultado formatado com duas casas decimais
            System.out.printf("Resultado = %.2f%n", cal.calculationOptions(option, value1, value2));
            System.out.println();
            
            // Pergunta ao usuário se deseja realizar outro cálculo
            System.out.print("Deseja Fazer outro calculo? (s/n): ");
            resp = sc.next().charAt(0); // Lê a resposta do usuário (s/n) para continuar ou parar o loop
        }
        
        // Fecha o objeto Scanner para liberar recursos
        sc.close();
    }

}
