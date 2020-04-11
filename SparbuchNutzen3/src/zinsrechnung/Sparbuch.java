import java.util.Arrays;

class Sparbuch {
    public static void main(String[] args) {
        int [] massive = {4, 2, 9, 6, 12, 7, 10, 3};
        bubleSort(massive);
    }

    public static void bubleSort(int[] massive){
        for(int i = 0; i < massive.length - 1; i++){
            for(int j = massive.length; j > 1; j--){
                if(massive[i] > massive[i+1]){
                    int m = massive[i];
                    massive[i] = massive[i+1];
                    massive[i+1] = m;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}