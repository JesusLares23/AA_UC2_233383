    
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
    
    public void insertionSort() {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    public void mostrar() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    } 
}
