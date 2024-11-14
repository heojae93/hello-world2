import com.sun.source.tree.IfTree;

import java.time.LocalDate;
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {
        // int 나이;
        // 나이 = 20;
        int 나이 = 20;
        나이 = 나이 + 1;
        나이 = 나이 + 1;
        나이 = 나이 + 1;
        나이 = 나이 + 1;

        System.out.println("나이 = " + 나이);


        int count = 5;
        count = count - 1;
        count = count - 1;
        count = count - 1;
        count = count - 1;

        System.out.println("count = " + count);

        int a = 3;
        int b = 6;
        int c = 9;

        int temp = a;
        a = c; // a = 9
        c = b; // c = 6
        b = temp; // b = 3


        System.out.println("a = " + a); //9
        System.out.println("b = " + b); //3
        System.out.println("c = " + c); //6

        int n = 20;
        n = -20;

        System.out.println("n = " + n); //n = -20

        LocalDate currentTime = LocalDate.now();
        System.out.println(currentTime.plusDays(18));
        System.out.println(currentTime.plusDays(19));
































    }
}

