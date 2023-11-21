
package juegorol;

public abstract class Personaje {
    
    public String nombre;
    public int maxHp, hp, fuerza, defensa, sabiduria, xp;
	
    public Personaje(String nombre, int maxHp, int defensa, int fuerza,
            int sabiduria, int xp){
	this.nombre = nombre;
	this.maxHp = maxHp;
	this.hp = maxHp;
        this.defensa=defensa;
        this.fuerza=fuerza;
        this.sabiduria=sabiduria;
        this.xp=xp;
    }
	
    public abstract int ataque();
    public abstract int defensa();
    public abstract int habilidad();
        
}




