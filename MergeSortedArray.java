import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
         * 1 : Es la matriz de origen desde la que se copiarán los elementos.
         * 2: Es el índice inicial de la matriz de origen del que comienza la copiar
         * (0-índice basado en (0)).
         * 3: Es el array de destino donde se copiarán los elementos.
         * 4: Es el índice de partida de la matriz de destino donde se copiarán los
         * elementos (0-índice basado en (0)).
         * 5: Es el número de elementos que necesitan ser copiados desde la matriz de
         * origen hasta la matriz de destino.
         */

        System.arraycopy(nums2, 0, nums1, m, n);

        // Selection Sort (Ordenación de selección)
        for (int i = 0; i < nums1.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[j] < nums1[index]) {
                    index = j;
                }
            }
            int order = nums1[index];
            nums1[index] = nums1[i];
            nums1[i] = order;
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0 && j < n) {
                nums1[i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 10, 0, 0, 0 };
        int[] array2 = { 2, 5, 6 };
        int m = 4;
        int n = 3;
        // merge(array1, m, array2, n);

        merge2(array1, m, array2, n);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
