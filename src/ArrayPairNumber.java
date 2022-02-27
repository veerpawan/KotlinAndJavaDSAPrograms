public class ArrayPairNumber {


    static boolean checkPairSum(int[] arrayname, int size, int sum){


        for(int i=0;i<size-1;i++){

            for(int j=(i+1);j<size;j++){

                if(arrayname[i]+arrayname[j]==sum) {
                    System.out.println(arrayname[i]+" "+arrayname[j] +"=" +sum);
                    //return true;
                }
            }

           // System.out.println(arrayname[i]);
        }

        return false;
    }


    public static void main(String[] args) {

        int[] arrayname = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int size= arrayname.length;

       if(checkPairSum(arrayname, size, 7)){

           System.out.println("yes");
       }else{
           System.out.println("no");
       }

    }

}

