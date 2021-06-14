package p1_week1;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Date;

public class class1 {
    public static void main(String[] args) {
            /* create a java program that sees if the person is eligible for credit card
             credit score=600
             age= 21
             citizen or not= yes
             Name= Parvina

             */
        String name = "Parvina";
        int age = 21;
        int creditScore = 500;
        String result = "";

        if (age > 18) {
            if (creditScore > 550) {
                result = name + " is eligible for Credit Card";
            } else if (creditScore <= 550) {
                result = name + "is not Eligible for Credit Card ";
            }
        }
        else {
            result = name + " must be 21 for Credit Card";
        }
        System.out.println(result);

    }
}
