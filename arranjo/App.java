public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         Arranjo vetor = new Arranjo<>(10);

         vetor.Imprime();

         vetor.EscreveUltimo(8);

         vetor.Imprime();

         vetor.EscrevePrimeiro(2);

         vetor.Imprime();

         vetor.EscrevePosicao(7, 6);

         vetor.Imprime();

         vetor.RemoveUltimo();

         vetor.Imprime();

         vetor.RemovePrimeiro();

         vetor.Imprime();

    }
}
