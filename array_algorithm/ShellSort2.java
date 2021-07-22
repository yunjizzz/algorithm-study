package array_algorithm;

/**
 * 셸정렬 개선버전
 * h 값이 서로 배수가 되지 않도록 해서 효율적인 정렬이 될 수 있다.
 */
public class ShellSort2 {


    public static void main(String[] args) {
        int[] result = insertionSort(new int[]{123,48,987,654,4,3241,4,15,2,0});

        for(int i : result){
            System.out.print(i +",");
        }
    }

    public static int[] insertionSort(int[] a) {
        int length = a.length;
        int k;
        for (k = 1; k < length/9; k = k*3 +1);

        for(; k > 0; k/=3) {
            for (int i = k; i < length; i++) {
                int j;
                int tmp = a[i];
                for (j = i - k; j >= 0 && a[j] > tmp; j -= k) {
                    a[j + k] = a[j];
                }
                a[j + k] = tmp;
            }
        }
        return a;
    }
}

