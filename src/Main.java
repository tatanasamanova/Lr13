import java.io.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader fr = new BufferedReader(new FileReader("src//input.txt"))) {
            int k = 0;
            String text = "";
            while ((k = fr.read()) != -1) {
                text += (char) k;
            }
            int value = text.indexOf("//");
            int value2 = text.indexOf("\n",value);
            StringBuffer sb = new StringBuffer(text);
            sb.delete(value, value2);
            int value3 = sb.indexOf("/*");
            int value4 = sb.lastIndexOf("*/");
            StringBuffer kb = new StringBuffer(sb);
            kb.delete(value3, value4 + 2);
            System.out.println(kb);
            try (FileWriter fww = new FileWriter("src//output.txt");
                 BufferedWriter ad = new BufferedWriter(fww)){
                ad.write(kb.toString());
            } catch (IOException ex){
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}