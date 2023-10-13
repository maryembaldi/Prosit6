import java.io.*;

public class TestExceptions {
    public static void main(String[] args) {
        try {
            FileInputStream inputFile = new FileInputStream("Sample.jpg");
            FileOutputStream outputFile = new FileOutputStream("Output1.jpg");
            int c;
            while ((c = inputFile.read()) != -1) {
                outputFile.write(c);
            }
            System.out.println("Copie de fichier terminée.");

            inputFile.close();
            outputFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé : " + e.getMessage());
        } catch (IOException e) {

            System.out.println("Erreur d'entrée/sortie : " + e.getMessage());
        }
    }
}