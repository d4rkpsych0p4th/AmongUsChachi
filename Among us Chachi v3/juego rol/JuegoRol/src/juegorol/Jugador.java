
package juegorol;

public class Jugador extends Personaje{
	
	
	public Jugador(String nombre, int defensa, int fuerza, int sabiduria) {
            super(nombre, 100, defensa, fuerza, sabiduria, 0);
            
	}

        

    @Override
    public int ataque() {
        return (int) (Math.random()*xp/3 + fuerza*1.5);
    }

    @Override
    public int defensa() {
        return (int) (Math.random()*xp/3 + defensa*1.5);
    }

    @Override
    public int habilidad() {
        return (int) (Math.random()*xp/3 + sabiduria*5);
    }
}






