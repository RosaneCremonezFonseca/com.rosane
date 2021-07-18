package aprendizado;

public class Tapete {

    public static void main(String[] args){
        //chamar os metados abaixo
        calcularAreaModoCurto();
        calcularAreaModoExtenso();
    }

    //para  metodo principal chamar os outros metodos, tem que ter static nele
    public static void calcularAreaModoCurto(){
        System.out.println(" Cálculo de área Modo Curto ");

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a area é de " + largura * comprimento + "m2");

    }


    public static void calcularAreaModoExtenso(){
        System.out.println(" Cálculo de área Modo Extenso ");
        int largura = 5;
        int comprimento = 6;
        int resultado;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a area é de " + resultado + "m2");


    }
}
