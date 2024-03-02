import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println("======================");
        System.out.println(persistence.write("Lucas;lucas@lucas.com;15/01/1990;"));
        System.out.println("======================");
        System.out.println(persistence.write("Maria;maria@maria.com;23/10/2000;"));
        System.out.println("======================");
        System.out.println(persistence.write("João;joao@joao.com;01/12/1995;"));
        System.out.println("======================");
        System.out.println(persistence.findAll());
        System.out.println("======================");
        System.out.println(persistence.remove("/12/19"));
        System.out.println("======================");
        System.out.println(persistence.remove("/06/202"));
        System.out.println("======================");
        System.out.println(persistence.findBy("Lucas;"));
        System.out.println("======================");
        System.out.println(persistence.findBy(";maria@"));
        System.out.println("======================");
        System.out.println(persistence.findBy("95;"));
        System.out.println("======================");
        System.out.println(persistence.replace(".com;15/01/", "Carlos;carlos@carlos.com;22/03/1991"));
        System.out.println("======================");
        System.out.println(persistence.findAll());
    }

}
