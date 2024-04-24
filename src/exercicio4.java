public class exercicio4 {
    public static void main(String[] args) {
        /*
         * 4. Elaborar um programa que apresente os resultados das potências do valor de
         * base 3,
         * elevado a um expoente que varia do valor 0 até o valor 15.
         * O programa deve apresentar os valores 1, 3, 9. 27, ..., 14.348.907.Sugestão:
         * leve em consideração as definições
         * matemáticas do cálculo de potência, em que qualquer valor numérico diferente
         * de zero elevado a zero é 1, e todo
         * valor numérico elevado a 1 é ele próprio.
         * Não use o operador aritmético de exponenciação “Math.pow” e resolva o
         * problema com a técnica de laço a sua escolha.
         */

        int base = 3;
        int expoente = 0;

        while (expoente <= 15) {
            int expAtual = 0;
            int resultado = 0;
            while (expAtual <= expoente) {
                if (expAtual == 1) {
                    resultado = base;
                } else {
                    resultado = resultado * base;
                }
                expAtual++;
            }
            System.out.println(base + " elevado a " + expoente + " = " + resultado);
            expoente++;
        }

    }
}
