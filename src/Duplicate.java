import java.util.Arrays;

public class Duplicate {

    public static void main(String[] args) {
        int [] arr= {2,4,5,1,3};

        dupli(arr);

        System.out.println(Arrays.toString(dupli(arr)));

    }

    static  void swap(int first, int second, int[] arr){

            int temp = arr[first];

            arr[first] = arr[second];

            arr[second] = temp;



    }
    static int[] dupli(int[] arr){

        int i = 0;


        while(i<arr.length){
            int Cix = arr[i]-1;

            if(arr[i]!=arr[Cix]){

                swap(i, Cix, arr);
            }

            i++;
        }
            return arr;

    }
}
