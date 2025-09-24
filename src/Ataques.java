public class Ataques {
    public static String goblin_cimitarra(Monstro atacante, Monstro alvo) {
        int numAct = Rolagen.RDado("1d20"); // rolagem de ataque
        int modAtaq = atacante.getDes();    // bônus de ataque baseado em Destreza
        int numDano = 0;

        if (numAct + modAtaq >= alvo.getCa()) { // acerto
            numDano = Rolagen.RDado("1d6") + modAtaq;
            alvo.receberDano(numDano);
            return atacante.getNome() + " acerta("+(numAct+modAtaq)+") " + alvo.getNome() +
                    " com cimitarra causando " + numDano + " de dano!";
        } else { // erro
            return atacante.getNome() + " erra("+(numAct+modAtaq)+") o ataque contra " + alvo.getNome() + "!";
        }
    }
}