    
package algoritmos;

/**
 *
 * @author Jesús Pedro Lares Valencia - 00000233383
 */
public class Ordenamientos {
    
    private int[] arr;
    
    public Ordenamientos(int[] arr) {
        this.arr = arr;
    }
    
    public void setArreglo(int[] arr) {
        this.arr = arr;
    }
    
    /**
     * Algoritmo de ordenamiento de burbuja.
     * 
     * Entrada y precondición: un arreglo con elementos desordenados.
     * Salida y postcondicion: el mismo arreglo con sus elementos ordenados de 
     * menor a mayor.
     */
    public void bubbleSort() {
        for (int i = 1; i < arr.length - 1; i++) { // asig: 1, comp: n - 1, incr: n - 2 = 2n - 2
            for (int j = 0; j < arr.length - i; j++) { // asig: 1, comp: n - 1, incr: n - 2 = (2n - 2) * 2n - 2 = 4n^2 - 4n + 4
                if (arr[j] > arr[j+1]) { // (2) 4n^2 - 4n + 4 = 8n^2 - 8n + 8
                    int aux = arr[j]; // (1) 4n^2 - 4n + 4 = 4n^2 - 4n + 4
                    arr[j] = arr[j + 1]; // (1) 4n^2 - 4n + 4 = 4n^2 - 4n + 4
                    arr[j + 1] = aux; // (1) 4n^2 - 4n + 4 = 4n^2 - 4n + 4
                }
            }
        }
        // 2n - 2 + 16n^2 - 16n + 16 + 8n^2 - 8n + 8 = 24n^2 - 22n + 22
    } // O(n^2)
    
    /**
     * Algoritmo de ordenamiento por inserción.
     * 
     * Entrada y precondición: un arreglo con elementos desordenados.
     * Salida y postcondición: el mismo arreglo con sus elementos ordenados de 
     * menor a mayor.
     */
    public void insertionSort() {
        for (int i = 1; i < arr.length; i++) { // asig: 1, comp = n, incr: n - 1 = 2n
            int key = arr[i]; // n(sig: 1) = n
            int j = i - 1; // n(rest: 2, asig; 1) = n(2 + 1) = 3n
            while(j >= 0 && arr[j] > key) { // n(2n) = 2n^2
                arr[j + 1] = arr[j]; // n^2(suma: 1, asig: 1) = 2n^2
                j--; // n^2(decr: 1) = n^2
            }
            arr[j + 1] = key; // n(suma: 1, asig: 1) = 2n
        }
        // 2n + n + 3n + 2n^2 + 2n^2 + n^2 + 2n = 5n^2 + 8n
    } // O(n^2)
    
    /**
     * Algoritmo de ordenamiento por selección.
     * 
     * Entrada y precondición: un arreglo de elemenentos de un mismo tipo de
     * dato, comparables y desordenados.
     * Salida y postcondición: Arreglo con los mismos elementos de la entrada,
     * pero ordenados de menor a mayor.
     */
    public void selectionSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int aux = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = aux;
        }
    }
    
    public void mostrar() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    } 
}
