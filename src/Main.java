import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso de Java", "Descrição do curso de Java", 8);
        Curso curso2 = new Curso("Curso de JavaScript", "Descrição do curso de JavaScript", 4);

        Mentoria mentoria = new Mentoria("Mentoria de java", "Descrição da mentoria de Java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
