package collection;

public class Main {


    public static void main(String[] args) {

        int input1=1;
        int input2=100;

        for(int i=input1;i<=input2;i++){

//            if(i%10==1)
//            {
//                System.out.println(i+" "+"st");
//
//            }
            if(i%10==2){
                System.out.println(i+" "+"nd");

            }
            else if(i%10==3){
                System.out.println(i+" "+"rd");

            }
            else{
                System.out.println(i+" "+"th");
            }

        }
    }
}
