import java.util.Arrays;

public class Missing_positve {

    public static void main(String[] args) {

        int arr[] = {4,1,0,2};

        Missing_positve drive = new Missing_positve();

        drive.cyclone(arr);

        System.out.println(Arrays.toString(arr));


    }


    public static int cyclone(int[] arr){

        int i = 0;
        while(i<arr.length){

            int Cix = arr[i];

            if(arr[i]<arr.length && arr[i]!=arr[Cix]){

                swap(arr, i, Cix);
            }
            else{
                i++;
            }


        }
        for(int j = 0; j<arr.length; j++){

            if(arr[i]==i){
                return i;
            }

        }
        return arr.length;
    }



    public static int swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return temp;
    }

}
