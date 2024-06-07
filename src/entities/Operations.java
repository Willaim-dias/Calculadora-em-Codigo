package entities;

public class Operations {

    // Cria um construtor sem argumentos para a classe.
    public Operations() {
        // Construtor padrão sem ações específicas
    }
    
    // A função calculationOptions recebe como argumento três valores.
    // 'option' é a operação desejada, 'value1' e 'value2' são os valores a serem operados.
    public double calculationOptions(int option, double value1, double value2) {
        // Inicia a variável result
        double result = 0.0;
        
        // A estrutura switch verifica qual valor é igual ao valor de 'option'
        switch (option) {
            case 1:
                // Se 'option' for 1, realiza a soma de value1 e value2
                result = value1 + value2;
                break;
            case 2:
                // Se 'option' for 2, realiza a subtração de value1 e value2
                result = value1 - value2;
                break;
            case 3:
                // Se 'option' for 3, realiza a multiplicação de value1 e value2
                result = value1 * value2;
                break;
            case 4:
                // Se 'option' for 4, realiza a divisão de value1 e value2
                result = value1 / value2;
                break;
        }
        // Retorna o resultado da operação
        return result;
    }
}
