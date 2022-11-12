import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1= new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2= new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

     //   System.out.println(curso1);
     //   System.out.println(curso2);
     //   System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Lucas"+devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Conteudos inscritos Lucas"+devLucas.getConteudosInscritos());
        System.out.println("Conteudos concluidos Lucas"+devLucas.getConteudosConcluidos());
        System.out.println("XP: "+devLucas.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos inscritos Joao"+devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos inscritos Joao"+devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao"+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXp());
    }
}