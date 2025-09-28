public class Habilidade {
    private String nome;
    private String tipoDano;   // Ex: "Físico", "Mágico", "Fogo"
    private int    bonusAcerto; // Ex: 0
    private int    bonusAtaque; // Ex: 0
    private String dadoDano;   // Ex: "1d6"
    private String descricao;

    public Habilidade(String nome, String tipoDano, int bonusAcerto, String dadoDano, int bonusAtaque, String descricao) {
        this.nome        = nome;
        this.tipoDano    = tipoDano;
        this.bonusAcerto = bonusAcerto;
        this.dadoDano    = dadoDano;
        this.bonusAtaque = bonusAtaque;
        this.descricao   = descricao;
    }

    public String getNome() {
        return nome;
    }

    // Mecânica de acerto da habilidade
    public String usar(Monstro atacante, Monstro alvo) {
        int rolagemAtaque = Rolagen.RDado(dadoDano);   // exemplo: 1d20
        int bonusAtaque   = atacante.getDes();             // supondo que bônus é a destreza
        int resultado     = rolagemAtaque + bonusAcerto;

        if (resultado >= alvo.getCa()) {
            int dano = Rolagen.RDado(dadoDano) + bonusAtaque;
            alvo.receberDano(dano);
            return atacante.getNome() + " usa " + nome +
                    " e acerta ("+resultado+") " + alvo.getNome() +
                    " causando " + dano + " de dano " + tipoDano + "!";
        } else {
            return atacante.getNome() + " tenta usar " + nome +
                    " mas erra ("+resultado+") contra " + alvo.getNome() + "!";
        }
    }

    public void mostrarInfo() {
        System.out.println(" - " + nome + " (" + tipoDano + ")");
        System.out.println("   Ataque: " + bonusAtaque + " | Dano: " + dadoDano);
        System.out.println("   " + descricao);
    }
}
