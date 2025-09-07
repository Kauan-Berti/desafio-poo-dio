import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        adicionarCurso(curso1);

        Curso curso2 = new Curso();
        adicionarCurso(curso2);

        Mentoria mentoria = new Mentoria();
        adicionaMentoria(mentoria);

        BootCamp bootCamp = new BootCamp();
        adicionaBootcamp(bootCamp);
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        System.out.println("=============================");
        System.out.println("Crie dois devs para cursar o Bootcamp " + bootCamp.getNome());
        System.out.println("=============================");

        Dev dev1 = new Dev();
        adicionarDev(dev1, bootCamp);
        dev1.progredir();
        dev1.progredir();
        System.out.println("-------------------");
        System.out.println("Conteúdos que " + dev1 + "está Inscritos: " +  dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluiudos de " + dev1 + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("=============================");

        Dev dev2 = new Dev();
        adicionarDev(dev2, bootCamp);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-------------------");
        System.out.println("Conteúdos que " + dev2 + "está Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluiudos de " + dev2 + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

        scanner.close();
    }

    //Metodo para adicionar curso
    private static void adicionarCurso(Curso curso) {
        System.out.println("Digite o título do curso:");
        curso.setTitulo(scanner.nextLine());
        System.out.println("Digite a descrição do curso:");
        curso.setDescricao(scanner.nextLine());
        System.out.println("Digite a carga horária do curso:");
        curso.setCargaHoraria(scanner.nextInt());
        scanner.nextLine(); // limpa o buffer
        System.out.println("=============================");
    }

    //Metodo para adicionar dev
    private static void adicionarDev(Dev dev, BootCamp bootCamp) {
        System.out.println("Digite o nome do dev:");
        dev.setNome(scanner.nextLine());
        dev.inscreverBootcamp(bootCamp);
        System.out.println("Dev " + dev.getNome() + " inscrito em " + bootCamp.getNome() + " com sucesso!");
        scanner.nextLine(); // limpa o buffer
    }
    //Metodo para adicionar mentoria
    public static void adicionaMentoria(Mentoria mentoria){
        System.out.println("Digite o título da mentoria: ");
        mentoria.setTitulo(scanner.nextLine());
        System.out.println("Digite a descrição da mentoria " + mentoria.getTitulo() + ":");
        mentoria.setDescricao(scanner.nextLine());
        scanner.nextLine(); // limpa o buffer
        mentoria.setData(LocalDate.now());
    }

    //Metodo para adicionar bootcamp
    public static void adicionaBootcamp(BootCamp bootCamp){
        System.out.println("Digite o Nome do Bootcamp:");
        bootCamp.setNome(scanner.nextLine());
        System.out.println("Digite a Descrição do Bootcamp:");
        bootCamp.setDescricao(scanner.nextLine());
        System.out.println("=============================");
        System.out.println(bootCamp.getNome() + " criado com sucesso!");
    }


}
