import java.io.IOException;

public class TestFinally{
    
 

    public static void main(String[] args) throws IOException {
     
            System.out.println("entrer votre code ");
            // traiter cette exception 
        try {
            int x =   System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // afficher toujours le message "Merci de votre visite"
     
    }

}


