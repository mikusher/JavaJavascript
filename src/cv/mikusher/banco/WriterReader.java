




package cv.mikusher.banco;





import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;





public class WriterReader {

    static String caminho = "src/cv/mikusher/banco/dados/myObjects.txt";





    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Maria", 31, "Feminino");
        Pessoa p2 = new Pessoa("Mario", 29, "Masculino");

        try {
            FileOutputStream f = new FileOutputStream(new File(caminho));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // escrever para o ficheiro
            o.writeObject(p1);
            o.writeObject(p2);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File(caminho));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // ler objectos do ficheiro
            Pessoa pessoa_1 = (Pessoa) oi.readObject();
            Pessoa pessoa_2 = (Pessoa) oi.readObject();

            System.out.println(pessoa_1.toString());
            System.out.println();
            System.out.println(pessoa_2.toString());

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
