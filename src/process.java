import java.io.BufferedReader;
import java.io.InputStreamReader;


public class process {

        public static void main(String[] args) {
            try {
                String process;
                Process p = Runtime.getRuntime().exec("ps -few");
                BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                while ((process = input.readLine()) != null) {
                    System.out.println(process);
                }
                input.close();
            } catch (Exception err) {
                err.printStackTrace();
            }
        }
    }
