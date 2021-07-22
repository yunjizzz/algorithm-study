package array_algorithm;

/**
 * 단순 선택 정렬
 *
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] result = selectionSort(new int[]{123,48,987,654,4,3241,4,15,2,0});

        for(int i : result){
            System.out.print(i +",");
        }
    }

    static int[] selectionSort(int[] a){
        int length = a.length;
        for(int i =0; i < length-1; i++){
            int min = i;
            for(int j= i+1; j < length; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            swap(a,i,min);
        }
        return a;
    }
    static void swap(int a[], int i, int j ){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
