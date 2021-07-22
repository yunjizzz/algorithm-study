package array_algorithm;

/**
 * 셸정렬
 * 단순 삽입 정렬의 장점은 살리고 단점은 보완한 정렬 알고리즘이다.
 * 정렬할 요소를 그룹으로 나눠 각 그룹별로 단순 삽입정렬을 수행한 후
 * 그 그룹을 합치면서 정렬를 반복하여 이동횟수를 줄인다.
 *
 */
public class ShellSort {


    public static void main(String[] args) {
        int[] result = insertionSort(new int[]{123,48,987,654,4,3241,4,15,2,0});

        for(int i : result){
            System.out.print(i +",");
        }
    }

    public static int[] insertionSort(int[] a) {
        int length = a.length;
        for (int k = length / 2; k > 0; k /= 2) {
            for (int i = k; i < length; i++) {
                int j;
                int tmp = a[i];
                for (j = i-k; j >= 0 && a[j] > tmp; j -= k) {
                    a[j + k] = a[j];
                }
                a[j + k] = tmp;
            }
        }
        return a;
    }
}

