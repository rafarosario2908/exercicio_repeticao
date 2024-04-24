public class exercicio2for {
    public static void main(String[] args) {
        // 2. Utilizando (DoWhile), elaborar um programa que apresente
        // o somatório dos valores pares existentes na faixa de 1 até 500.

        int soma = 0;

        for (int contador = 1; contador <= 500; contador++) {
            if (contador % 2 == 0) {

                soma = soma + contador;
                System.out.println(soma);

            }

        }
    }
}
