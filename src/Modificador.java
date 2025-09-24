public class Modificador {
    private int atributo;

    public Modificador(int atributo) {
        this.atributo = atributo;
    }

    public int getModificador() {
        return (this.atributo - 10) / 2;
    }
}