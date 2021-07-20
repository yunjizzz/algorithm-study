package array_algorithm;


/**
 * 홀수 번째의 패스는 가장 작은 요소를 맨 앞으로 옮기고
 * 짝수 번째의 패스는 가장 큰 요소를 맨 뒤로 옮기는 방식을 사용.
 *  최선 O(n) 최악 O(N^2)
 */
public class CocktailSort {

    public static void main(String[] args) {

        int[] result = cocktailSort(new int[]{22,5,11,22,120,78,69});
        for(int a : result ){
            System.out.println(a);
        }
    }

    private static int[] cocktailSort(int[] ints) {
        int left = 0;
        int right = ints.length-1;
        int flag = 0;
        int last = 0;
        int count = 0;
        while(left != right){
            if(flag == 0){
                for(int i= left; i < right; i++){
                    if(ints[i] > ints[i+1]){
                        swap(ints,i+1, i);
                        last = i;
                    }
                }
                left = last;
                flag = 1;
            }else{
                for(int i = right; i > left; i--){
                    if(ints[i] < ints[i-1]){
                        swap(ints,i-1, i);
                        last = i;
                    }
                }
                right = last;
                flag = 0;
            }
            System.out.println("실행횟수는??" + count++);
        }
        return ints;
    }
    static void swap(int a[], int i, int j ){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
