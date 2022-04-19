import java.util.*;

public class Main
        
{
    public static void main(String[] args){
        Op operation = new Op(); // instanciando a classe = criando uma classe
        
        Scanner enter = new Scanner(System.in); // para receber dados do usuário
        
        System.out.print("Quantos numeros você irá adicionar na lista?: "); // para perguntar ao usuario quantos numeros adicionar
        int qtd = enter.nextInt(); // variavel para guardar a quantidade de numeros que vou adicionar a lista (enter.nextInt()= seria igual ao sacanf em C)
        
        for(int cont = 0; cont < qtd; cont++) {
            System.out.print("Digite o numero: "); // digita o numero
            int number = enter.nextInt();// recebe o numero que foi digitado
            operation.addLista( number);// chama a função
        }
        System.out.println("A media aritimetica é: " + operation.mediaA(qtd) + "\n"); //chama o metodo dentro do system
        operation.parImpar(qtd);// chamando o metodo
         System.out.println("A media geométrica é: " + operation.mediaGeo(qtd) + "\n");
    
}
}
