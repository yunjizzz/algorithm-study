package array_algorithm;

/**
 * 단순 삽입 정렬
 *
 */
public class InsertionSort {


    public static void main(String[] args) {
        int[] result = insertionSort(new int[]{123,48,987,654,4,3241,4,15,2,0});

        for(int i : result){
            System.out.print(i +",");
        }
    }

    public static int[] insertionSort(int[] a){
        int length = a.length;
        for(int i= 1; i <length; i ++ ){
            int j;
            int tmp = a[i];
            for(j=i; j > 0 && a[j-1]> tmp; j--){
                a[j] = a[j-1];
            }
            a[j] = tmp;
        }
        return a;
    }
}

