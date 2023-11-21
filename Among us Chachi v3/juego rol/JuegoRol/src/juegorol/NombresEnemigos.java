
package juegorol;

public class NombresEnemigos {
    
    public static String[] enemigos = {"Goblin", "Orco", "Mutante", "Brujo",
        "Hechizero", "Fantasma", "Demonio", "Troll", "Caballero", "Litch"};

    
    public String nombres(int escenario){
        String nombre="";
        switch (escenario){
            case 0:
                nombre=enemigos[(int)(Math.random()*enemigos.length)]+" del bosque";
                return nombre;
            case 1:
                nombre=enemigos[(int)(Math.random()*enemigos.length)]+" del lago";
                return nombre;
            case 2:
                nombre=enemigos[(int)(Math.random()*enemigos.length)]+" de la montania";
                return nombre;
            case 3:
                nombre=enemigos[(int)(Math.random()*enemigos.length)]+" del volcan";
                return nombre;
            case 4:
                nombre=enemigos[(int)(Math.random()*enemigos.length)]+" de fuego";
                return nombre;
            case 5:
                nombre=enemigos[(int)(Math.random()*enemigos.length)]+" de la mazmorra";
                return nombre;
            case 6:
                nombre=enemigos[(int)(Math.random()*enemigos.length)]+" infernal";
                return nombre;
            case 7:
                nombre=enemigos[(int)(Math.random()*enemigos.length)]+" del palacio";
                return nombre;
            case 8:
                nombre=enemigos[(int)(Math.random()*enemigos.length)]+" del cementerio";
                return nombre;
            case 9:
                nombre=enemigos[(int)(Math.random()*enemigos.length)]+" del fin";
                return nombre;
        }
        return null;
    }
    
}


