public class espoliosemonstros
    import java.util.Scanner;
    public static void main (String[]args) {
    Scanner resposta = new Scanner(System.in); 
    Integer pontosatributos = 20;
    Integer atributojogador = Integer.parseInt(resposta.nextLine());
    Integer força = 0;
    Integer destreza = 0;
    Integer constituição = 0;
    Integer sabedoria = 0;
    Integer intelecto = 0;
    Integer carisma = 0;
    //Ficha do Jogador
    System.out.println("Qual o nome do seu personagem?");
    String nomedopersonagem = resposta.nextLine();
    
    System.out.println("Agora, vamos definir os atributos do seu personagem!");
    System.out.println("Você tem um total de 20 pontos para distribuir entre 6 atributos, tendo um valor máximo inicial de 5 para cada atributo!");
    System.out.println("Deseja continuar? [S] Sim [N] Não");
    String confirmacao = resposta.nextLine();
    if (confirmacao.equals("S"))
     System.out.println("Qual o valor do atributo de força pro seu personagem? 1-5");
    força = Integer.parseInt(resposta.nextLine());
    pontosatributos = pontosatributos-força;
    System.out.print("Pontos de atributos restantes: " + pontosatributos);
    System.out.println("Qual o valor do atributo de destreza pro seu personagem? 1-5");
    
    
    
    
    resposta.close();
     }
 
