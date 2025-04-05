
package algoritmos;

/**
 *
 * @author Jesús Pedro Lares Valencia - 00000233383
 */
public class Pruebas {

    public static void main(String[] args) {
        
        int[] a = {3, 4, 1, 2};
        Ordenamientos o = new Ordenamientos(a);
        
        System.out.println("Algoritmo Bubblesort");
        o.mostrar();
        o.bubbleSort();
        o.mostrar();
        
        System.out.printf("\nAlgoritmo Insertion Sort\n");
        int[] b = {3, 4, 1, 2};
        o.setArreglo(b);
        o.mostrar();
        o.insertionSort();
        o.mostrar();
        
        System.out.printf("\nAlgoritmo Insertion Sort\n");
        int[] c = {3, 4, 1, 2};
        o.setArreglo(c);
        o.mostrar();
        o.selectionSort();
        o.mostrar();
    }
}
