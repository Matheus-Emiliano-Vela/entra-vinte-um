package POO.AtividadeAval.Abstracao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {//a "prateleira" alterado do arrayList<>() e list<String[]>
    private static List<POO.AtividadeAval.Missao> missoes = new ArrayList<>();
    private static List<POO.AtividadeAval.NaveEspacial> naves = new ArrayList<>();
    private static List<POO.AtividadeAval.Astronauta> astronautas = new ArrayList<>();

    private static int proximoIdMissao = 1;
    private static int proximoIdNave = 1;
    private static int proximoIdAstronauta = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        adicionarMissao("Missão Marte", "Explorar a superfície de Marte", "2025-01-15", "Planejada");
        adicionarNave("Discovery One", "Exploração", 5);
        adicionarAstronauta("Neil Armstrong", "Comandante");
        adicionarAstronauta("Buzz Aldrin", "Piloto");

        do {
            System.out.println("\n--- Sistema de Gerenciamento de Exploração Espacial ---");
            System.out.println("1. Adicionar Missão");
            System.out.println("2. Adicionar Nave Espacial");
            System.out.println("3. Adicionar Astronauta");
            System.out.println("4. Listar Missões");
            System.out.println("5. Listar Naves");
            System.out.println("6. Listar Astronautas");
            System.out.println("7. Associar Nave a Missão");
            System.out.println("8. Associar Astronauta a Missão");
            System.out.println("9. Atualizar Status da Missão");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome da Missão: ");
                    String nomeMissao = scanner.nextLine();

                    System.out.print("Objetivo da Missão: ");
                    String objetivoMissao = scanner.nextLine();

                    System.out.print("Data de Lançamento (AAAA-MM-DD): ");
                    String dataLancamento = scanner.nextLine();

                    System.out.print("Status (Planejada, Em Andamento, Concluída, Cancelada): ");
                    String statusMissao = scanner.nextLine();

                    adicionarMissao(nomeMissao, objetivoMissao, dataLancamento, statusMissao);
                    break;

                case 2:
                    System.out.print("Nome da Nave: ");
                    String nomeNave = scanner.nextLine();

                    System.out.print("Tipo da Nave: ");
                    String tipoNave = scanner.nextLine();

                    System.out.print("Capacidade da Nave: ");
                    int capacidadeNave = scanner.nextInt();
                    scanner.nextLine();

                    adicionarNave(nomeNave, tipoNave, capacidadeNave);
                    break;

                case 3:
                    System.out.print("Nome do Astronauta: ");
                    String nomeAstronauta = scanner.nextLine();

                    System.out.print("Especialidade do Astronauta: ");
                    String especialidadeAstronauta = scanner.nextLine();

                    adicionarAstronauta(nomeAstronauta, especialidadeAstronauta);
                    break;

                case 4:
                    listarMissoes();
                    break;

                case 5:
                    listarNaves();
                    break;

                case 6:
                    listarAstronautas();
                    break;

                case 7:
                    System.out.print("ID da Missão para associar nave: ");
                    int idMissaoAssocNave = scanner.nextInt();

                    System.out.print("ID da Nave para associar: ");
                    int idNaveAssoc = scanner.nextInt();
                    scanner.nextLine();

                    associarNaveAMissao(idMissaoAssocNave, idNaveAssoc);
                    break;

                case 8:
                    System.out.print("ID da Missão para associar astronauta: ");
                    int idMissaoAssocAstronauta = scanner.nextInt();

                    System.out.print("ID do Astronauta para associar: ");
                    int idAstronautaAssoc = scanner.nextInt();
                    scanner.nextLine();

                    associarAstronautaAMissao(idMissaoAssocAstronauta, idAstronautaAssoc);
                    break;

                case 9:
                    System.out.print("ID da Missão para atualizar status: ");
                    int idMissaoAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo Status (Planejada, Em Andamento, Concluída, Cancelada): ");
                    String novoStatus = scanner.nextLine();

                    atualizarStatusMissao(idMissaoAtualizar, novoStatus);
                    break;

                case 0:
                    System.out.println("Saindo do sistema.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);


    }

    public static void adicionarMissao(String nome, String objetivo, String dataLancamento, String status) {
        POO.AtividadeAval.Missao missao = new POO.AtividadeAval.Missao(proximoIdMissao++, nome, objetivo, dataLancamento, status);
        missoes.add(missao);
        System.out.println("Missão " + nome + " adicionada com sucesso!");
    }

    public static void adicionarNave(String nome, String tipo, int capacidade) {
        POO.AtividadeAval.NaveEspacial nave = new POO.AtividadeAval.NaveEspacial(proximoIdNave++, nome, tipo, capacidade);
        naves.add(nave);
        System.out.println("Nave " + nome + " adicionada com sucesso!");
    }

    public static void adicionarAstronauta(String nome, String especialidade) {
        POO.AtividadeAval.Astronauta astronauta = new POO.AtividadeAval.Astronauta(proximoIdAstronauta++, nome, especialidade);
        astronautas.add(astronauta);
        System.out.println("Astronauta " + nome + " adicionado com sucesso!");
    }

    public static void listarMissoes() {
        System.out.println("\n--- Lista de Missões ---");

        if (missoes.isEmpty()) {
            System.out.println("Nenhuma missão cadastrada.");
            return;
        }

        for (POO.AtividadeAval.Missao missao : missoes) {
            missao.exibirInformacoes();
        }
    }

    public static void listarNaves() {
        System.out.println("\n--- Lista de Naves Espaciais ---");

        if (naves.isEmpty()) {
            System.out.println("Nenhuma nave cadastrada.");
            return;
        }

        for (POO.AtividadeAval.NaveEspacial nave : naves) {
            nave.exibirInformacoes();
        }
    }

    public static void listarAstronautas() {
        System.out.println("\n--- Lista de Astronautas ---");

        if (astronautas.isEmpty()) {
            System.out.println("Nenhum astronauta cadastrado.");
            return;
        }

        for (POO.AtividadeAval.Astronauta astronauta : astronautas) {
            astronauta.exibirInformacoes();
        }
    }

    public static void associarNaveAMissao(int idMissao, int idNave) {
        POO.AtividadeAval.Missao missao = buscarMissaoPorId(idMissao);
        POO.AtividadeAval.NaveEspacial nave = buscarNavePorId(idNave);

        if (missao != null && nave != null) {
            missao.associarNave(nave);
            System.out.println("Nave " + nave.getNome() + " associada à missão ID " + idMissao + " com sucesso!");
        } else {
            System.out.println("Missão ou Nave não encontrada.");
        }
    }

    public static void associarAstronautaAMissao(int idMissao, int idAstronauta) {
        POO.AtividadeAval.Missao missao = buscarMissaoPorId(idMissao);
        POO.AtividadeAval.Astronauta astronauta = buscarAstronautaPorId(idAstronauta);

        if (missao != null && astronauta != null) {
            missao.associarAstronauta(astronauta);
            System.out.println("Astronauta " + astronauta.getNome() + " associado à missão ID " + idMissao + " com sucesso!");
        } else {
            System.out.println("Missão ou Astronauta não encontrada.");
        }
    }

    public static void atualizarStatusMissao(int idMissao, String novoStatus) {
        POO.AtividadeAval.Missao missao = buscarMissaoPorId(idMissao);

        if (missao != null) {
            missao.atualizarStatus(novoStatus);
            System.out.println("Status da Missão ID " + idMissao + " atualizado para " + novoStatus + " com sucesso!");
        } else {
            System.out.println("Missão não encontrada.");
        }
    }

    private static POO.AtividadeAval.Missao buscarMissaoPorId(int idMissao) {
        for (Missao missao : missoes) {
            if (missao.getId() == idMissao) {
                return missao;
            }
        }

        return null;
    }

    private static POO.AtividadeAval.NaveEspacial buscarNavePorId(int idNave) {
        for (NaveEspacial nave : naves) {
            if (nave.getId() == idNave) {
                return nave;
            }
        }

        return null;
    }

    private static POO.AtividadeAval.Astronauta buscarAstronautaPorId(int idAstronauta) {
        for (Astronauta astronauta : astronautas) {
            if (astronauta.getId() == idAstronauta) {
                return astronauta;
            }
        }

        return null;
    }
}
