

class Programmers_77884{
    public static void main(String[] args) {
        solution(13,17 );
    }

    public static void solution(int left, int right){
        int result = 0;

        for(int i =left; i <=right; i++){
            if(devideValue(i)){
                result += i;
            }else{
                result -= i;
            }
        }

        System.out.println(result);
    }

    public static boolean devideValue(int value){

    int count = 0;
    for (int i = 1; i * i <= value; i++) {
        if (i * i == value){
            count++;
        }else if (value % i == 0){
            count+=2;
        } 
    }

        if(count%2 == 0){
            return true;
        }else{
            return false;
        }
    }


}
