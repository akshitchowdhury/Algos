import java.util.Arrays;

public class Missing_positve {

    public static void main(String[] args) {

        int arr[] = {3,1,4,2};

        Missing_positve drive = new Missing_positve();

        drive.cyclone(arr);

        System.out.println(Arrays.toString(arr));


    }


    public void cyclone(int[] arr){

        int i = 0;
        while(i<arr.length){

            int Cix = arr[i]-1;

            if(arr[i]!=arr[Cix]){

                swap(arr, i, Cix);


            }
            else{
                i++;
            }


        }


    }



    public void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
