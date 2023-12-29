import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buf {


    static void BufTest(){
        BufferedReader test = new BufferedReader(new InputStreamReader(System.in));
        try {
            String  bufInput = test.readLine();
            System.out.println(bufInput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }




    public static void main(String[] args) {
        buf.BufTest();
    }

}





