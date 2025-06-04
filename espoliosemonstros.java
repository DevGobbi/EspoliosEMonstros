import java.util.Scanner;
public class espoliosemonstros {
    public static void main (String[]args){
    Scanner resposta = new Scanner(System.in); 
    Integer pontosatributos = 20;
    Integer atributojogador = Integer.parseInt(resposta.nextLine());
    Integer força = 0;
    Integer destreza = 0;
    Integer constituição = 0;
    Integer sabedoria = 0;
    Integer intelecto = 1;
    Integer carisma = 1;

    System.out.println("Qual o nome do seu personagem?");
    String nomedopersonagem = resposta.nextLine();
    
    System.out.println("Agora, vamos definir os atributos do seu personagem!");
    System.out.println("Você tem um total de 20 pontos para distribuir entre 6 atributos, tendo um valor máximo inicial de 5 para cada atributo!");
    System.out.println("Deseja continuar? [S] Sim [N] Não");
    String confirmacao = resposta.nextLine();
    if (confirmacao.equals("S"))
     System.out.println("Qual o valor do atributo de força pro seu personagem? 1-5");
    força = atributojogador;
    pontosatributos = pontosatributos-força;
    System.out.print("Pontos de atributos restantes: " + pontosatributos);
    System.out.println("Qual o valor do atributo de destreza pro seu personagem? 1-5");
    destreza = atributojogador;
    pontosatributos = pontosatributos-destreza;
    System.out.println("Qual o valor do atributo de constituição pro seu personagem?");
    constituição = atributojogador;
    pontosatributos = pontosatributos-constituição;
    System.out.println("Qual o valor do atributo de sabedoria pro seu personagem?");
    sabedoria = atributojogador;
    pontosatributos = pontosatributos-sabedoria;
    System.out.println("Qual o valor do atributo do intelecto do seu personagem?");
    intelecto = atributojogador;
    pontosatributos = pontosatributos-intelecto;
    System.out.println("Qual o valor do atributo de carisma pro seu personagem?");
    carisma = atributojogador;
    pontosatributos = pontosatributos-carisma;
    System.out.println("Vamos recapitular, atualmente a sua ficha está assim!");
    System.out.println("Nome do personagem: " + nomedopersonagem);
    System.out.println("Força:" + força);
    System.out.println("Destreza: " + destreza);
    System.out.println("Constituição:" + constituição);
    System.out.println("Sabedoria: " + sabedoria);
    System.out.println("Intelecto" + intelecto);
    System.out.println("Carisma" + carisma);
    resposta.close();
     }
 }

 // NÃO TÁ FUNCIONANDO :(