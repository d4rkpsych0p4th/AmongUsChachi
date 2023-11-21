
package juegorol;

public class Enemigos extends Personaje{

    int XpJugador, defensaJugador, fuerzaJugador, sabiduriaJugador;
    
    
    public Enemigos(String nombre, int defensaJugador, int fuerzaJugador,
            int sabiduriaJugador, int XpJugador) {
        
        super(nombre,(int)(Math.random()*XpJugador+XpJugador/2.5+4),
                (int)(defensaJugador/2+XpJugador/4+2),
                (int)(fuerzaJugador/2+XpJugador/4+2),
                (int)(sabiduriaJugador/2+XpJugador/4+2),
                0);
        
        this.XpJugador=XpJugador;
        this.defensaJugador=(int)(defensaJugador/2+XpJugador/4+2);
        this.fuerzaJugador=(int)(fuerzaJugador/2+XpJugador/4+2);
        this.sabiduriaJugador=(int)(sabiduriaJugador/2+XpJugador/4+2);
        
    }

    @Override
    public int ataque() {
        return (int) (Math.random()*(XpJugador/4 + fuerzaJugador));
    }

    @Override
    public int defensa() {
        return (int) (Math.random()*(XpJugador/4 + defensaJugador));
    }

    @Override
    public int habilidad() {
        return (int) (Math.random()*(XpJugador/4 + sabiduriaJugador));
    }


}





