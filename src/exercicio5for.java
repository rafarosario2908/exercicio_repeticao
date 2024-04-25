public class exercicio5for {
    public static void main(String[] args) {
         /*
          * 5. Escrever um programa que apresente os valores da sequência numérica de
          * Fibonacci até o décimo quinto termo.
          * A sequência de Fibonacci é formada pelos valores numéricos 0, 1, 1, 2, 3, 5,
          * 8, 13, 21, 34, 55, 89, 144, 233, 377, ... etc.,
          * obtendo-se o próximo termo a partir da soma do termo atual com o anterior
          * sucessivamente até o infinito se a sequência não for interrompida,
          * sendo determinada a partir da fórmula fórmula Fn = Fn-1 + Fn-2. Utilize para
          * este exercício as variáveis ATUAL, ANTERIOR e PRÓXIMO.
          */
         int atual = 0;
         int anterior = 0;
         //int proximo;

         for (int i = 0; i <= 15; i++) {
             if (i == 1) {
                 atual = 1;
                 anterior = 0;
             } else {
                 atual = atual + anterior;
                 anterior = atual - anterior;
             }
             System.out.println(atual);

         }

     }
 }
