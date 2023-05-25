import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PokemonIniciaisTest {

    @Test
    @DisplayName("Testando a escolha de pokemons inicias")
    void testEscolhendoMelhorPokemonCharmander(){
        PokemonIniciais pokemonIniciais = new PokemonIniciais();
        assertEquals("Charmander" , pokemonIniciais.escolhendoPokemonInicial());
    }

}
