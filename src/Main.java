//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ex1
        double nota1 = 7.6;
        double nota2 = 9.6;
        double media = (nota1 + nota2) / 2;
        System.out.println(media);

        //ex 2
        double numeroDouble = 9.7;
        int numeroInt = (int) numeroDouble;
        System.out.println("Número double: " + numeroDouble);
        System.out.println("Número convertido para int: " + numeroInt);

        //ex 3
        char letra = 'A';
        String palavra = "luno";

        System.out.println("Concatenação: " + letra + palavra);

        //ex 4
        double precoProduto = 29.90;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;

        System.out.println("O valor total da compra é: R$ " + valorTotal);

        //ex 5
        double quantidadeDolar = 50;
        double precoDolarEmReais = 4.94;
        double valorTotalReais = (int) (quantidadeDolar * precoDolarEmReais);

        System.out.println("A conversão de " + quantidadeDolar + "dolares é: R$ " + valorTotalReais);

        //ex 6
        double precoOriginal = 4999.90;
        double valorDesconto = 10;
        double valorDoDesconto = precoOriginal * (valorDesconto / 100);
        double valorTotalDesconto = precoOriginal - valorDoDesconto;

        System.out.println(valorTotalDesconto);


    }
}

