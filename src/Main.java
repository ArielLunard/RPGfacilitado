public class Main {
    public static void main(String[] args) {
        Monstro goblin = Bestiario.goblin;
        Monstro aarakocra = Bestiario.aarakocra;

        System.out.println("=== Início do combate ===");
        System.out.println(goblin);
        System.out.println(aarakocra);

        // Goblin ataca Aarakocra
        System.out.println("=== Ataques ===");
        String resultado = Ataques.goblin_cimitarra(goblin, aarakocra);
        System.out.println(resultado);

        System.out.println("PV de " + aarakocra.getNome() + ": " + aarakocra.getPv());
    }
}
