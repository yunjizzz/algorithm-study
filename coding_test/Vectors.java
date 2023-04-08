package coding_test;

public class Vectors {
    public static int[] findShortest(int[][] vectors) {


        int[] shortest = vectors[0]; // 첫번째 vector를 기준으로
        double shortestValue = Math.sqrt((shortest[0]*shortest[0]) + (shortest[1]*shortest[1]) + (shortest[2]*shortest[2]));


        for (int[] vector : vectors) { // 각 벡터 조회해서 값 비교
            double vectorValue = Math.sqrt((vector[0]*vector[0]) + (vector[1]*vector[1]) + (vector[2]*vector[2]));
            if (vectorValue < shortestValue) { //기준 값 보다 더 작으면 가장 작은 값으로.
                shortest = vector;
                shortestValue = vectorValue;
            }
        }

        return shortest;
    }

    public static void main(String[] args) {
        int[][] vectors = {
                new int[] { 1, 1, 1 },
                new int[] { 2, 2, 2 },
                new int[] { 3, 3, 3 }
        };

        int[] shortest = Vectors.findShortest(vectors);
        System.out.println("x: "+ shortest[0] + " y: "+ shortest[1] +" z: " + shortest[2]);
    }
}