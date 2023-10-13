class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class AppelMethod {
    public void method1() throws CustomException {
        try {
            this.method2();
        } catch (CustomException e) {
            throw new CustomException("Erreur dans method1 : " + e.getMessage());
        }
    }
    public void method2() throws CustomException {
        try {
            throw new CustomException("Erreur dans method2");
        } catch (CustomException e) {
            throw new CustomException("Erreur dans method2 : " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        AppelMethod appel = new AppelMethod();
        try {
            appel.method1();
        } catch (CustomException e) {
            System.out.println("Erreur dans le programme principal : " + e.getMessage());
        }
    }
}