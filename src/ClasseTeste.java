import br.com.guilhermeoli.Interfaces.CanetaEsferografica;
import br.com.guilhermeoli.Interfaces.Giz;
import br.com.guilhermeoli.Interfaces.ICaneta;
import br.com.guilhermeoli.Interfaces.Lapis;

/**
 * @author guiol
 */
public class ClasseTeste {

    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá");
        caneta.escreverComumATodas();
        System.out.println(caneta.getColor());

        ICaneta giz = new Giz();
        giz.escrever("Olá");
        giz.escreverComumATodas();
        System.out.println(giz.getColor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá");
        lapis.escreverComumATodas();
        System.out.println(lapis.getColor());
    }
}
