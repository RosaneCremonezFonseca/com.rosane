// 1- Pacote
package treinamento;
// 2- referência as bibliotecas

// 3 - classe é o nome de alguma Coisa, objeto - sempre substantivo

public class Medidas {
    //3.1 - atributos - caracteristicas (adjetivo)

    //3.2 - Metódos(faz e fica quietinho) e Funções(faz e mostra) eles são(verbos, são as coisas que a Coisa sabe fazer)

    //Primeira função tem nome pré determinado, carrega logo que se der uma ordem (static), e dizer o que ela é (metodo ou função)
    //é assim que termina que é uma método (void)ele faz e pronto, e temos que dar um nome para esse metodo(main)ele é o gatilho
    // main()- pra chamar as demais estruturas
    // {} não delimitadores, quer dizer que tudo que está dentro é da classe Medidas
    // () serve para RECEBER no caso do METODO... e ENVIAR informação, valores, que mais tarde vamos ver SOBRE ENVIAR
    // STRING é texto
    // [] vai receber uma lista de texto
    // args é o nome da lista de texto - LETRAS, NUMEROS CARACTERS
    //System - chama o JDK isso é comando do java
    //out - escreve, printStream - gera uma expressão
    // println escreve e pula de linha
    // comando para salvar CRTL + S
    // para gerar o código System.out.printlm no Intellij IDEA, basta digitar sout e tecla TAB ou ENTER
    //  = recebe  não é igual!!  igual seria ==
    // ; é pra saber que terminou a ordem
    // + concatenador, exibe
    public static void main(String[] args){
       //System.out.println("Meu primeiro codigo em java!!!");
      // System.out.println("Preciso tomar café!!");
       // System.out.println("VOLTAREMOS AS 12:34!!");

        //Calculo de area - exemplo: o tamanho do tapete ou do piso
        //criar uma variavel

        //int largura;
        //int comprimento;
        //int resultado;
        //largura = 4;
       // comprimento = 3;
       // resultado = largura * comprimento;
       // System.out.println("A aréa é de " + resultado);
        System.out.println("Calculo de Areas");



    }
    public void calcularModoExtenso(){

        int largura = 5;
        int comprimento = 6;
        int resultado;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a area é de " + resultado + "m2");

    }


    public void calcularAreaReduzida(){
        // metodo reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a area é de " + largura * comprimento + "m2");

    }
}
