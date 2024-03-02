import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println(persistence.write("Lucas;lucas@lucas.com;15/01/1990"));
    }

}
