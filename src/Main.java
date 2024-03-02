import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;
import br.com.dio.persistence.NIO2FilePersistence;
import br.com.dio.persistence.NIOFilePersistence;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new NIO2FilePersistence("user.csv");
        System.out.println("================================");
        System.out.println(persistence.write("Luana;luana@luana.com;28/09/1989;"));
        System.out.println("================================");
        System.out.println(persistence.write("Marcos;marcos@marcos.com;01/01/1999;"));
        System.out.println("================================");
        System.out.println(persistence.write("Henrique;henrique@henrique.com;03/05/2001;"));
        System.out.println("================================");
        System.out.println(persistence.findAll());
        System.out.println("================================");
        System.out.println(persistence.remove(";marcos@"));
        System.out.println("================================");
        System.out.println(persistence.remove("luiz@"));
        System.out.println("================================");
        System.out.println(persistence.findBy(";28/09/"));
        System.out.println("================================");
        System.out.println(persistence.findBy("Marcos"));
        System.out.println("================================");
        System.out.println(persistence.replace(";03/05/2", "Eric;eric@eric.com;20/06/1985"));
        System.out.println("================================");
        System.out.println(persistence.replace("Julia", "Maria;maria@maria.com;09/09/1999"));
        System.out.println("================================");
        System.out.println(persistence.findAll());
        System.out.println("================================");
    }

}
