import java.util.Iterator;
public class Estoque {

    public static Integer contarComputadoresAtivosLoja(Loja loja) {
        int quantidade = 0;
        for (Computador computador : loja) {
            if ( computador.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalComputadoresLoja(Loja loja) {
        int quantidade = 0;
        for (Iterator a = loja.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
