




package cv.mikusher.agenda.classe.sqlClass;





public class Teste {

    static String passen = null;





    public static void main(String[] args) {

        try {
            passen = CriptoLogin.encrypt("1", "mikusher");
            System.out.println(passen);
            System.out.println(CriptoLogin.decrypt("1", passen));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
