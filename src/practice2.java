public class practice2 {
    public static void main(String[] args) {
        String personName="Mahir";
        int age=17;
        double weight= 50;
        String result="";
        if ( age > 18 ){
            if (weight > 50.0){
                result= personName + " is eligible to give blood";
            }else if (weight <= 50.0 ){
                result= personName + " is not eligible to give blood ";
            }
        }else {
            result = personName + " needs to be older then 18 ";
        }
        System.out.println(result);
    }
}

