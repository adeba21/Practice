public class practice3 {
    public static void main(String[] args) {

        // 21
        String name="Parvina";
        int age= 20;
        int creditScore= 600;
        String result="";
        if (age>21){
            if (creditScore>550){
                result=name+ " is eligible for Credit Card";
            }else if (creditScore<=550){
                result= name+ " is not eligible for Credit Card";
            }
        }else{
            result= name+ " must be 21 years old for Credit Card";
        }
        System.out.println(result);
    }
}

