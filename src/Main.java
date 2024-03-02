import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;
import br.com.dio.persistence.NIOFilePersistence;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new NIOFilePersistence("user.csv");
        System.out.println(persistence.write("Bianca;bia@bia.com;22/09/1997;"));
        System.out.println("==========================");
        System.out.println(persistence.write("Bernardo;bernardo@bernardo.com;28/11/1999;"));
        System.out.println("==========================");
        System.out.println(persistence.write("Ricardo;ricardo@ricardo.com;12/01/2000;"));
        System.out.println("==========================");
        System.out.println(persistence.findAll());
        System.out.println("==========================");
        System.out.println(persistence.remove(";ricardo@"));
        System.out.println("==========================");
        System.out.println(persistence.remove(";joana@"));
        System.out.println("==========================");
        System.out.println(persistence.findBy(";bia@"));
        System.out.println("==========================");
        System.out.println(persistence.findBy(";ricardo@"));
        System.out.println("==========================");
        System.out.println(persistence.replace("Bernardo", "Lucas;lucas@lucas.com;17/12/1988"));
        System.out.println("==========================");
        System.out.println(persistence.replace(";joaquim@", "Lucas;lucas@lucas.com;17/12/1988"));
        System.out.println("==========================");
    }

}
