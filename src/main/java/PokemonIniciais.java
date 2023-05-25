import java.util.concurrent.TimeUnit;

public class PokemonIniciais {

    private final String melhorPokemon = "Charmander";

    public void escolhendoPokemonInicial() {
        System.out.println("--Escolhendo Pokemon Inicial--");
        this.pensando(1);
        System.out.println("\nPokémons Iniciais:");
        this.pensando(1);
        System.out.println("- Bulbasaur");
        System.out.println("- Charmander");
        System.out.println("- Squirtle");
        this.pensando(1);
        System.out.println("\nO escolhido foi o melhor Pokémon: " + this.melhorPokemon + "!");
    }

    private void pensando(int time){
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
