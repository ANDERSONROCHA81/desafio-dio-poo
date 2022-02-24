import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso de Java", "Descrição do curso de Java", 8);
        Curso curso2 = new Curso("Curso de JavaScript", "Descrição do curso de JavaScript", 4);

        Mentoria mentoria = new Mentoria("Mentoria de java", "Descrição da mentoria de Java", LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Anderson");
        dev1.inscreverBootcamp(bootCamp);
        System.out.printf("Conteúdos inscritos de %s: %s%n", dev1.getNome(), dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.printf("Conteúdos concluidos de %s: %s%n", dev1.getNome(), dev1.getConteudosConcluidos());
        System.out.printf("Conteúdos inscritos de %s: %s%n", dev1.getNome(), dev1.getConteudosInscritos());
        System.out.println("XP: "+ dev1.calcularTotalXp());

        System.out.println("--------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Patrícia");
        dev2.inscreverBootcamp(bootCamp);
        System.out.printf("Conteúdos inscritos de %s: %s%n", dev2.getNome(), dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.printf("Conteúdos concluidos de %s: %s%n", dev2.getNome(), dev2.getConteudosConcluidos());
        System.out.printf("Conteúdos inscritos de %s: %s%n", dev2.getNome(), dev2.getConteudosInscritos());
        System.out.println("XP: "+ dev2.calcularTotalXp());

    }
}
