package aprendizado;

public class Tapete {

    public static void main(String[] args){
        // EXTRUTURA switch
        //variavel
        String opcao = "ifSimples";

        switch (opcao){
             // seletor
            case "melancia":
                // escrever
                System.out.println("Você escolheu o metódo ifSimples");
                // chamar
                ifSimples();
                // para parar
                break;
            case "curto":
                System.out.println("Voce escolheu o metódo calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "extenso":
                System.out.println("Você escolheu o método calcularAreaModoExtenso ");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolheu outro valor, sem ação associada");
                break;
        }


        //chamar os metados abaixo
        //calcularAreaModoCurto();
        //calcularAreaModoExtenso();
    }

    public static void ifSimples(){
        //variavel
        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else {
            calcularAreaModoExtenso();
        }
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
