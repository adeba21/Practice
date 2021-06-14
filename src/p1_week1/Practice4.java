package p1_week1;

public class Practice4 {

    public static void main(String[] args) {

//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
// print "FIN" instead of the number and for numbers which are a multiple of 5,
// print "RA" instead of the number. for numbers which are a multiple of both 3 and 5,
// print "FINRA" instead of the number.

        System.out.println(Finra());


    }
    public static String Finra() {
        String fin = "Fin";
        String ra = "Ra";
        String Finra = "FinRa";
        String sum = " ";

        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0) {
                sum += i + fin;
            } else if (i % 3 == 0 && i % 5 == 0) {
                sum += i + ra;

            } else {

                sum += i + Finra;

            }
        }
        return sum;
    }}
