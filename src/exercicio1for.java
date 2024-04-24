public class exercicio1for {
    public static void main(String[] args) {
     /*
      1. Utilizando (While), construir um programa que apresente a soma dos cem
     * primeiros números naturais (1 + 2 + 3 +...+ 98 + 99 + 100).
     * 
     */
        int soma = 0;
        
        for (int contador = 0; contador <=100; contador++) {
            soma = soma + contador;
            System.out.println(soma);
            
        }

    }
}
