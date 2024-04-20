public class exercicio2 {

    // 2. Utilizando (DoWhile), elaborar um programa que apresente
    // o somatório dos valores pares existentes na faixa de 1 até 500.
    public static void main(String[] args) {

        int contador = 1;
        int soma = 0;

        do {
            if (contador % 2 == 0) {

                System.out.println(soma);
                soma = soma + contador;

            }

            contador = contador +1;

        } while (contador <= 500);
        System.out.println(soma);

    }

}
