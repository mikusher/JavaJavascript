




package cv.mikusher.agenda.classe.sqlClass;





public class Teste {

    static String passen = null;





    public static void main(String[] args) {

        try {
			String inputValue = "mikusher";
			System.out.println("Input Value is: " + inputValue);
			passen = CriptoLogin.encrypt("1", inputValue);
			System.out.println("Encrypt the InputValue: " + passen);
			System.out.println("Decrypt the Value: " + CriptoLogin.decrypt("1", passen));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
