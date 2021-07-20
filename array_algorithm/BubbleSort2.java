package array_algorithm;

/**
 * 개선된 버전의 버블 정렬
 */
public class BubbleSort2 {

    public static void main(String[] args) {

        int[] result = bubbleSort(new int[]{22,5,11,22,120,78,69});
        for(int a : result ){
            System.out.println(a);
        }
    }

    private static int[] bubbleSort(int[] ints) {
        int k = 0;
        int count = ints.length-1;
        while(k < count){
            int last = count;
            for(int j = count; j > k; j--){
                if(ints[j-1] > ints[j]){
                    swap(ints,j-1,j);
                    last = j;
                }
            }
            k = last;
        }
        return ints;
    }
    static void swap(int a[], int i, int j ){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
