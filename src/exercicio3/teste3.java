package exercicio3;


public class teste3 {
    public static void main(String[] args) {
        /*
        3) Descubra a lógica e complete o próximo elemento:

        a) 1, 3, 5, 7, ___
        b) 2, 4, 8, 16, 32, 64, ____
        c) 0, 1, 4, 9, 16, 25, 36, ____
        d) 4, 16, 36, 64, ____
        e) 1, 1, 2, 3, 5, 8, ____
        f) 2,10, 12, 16, 17, 18, 19, ____
        */


        System.out.println("a) Próximo número: " + somarProximo(7));
        System.out.println("b) Próximo dobro: " + valorDobrado(64));
        System.out.println("c) Próximo número do quadrado perfeito: " + quadradoPerfeito(6));
        System.out.println("d) Próximo número do quadrado perfeito em pares: " + quadradoPerfeitoPares(4));
        System.out.println("e) Próximo número do cálculo fibonacci: " + fibonacci(5,8));
        System.out.println("e) Próximo número lógico que começa com letra \"D\": " + logico(200));


    }

    public static int somarProximo(int proximoNumero){
        return proximoNumero + 2;
    }

    public static int valorDobrado(int proximoNumero){
        return proximoNumero * 2;
    }

    public static int quadradoPerfeito(int numeroAnterior){
        int soma = (numeroAnterior + 1) * (numeroAnterior + 1);
        return soma;
    }

    public static int quadradoPerfeitoPares(int numeroAtual){
        int soma = (numeroAtual + 1) * 2;
        return soma * soma;
    }

    public static int fibonacci(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static int logico(int numero){
        return numero;
    }

}
