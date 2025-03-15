package br.unifaj.java;

import java.util.ArrayList;
import java.util.Scanner;

public class SerieMenu {
    static ArrayList<Serie> sray = new ArrayList<Serie>();

    public static void listar() {
        if (!(sray.isEmpty())) {
            for (Serie i : sray) {
                System.out.println("Titulo: " + i.getTitulo() + "/ Genero: " + i.getGenero()
                        + "/ Protagonista: " + i.getProtagonista() + "/ Ano de lançamento: "
                        + i.getAnoLancamento() + "/ Numero de temporadas: " + i.getnTemporadas());
            }
        } else {
            System.out.println("*Nenhum serie castrada ainda!*");
        }
    }//fim da funcao listar

    public static void atualizar() {
        System.out.println("Qual o nome da serie que vc deseja atualizar? ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        for (Serie i : sray) {
            if (nome.equals(i.getTitulo())) {
                System.out.println("O que voce deseja atualizar?");
                String alt = sc.nextLine();
                switch (alt) {
                    case "titulo":
                        System.out.println("Qual o titulo da serie?");
                        nome = sc.nextLine();
                        i.setTitulo(nome);
                        System.out.println("Titulo atualizado com sucesso");
                        break;
                    case "genero":
                        System.out.println("Qual o genero da serie?");
                        nome = sc.nextLine();
                        i.setGenero(nome);
                        System.out.println("Genero atualizado com sucesso");
                        break;
                    case "protagonista":
                        System.out.println("Qual o nome do protagonista?");
                        nome = sc.nextLine();
                        i.setProtagonista(nome);
                        System.out.println("Protagonista atualizado com sucesso");
                        break;
                    case "ano":
                        System.out.println("Qual o ano de lançamento?");
                        Integer ano  = sc.nextInt();
                        i.setAnoLancamento(ano);
                        System.out.println("Ano de lançamento atualizado com sucesso");
                        break;
                    case "temporadas":
                        System.out.println("Quantas tempordas? ");
                        Integer temporadas = sc.nextInt();
                        i.setnTemporadas(temporadas);
                        System.out.println("Numero de temporadas atualizado com sucesso");
                        break;
                    default:
                        System.out.println("Opção invalida");
                }
                return;
            }
        }
        System.out.println("*Serie não encontrada*");
    }//fim da funcao atualizar

    public static void excluir() {
        System.out.println("Qual o nome da serie voce deseja Excluir?");
        Scanner sc = new Scanner(System.in);
        String atributo = sc.nextLine();
        for (Serie i : sray) {
            if (atributo.equals(i.getTitulo())) {
                sray.remove(i);
                System.out.println("Excluido com sucesso");
                return;
            }
        }
        System.out.println("*Serie não encontrada*");
    }//fim da funcao excluir

    public static void criar() {
        Serie s = new Serie();
        Scanner sc = new Scanner(System.in);
        System.out.println("Titulo: ");
        String titulo = sc.nextLine();
        s.setTitulo(titulo);

        System.out.println("Genero: ");
        String genero = sc.nextLine();
        s.setGenero(genero);

        System.out.println("Protagonista: ");
        String protagonista = sc.nextLine();
        s.setProtagonista(protagonista);

        System.out.println("Ano de Lançamento: ");
        Integer anoLancamento = sc.nextInt();
        s.setAnoLancamento(anoLancamento);

        System.out.println("Numero de Temporadas: ");
        Integer nTemporadas = sc.nextInt();
        s.setnTemporadas(nTemporadas);

        sray.add(s);

    }//fim da funcao criar

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicao = true;
        while (condicao) {
            System.out.println("***Menu de Series***");
            System.out.println("Selecione uma das opções");
            System.out.println("Opção 1 - Criar");
            System.out.println("Opção 2 - Listar");
            System.out.println("Opção 3 - Atualizar");
            System.out.println("Opção 4 - Excluir");
            System.out.println("Opção 5 - Nome e RA");
            System.out.println("Opção 6 - Sair");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("*Criar* ");
                    criar();
                    System.out.println("*Serie cadastrada com sucesso!* ");
                    break;
                case 2:
                    System.out.println("*Listar* ");
                    listar();
                    break;
                case 3:
                    System.out.println("*Atualizar* ");
                    atualizar();
                    break;
                case 4:
                    System.out.println("*Excluir* ");
                    excluir();
                    break;
                case 5:
                    System.out.println("*Nome e RA* ");
                    System.out.println("Nome: Yuri Chrystian de Oliveira");
                    System.out.println("RA: 12427365");
                    break;
                case 6:
                    System.out.println("*Sair* ");
                    condicao = false;
                    break;
                default:
                    System.out.println("Digite um opçao valida");

            }//fim do switch opçao
        }//Fim do while
    } //Fim da Main
} //Fim Classe SerieMenu.