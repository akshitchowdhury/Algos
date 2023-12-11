import java.util.Arrays;

public class C2 {
    public static void main(String[] args) {

        int arr[] = {10,4,3,1,2,8,6,5,9,7};

        C2 cycle = new C2();
        cycle.cyclone(arr);

        System.out.println(Arrays.toString(arr));
    }


    public void cyclone(int []arr){

        int i=0;
        while (i<arr.length){
            int cix = arr[i]-1;
            if(arr[i]!=arr[cix]){

                swap(arr, i, cix);
            }
            else {
                i++;
            }
        }

    }

    public void swap(int []arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
