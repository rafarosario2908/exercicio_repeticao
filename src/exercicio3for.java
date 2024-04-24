public class exercicio3for {
    public static void main(String[] args) {
         //3. Utilizando (While), construir um programa que apresente 
        //todos os valores numéricos divisíveis por 4 e menores que
        //200.Sugestão: a variável que controla o contador do 
        //laço deve ser iniciada com valor 1.

        for (int contador = 1; contador <= 200; contador++) {
            if (contador%4==0) {
                System.out.println(contador);
                
            }
            
        }
        
    }
}
