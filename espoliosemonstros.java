import java.util.Scanner;

public class espoliosemonstros{
    public static void main (String[]args){
    Scanner resposta = new Scanner(System.in); 
    atributos atributos = new atributos();
    atributos.carisma = 0;
    atributos.sabedoria = 0;
    atributos.intelecto = 0;
    atributos.constituição = 0;
    atributos.força = 0;
    atributos.destreza = 0;

    

        //Ficha do Jogador
    System.out.println("Qual o nome do seu personagem?");
    String nomedopersonagem = resposta.nextLine();
    
    System.out.println("Agora, vamos definir os atributos do seu personagem!");
    System.out.println("Você tem um total de 20 pontos para distribuir entre 6 atributos, tendo um valor máximo inicial de 5!");
    System.out.println("Deseja continuar? [S] Sim [N] Não");
    String confirmacao = resposta.nextLine();
    if (confirmacao.equals("S"))
    System.out.println("O Usuário confirmou a alocação");
    else 
    System.out.println(":(");
    
    resposta.close();
     }
}
