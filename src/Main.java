import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devAdriano = new Dev();
        devAdriano.setNome ("Adriano");
        devAdriano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Adriano:" + devAdriano.getConteudosInscritos());
        devAdriano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Adriano:" + devAdriano.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Adriano:" + devAdriano.getConteudosConcluidos());
        System.out.println("XP:" + devAdriano.calcularTotalXp());

        System.out.println("---------------");

        Dev devBruna = new Dev();
        devBruna.setNome ("Bruna");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruna: " + devBruna.getConteudosInscritos());
        devBruna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruna: " + devBruna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bruna: " + devBruna.getConteudosConcluidos());
        System.out.println("XP:" + devBruna.calcularTotalXp());





    }
}