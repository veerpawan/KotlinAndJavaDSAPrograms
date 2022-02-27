public class maxArray {

    public static void main(String[] args){

        Integer name[] = {1,2,3,4};

        int max =name[0];

        //System.out.println(name.length);
        for(int i =1; i<name.length;i++){

            if(name[i] > max){
                max = name[i];

            }

        }
        System.out.println(max);

    }

}
