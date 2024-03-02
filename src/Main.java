import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;
import br.com.dio.persistence.NIOFilePersistence;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new NIOFilePersistence("user.csv");
        System.out.println(persistence.write("bianca;bia@bia.com;22/09/1997;"));
        System.out.println("==========================");
        System.out.println(persistence.write("bernardo;bernardo@bernardo.com;28/11/1999;"));
        System.out.println("==========================");
        System.out.println(persistence.write("Ricardo;ricardo@ricardo.com;12/01/2000;"));
        System.out.println("==========================");
        System.out.println(persistence.findAll());
        System.out.println("==========================");
    }

}
