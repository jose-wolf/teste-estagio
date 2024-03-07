package exercicio4;


public class Teste4 {

    public static void main(String[] args) {


        boolean interruptorA = true;
        boolean interruptorB = true;
        boolean interruptorC = false;


        verificarLampada(interruptorA, "A");
        verificarLampada(interruptorB, "B");
        verificarLampada(interruptorC, "C");
    }
    private static void verificarLampada(boolean estadoInterruptor, String idLampada) {
        if (estadoInterruptor) {
            System.out.println("Interruptor " + idLampada + " acionado, lâmpada " + idLampada + " ligada");
        } else {
            System.out.println("Interruptor " + idLampada + " não acionado, lâmpada " + idLampada + " desligada");
        }
    }
}
