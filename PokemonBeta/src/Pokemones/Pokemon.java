
package Pokemones;

import java.util.Random;

public class Pokemon {
    
    
    String nombre;
    int HP;
    int nivel;
    String habilidad;
    String especie;
    String tipo;
    double peso;
    double altura;
    String habitat;
    int aleatorio;
    
    public Pokemon(String nombre, int HP, int nivel, String habilidad, String tipo, double peso, double altura){
        this.nombre = nombre;
        this.HP = HP;
        this.nivel = nivel;
        this.habilidad = habilidad;
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
    }
    
    //Metodo que selecciona aleatoriamente a un pokemon
    public void EleccionPokemonInicio() {
        Random pokemonRandom = new Random();
        aleatorio = 1 + pokemonRandom.nextInt(5);
        this.aleatorio =  aleatorio;
    }
    
    public void InicioPokemon(){
        EleccionPokemonInicio();
        if (aleatorio == 1) {
            
        }
    }
    
    
    
    
    
    
}
