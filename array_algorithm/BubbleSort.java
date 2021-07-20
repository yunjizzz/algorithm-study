package array_algorithm;

/**
 * 개선하기 전 버전의 버블 정렬
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] result = bubbleSort(new int[]{22,5,11,22,120,78,69});
        for(int a : result ){
            System.out.println(a);
        }
    }

    //버블정렬의 경우 배열 길이의 -1 만큼 반복하게 된다.
    static int[] bubbleSort(int[] a){
        for(int i=0; i < a.length - 1; i++){
            for(int j = a.length -1; j > i; j--){
                if( a[j-1] > a[j] ){
                    swap(a,j-1,j);
                }
            }
        }
        return a;
    }

    static void swap(int a[], int i, int j ){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
