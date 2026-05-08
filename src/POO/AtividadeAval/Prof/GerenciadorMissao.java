package POO.AtividadeAval.Prof;

public class GerenciadorMissao {

    private POO.AtividadeAvaliativaUm.resolucao.BancoNave bancoNave;
    private BancoMissao bancoMissao;

    public GerenciadorMissao(BancoNave bancoNave, BancoMissao bancoMissao) {
        this.bancoNave = bancoNave;
        this.bancoMissao = bancoMissao;
    }

    public void associarNave(int idMissao, int idNave) {
        Nave nave = bancoNave.findById(idNave);
        Missao missao = bancoMissao.findById(idMissao);

        if (nave == null || missao == null) {
            System.out.println("Missão ou Nave não encontrada.");
        } else {
            missao.setNave(nave);
        }
    }

    public void atualizarStatus(int idMissao, String novoStatus) {
        Missao missao = bancoMissao.findById(idMissao);

        if (missao == null) {
            System.out.println("Missão não encontrada");
        } else {
            missao.setStatus(novoStatus);
        }
    }
}
