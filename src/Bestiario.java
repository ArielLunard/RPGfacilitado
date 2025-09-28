import java.util.ArrayList;
import java.util.List;

public class Bestiario {
    private List<Monstro> monstros;
    private Monstro goblin;
    private Monstro aarakocra;

    public Bestiario() {
        monstros = new ArrayList<>();
        carregarMonstros();
    }

    private void carregarMonstros() {
        //Aarakocra
        Monstro aarakocra                    = new Monstro("AARAKOCRA","1d6",12,Rolagen.RDado("3d8")+8,12,10,14,18,11,12,11);
        //Habilidades Aarakocra
        Habilidade aarakocra_Ataque_Mergulho = new Habilidade("Ataque de Mergulho", "Físico", 0, "1d6", 0,      "Se o aarakocra estiver voando e mergulhar, pelo menos 9 metros, em linha reta em direção de um alvo e então atingi-lo com um ataque corpo-a-corpo armado, o ataque causa (1d6) de dano extra ao alvo.");
        Habilidade aarakocra_Garra           = new Habilidade("Garra",              "Físico", 4, "1d4", aarakocra.getDes(), "Golpeia o adverssário com suas garras causando 1d4 de dano.");
        Habilidade aarakocra_Azagaia         = new Habilidade("Azagaia",            "Físico", 4, "1d6", aarakocra.getDes(), "Golpeia o adverssário com sua azagaia causando 1d6 de dano.");

        aarakocra.adicionarHabilidade(aarakocra_Ataque_Mergulho);
        aarakocra.adicionarHabilidade(aarakocra_Garra);
        aarakocra.adicionarHabilidade(aarakocra_Azagaia);

        //Goblin
        Monstro    goblin            = new Monstro   ("GOBLIN","1d4",15,Rolagen.RDado("2d6")+6,15,8, 16,10,11,8, 8);
        //Habilidades Goblin
        Habilidade goblin_Intimidar  = new Habilidade("Escapada Ágil", "Habilidade", 0, "0",    0,    "O goblin pode realizar a ação de Desengajar ou Esconder-se com uma ação bônus em cada um dos seus turnos.");
        Habilidade goblin_Cimitarra  = new Habilidade("Cimitarra",     "Físico",     4, "1d6",  goblin.getDes(), "Golpeia o adverssário com sua cimitarra causando 1d6 de dano.");
        Habilidade goblin_Arco_Curto = new Habilidade("Arco Curto",    "Físico",     4, "1d6",  goblin.getDes(), "Golpeia o adverssário com sua arco curto causando 1d6 de dano.");

        goblin.adicionarHabilidade(goblin_Cimitarra);
        goblin.adicionarHabilidade(goblin_Intimidar);
        goblin.adicionarHabilidade(goblin_Arco_Curto);

        // Adicionando ao bestiário
        monstros.add(aarakocra);
        monstros.add(goblin);
    }

    // getters para acessar fora da classe
    public Monstro getGoblin() {
        return goblin;
    }

    public Monstro getAarakocra() {
        return aarakocra;
    }

    public List<Monstro> getTodos() {
        return monstros;
    }
}
