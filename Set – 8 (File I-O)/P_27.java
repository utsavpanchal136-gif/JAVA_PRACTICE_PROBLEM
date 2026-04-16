import java.io.*;

public class P_27 {
    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // Writing student records
            fw = new FileWriter("students.txt");

            fw.write("101 Utsav 85\n");
            fw.write("102 Rahul 90\n");
            fw.write("103 Amit 78\n");

            fw.close();

            // Reading student records
            br = new BufferedReader(new FileReader("students.txt"));

            String line;
            System.out.println("Student Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());

        } finally {
            try {
                if (fw != null)
                    fw.close();

                if (br != null)
                    br.close();

            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
