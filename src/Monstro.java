import java.util.ArrayList;
import java.util.List;

public class Monstro {
    private String nome;
    private String atq;
    private int ca; //Classe de Armadura
    private int pv; //Pontos de Pv
    private int dsc; //Desclocamento
    private int frc; //Força
    private int des; //Destreza
    private int con; //Constituição
    private int itl; //Inteligencia
    private int sab; //Sabedoria
    private int car; //Carisma
    private String CimAtaq;
    private List<Habilidade> habilidades; //Habiliades


    public Monstro(String nome, String atq, int ca, int pv, int dsc, int frc, int des, int con, int itl, int sab, int car) {
        this.nome = nome;
        this.atq  = atq; //Ataque base
        this.ca   = ca;  //Classe de Armadura
        this.pv   = pv;  //Pontos de Pv
        this.dsc  = dsc; //Desclocamento
        this.frc  = frc; //ForçaH
        this.des  = des; //Destreza
        this.con  = con; //Constituição
        this.itl  = itl; //Inteligencia
        this.sab  = sab; //Sabedoria
        this.car  = car; //Carisma
        this.habilidades = new ArrayList<>(); //Habiliades
    }

    public void receberDano(int dano) {
        pv = Math.max(0, pv - dano);
    }

    public void adicionarHabilidade(Habilidade habilidade) {
        habilidades.add(habilidade);
    }

    public String getNome() { return nome; }
    public String getAtq()  { return atq;  }
    public int    getCa()   { return ca;   }
    public int    getPv()   { return pv;   }
    public int    getDsc()  { return dsc;  }
    public int    getFrc()  { return new Modificador(frc).getModificador();}
    public int    getDes()  { return new Modificador(des).getModificador();}//Destreza
    public int    getCon()  { return new Modificador(con).getModificador();}//Constituição
    public int    getItl()  { return new Modificador(itl).getModificador();}//Inteligencia
    public int    getSab()  { return new Modificador(sab).getModificador();}//Sabedoria
    public int    getCar()  { return new Modificador(car).getModificador();}//Carisma

    public boolean estaVivo() {
        return pv > 0;
    }

    @Override
    public String toString() {
        return "Monstro{" +
                "nome='" + nome + '\'' +
                ", pv="  + pv +
                ", atq=" + atq +
                ", ca="  + ca +
                ", pv="  + pv +
                ", dsc=" + dsc +
                ", frc=" + frc +
                ", des=" + des +
                ", con=" + con +
                ", itl=" + itl +
                ", sab=" + sab +
                ", car=" + car +
                '}';
    }
}
