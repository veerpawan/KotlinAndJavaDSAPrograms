public class RerunIfElse {

    public static void main(String[] args){
        System.out.println("outside1");
        if(true){
            System.out.println("prime");
            return;
        }else{
            System.out.println("no prime");
        }
        System.out.println("outside2");
    }
}
