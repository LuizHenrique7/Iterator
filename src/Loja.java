import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Loja implements Iterable<Computador> {

    private List<Computador> computadores = new ArrayList<Computador>();

    public Loja(Computador... computadores) { this.computadores = Arrays.asList(computadores);}

    @Override
    public Iterator<Computador> iterator(){ return computadores.iterator(); }
}
