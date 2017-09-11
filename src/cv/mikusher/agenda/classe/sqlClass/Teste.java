




package cv.mikusher.agenda.classe.sqlClass;





public class Teste {

    static String pass = null;
    static int    id   = 1;





    public static void main(String[] args) {

        try {
            pass = CriptoLogin.encrypt("1", "mikusher");
            System.out.println(CriptoLogin.encrypt("1", "mikusher"));
            System.out.println(CriptoLogin.decrypt("1", pass));
            System.out.println(String.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
