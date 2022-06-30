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

        int[] arrayname = {1, 2, 3, 5, 5, 6, 6, 8, 1};
        int size= arrayname.length;

       if(checkPairSum(arrayname, size, 7)){

           System.out.println("yes");
       }else{
           System.out.println("no");
       }

    }

}

