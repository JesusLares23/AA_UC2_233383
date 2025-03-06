
package algoritmos;

/**
 *
 * @author Jesús Pedro Lares Valencia - 00000233383
 */
public class Pruebas {

    public static void main(String[] args) {
        
        int[] a = {5, 1, 3, 10, 6};
        Ordenamientos o = new Ordenamientos(a);
        
        o.bubbleSort();
        o.mostrar();
    }
}
