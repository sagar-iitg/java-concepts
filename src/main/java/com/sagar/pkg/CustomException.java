package pkg;

public class CustomException {



    public static void main(String[] args) throws AgeLessThenZero {
        validateAge(-1);



    }

    private static  void validateAge(int age) throws AgeLessThenZero {

        if(age<0)
        {
            throw new AgeLessThenZero("Age cannot be negative");
        }

    }


}
