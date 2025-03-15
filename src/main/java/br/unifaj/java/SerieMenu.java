package br.unifaj.java;
import java.util.ArrayList;
import java.util.Scanner;

public class SerieMenu {
    static ArrayList<Serie> series = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        loopinfinito:

        while (true) {
            menu();
            if (entraOpcao(sc)) break loopinfinito;
        }//Fim do while
    }

    private static void listar(Scanner sc) {
        for (Serie s : series) {
            System.out.println(s);
        }
    }

    private static void incluir(Scanner sc) {
        System.out.println("*Incluir nova Serie*");
        sc.nextLine();
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Genero ");
        String genero = sc.nextLine();
        System.out.print("Protagonista: ");
        String protagonista = sc.nextLine();
        System.out.print("Ano de lancamento: ");
        int anoLancamento = sc.nextInt();
        System.out.print("Temporadas: ");
        int temporadas = sc.nextInt();

        Serie s = new Serie(titulo, genero, protagonista, anoLancamento, temporadas);
        series.add(s);

    }//Fim do metodo Main.

    private static boolean entraOpcao(Scanner sc) {
        int selecao = sc.nextInt();
        switch (selecao) {
            case 1:
                System.out.println("Opção 1 - Incluir ");
                incluir(sc);
                break;
            case 2:
                System.out.println("Opção 2 - Listar ");
                listar(sc);
                break;
            case 3:
                System.out.println("Opção 3 - Atualizar ");
                break;
            case 4:
                System.out.println("Opção 4 - Excluir ");
                break;
            case 5:
                System.out.println("Opção 5 - Nome/Ra");
                System.out.println("Yuri Chrystian de Oliveira / 12427365 ");
                break;

            case 6:
                System.out.println("Opção 6 - Sair ");
                return true;
            default:
                System.out.println("Opção invalida digite novamente");
                break;
        }//Fim do Switch
        return false;
    }

    private static void menu() {
        System.out.println("\n**Bem vindo ao menu de Series**\n");
        System.out.println("Selecione uma das opções: ");
        System.out.println("1 - Incluir ");
        System.out.println("2 - Listar ");
        System.out.println("3 - Alterar ");
        System.out.println("4 - Excluir ");
        System.out.println("5 - Nome/Ra ");
        System.out.println("6 - Sair ");

    }

} //Fim Classe FilmeMenu.