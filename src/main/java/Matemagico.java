public class Matemagico {
    public static void main(String[] args) {
        //Sempre dará o mesmo número independente de qual escolha.
        int meuNumero = 20;
        int numeroMagico = meuNumero * meuNumero;
        numeroMagico = numeroMagico + meuNumero;
        numeroMagico = numeroMagico / meuNumero;
        numeroMagico = numeroMagico + 17;
        numeroMagico = numeroMagico - meuNumero;
        numeroMagico = numeroMagico / 6;
        System.out.println(numeroMagico);
    }
}