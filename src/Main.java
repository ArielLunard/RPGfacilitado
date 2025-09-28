public class Main {
    public static void main(String[] args) {
        Bestiario bestiario = new Bestiario();

        Monstro goblin1 = bestiario.getGoblin();
        Monstro aarakocra1 = bestiario.getAarakocra();

        System.out.println("=== Início do combate ===");
        System.out.println(goblin1);
        System.out.println(aarakocra1);

        System.out.println("=== Ataques ===");
        String resultado = usar.goblin_cimitarra(goblin1, aarakocra1);
        System.out.println(resultado);

        System.out.println("PV de " + aarakocra1.getNome() + ": " + aarakocra1.getPv());
    }
}
