public class exercicio4for {
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
        int resultado = 1;

        for (int expoente = 0; expoente <= 15; expoente++) {
            System.out.println("3*" + expoente + " = " + resultado);
            resultado = resultado * base;

        }

    }

}
    

