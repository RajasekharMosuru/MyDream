import java.util.Arrays;

public class MovingAllZeros {
    public static void main(String[] args) {
        int [] arr = {0, 5, 0, 8, 0, 3, 12, 0, 7, 9};
        moveZerosToRight(arr);
    }

    private static void moveZerosToRight(int[] arr) {
        int index =0;
        for(int i =0; i < arr.length;i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));

        int reverse = arr.length-1;

        for(int i =arr.length-1; i >= 0;i--){
            if(arr[i] != 0){
                arr[reverse--] = arr[i];
            }
        }
        while(reverse >=0){
            arr[reverse--] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }
}
