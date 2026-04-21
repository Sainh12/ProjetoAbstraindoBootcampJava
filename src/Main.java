import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargahoraria(40);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("descrição curso python");
        curso2.setCargahoraria(20);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlburquerque = new Dev();

        devAlburquerque.setNome("Alburquerque");
        devAlburquerque.increverBootcamp(bootcamp);

        System.out.println("===========================================================================");
        System.out.println("Conteudos Incristos Alburquerque " + devAlburquerque.getConteudoinscritos()+"\n");
        System.out.println("---------------------------------------------------------------------------");
        devAlburquerque.progredir();
        devAlburquerque.progredir();
        System.out.println("Conteudos Incristos Alburquerque " + devAlburquerque.getConteudoinscritos()+"\n");
        System.out.println("--------------------------------------------------");
        System.out.println("Conteudos concluidos Alburquerque " + devAlburquerque.getConteudoconcluido()+"\n");
        System.out.println("Xp: " + devAlburquerque.calcularTotalXp()+"\n");
        System.out.println("===========================================================================");

        Dev devPindamoiangaba = new Dev();
        devPindamoiangaba.setNome("Pindamoiangaba");
        devPindamoiangaba.increverBootcamp(bootcamp);
        System.out.println("Conteudos Incristos Pindamoiangaba" + devPindamoiangaba.getConteudoinscritos()+"\n");
        System.out.println("----------------------------------------------------------------------------");
        devPindamoiangaba.progredir();
        devPindamoiangaba.progredir();
        devPindamoiangaba.progredir();
        System.out.println("Conteudos Incristos Pindamoiangaba" + devPindamoiangaba.getConteudoinscritos()+"\n");
        System.out.println("--------------------------------------------------");
        System.out.println("Conteudos concluidos Pindamoiangaba " + devPindamoiangaba.getConteudoconcluido()+"\n");
        System.out.println("Xp: " + devPindamoiangaba.calcularTotalXp()+"\n");
        System.out.println("===========================================================================");

    }
}