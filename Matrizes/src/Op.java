import java.util.*;

public class Op {
    List<Integer> lista = new ArrayList(); // estou criando uma lista do tipo inteiro
    public void addLista( int number) {
            lista.add(number);// para add numeros a lista
	}
    public double mediaA (double qtd)// metodo publico do tipo doble  
    {
            int aux;// variavel pauxiliar
            double soma = 0;
            double resultado;
            for(int cont = 0; cont < qtd; cont++) {
		aux = lista.get(cont);// aux vale o primeiro valor, pega o valor da posiçaõ 1
		soma = soma + aux;
            }
            resultado = soma / qtd;
            return resultado;
	}
    public void parImpar(int qtd){
            for(int cont = 0; cont < qtd; cont++){
            if(lista.get(cont) % 2 == 0){// estou vendo se o numero é par (% significa o resto da divisão)
            System.out.println("Par: " + lista.get(cont));
            } else {
            System.out.println("Impar: " + lista.get(cont));// verificando se é impar
                }
            }
        }
    public double mediaGeo(int qtd){
            int soma = 1;
            int aux;
            double resultado = 0;
            for(int cont = 0; cont < qtd; cont++){
             aux = lista.get(cont);
             soma = soma * aux; // multiplicando os termos
            }
            double exponente = 1.0 / qtd;// estou invertendo a raiz e divedindo pela quantidade enésima
            resultado = Math.pow(soma, exponente);// math é uma classe e pow é potencia
            return resultado;// retornando o resultado
        }
}
