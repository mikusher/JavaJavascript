package cv.mikusher.agenda.classe.sqlClass;

public class Teste {

    static String pass = null;
    static int id = 1;

    public static void main(String[] args) {

        CriptoLogin cp = new CriptoLogin();
        try {
            pass = cp.encrypt("1","mikusher");
            System.out.println(cp.encrypt("1","mikusher"));
            System.out.println(cp.decrypt("1",pass));
            System.out.println(String.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
