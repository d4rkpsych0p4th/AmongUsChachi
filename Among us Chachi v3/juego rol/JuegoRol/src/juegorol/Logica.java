
package juegorol;

import java.util.Scanner;

public class Logica {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static String[] escenarios = {"Bosque Negro", "Lago Ceniza",
        "Montanias Olvidadas", "Volcan Maldito", "Templo de Fuego",
        "Mazmorra Oculta", "Fortaleza Infernal", "Aposentos Reales",
        "Cementerio Oculto", "Fin del Mundo"};
    
    public static int escenario = 0;
    
    public static String[] MejorasAtk = {"Alabarda Imperial", "Punietazo de Dios", "Cuchilla del Vacio"};
    public static String[] MejorasDef = {"Armadura Caparazon", "Yelmo Gigante", "Coraza Divina"};
    public static String[] MejorasSab = {"Baculo Sagrado", "Sombrero de Sabio", "Orbe del Oraculo"};
    
    static Jugador jugador;
    
    static NombresEnemigos enemigos = new NombresEnemigos();
    
    public static int Leer(String Prompt, int Decision){
	int input;
	do{
            System.out.println(Prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
		input = -1;
		System.out.println("Ingrese un numero entero");
            }
	}while(input < 1 || input > Decision);
	return input;
    }
    

    
    public static void Iniciar(){
	boolean datos = false;
	String nombre;
        int fuerza, defensa, sabiduria;
	
	do{
            System.out.println("Cual es tu nombre?");
            nombre = scanner.next();
            System.out.println("Tu nombre es " + nombre);
            System.out.println("Nivel de fuerza: 1 a 5");
            fuerza= Leer("-> ", 5);
            System.out.println("Nivel de defensa: 1 a 5");
            defensa= Leer("-> ", 5);
            System.out.println("Nivel de sabiduria: 1 a 5");
            sabiduria= Leer("-> ", 5);
            System.out.println("Estas seguro de los datos anteriores?");
            System.out.println("(1) Si");
            System.out.println("(2) No, los quiero cambiar");
            int input = Leer("-> " , 2);
            if(input == 1)
                datos = true;
        }while(!datos);
		
	jugador = new Jugador(nombre, defensa, fuerza, sabiduria);
        Equipamiento();
        
        System.out.println("Tu aventura comienza");
        Juego();
	}
    

    
    public static void Juego(){
        int i=0;
	while(jugador.hp>0){
            System.out.println("Vida actual: "+jugador.hp);
            System.out.println("XP actual: "+jugador.xp);
            Batalla(escenario);
            i++;
            jugador.xp=i;
            switch(i){
                case 10:
                    escenario++;
                    break;
                case 20:
                    escenario++;
                    break;
                case 30:
                    escenario++;
                    break;
                case 40:
                    escenario++;
                    break;
                case 50:
                    escenario++;
                    break;
                case 60:
                    escenario++;
                    break;
                case 70:
                    escenario++;
                    break;
                case 80:
                    escenario++;
                    break;
                case 90:
                    escenario++;
                    break;
            }
            
        }
    }	
    

    
    public static void Equipamiento(){
            
        int MejoraAtk, MejoraDef, MejoraSab;
        MejoraAtk=(int)(Math.random()*MejorasAtk.length);
        MejoraDef=(int)(Math.random()*MejorasDef.length);
        MejoraSab=(int)(Math.random()*MejorasSab.length);
        String MejoraA=MejorasAtk[MejoraAtk];
        String MejoraD=MejorasDef[MejoraDef];
        String MejoraS=MejorasSab[MejoraSab];

        System.out.println("Elige un equipamiento");


        System.out.println("(1) " + MejoraA);
        System.out.println("(2) " + MejoraD);
        System.out.println("(3) " + MejoraS);
        int input = Leer("-> ", 3);

        switch (input) {
            case 1:
                System.out.println("Escogiste " + MejoraA);
                jugador.fuerza+=MejoraAtk*3;
                break;
            case 2:
                System.out.println("Escogiste" + MejoraD);
                jugador.defensa+=MejoraDef*3;
                break;
            case 3:
                System.out.println("Escogiste " + MejoraS);
                jugador.sabiduria+=MejoraSab*3;
                break;
        }
    }
    
    public static void Batalla(int escenario){
        switch(escenario){
            case 0:
                LogicaBatalla(new Enemigos(enemigos.nombres(escenario),((int)1.25*jugador.defensa),
                ((int)0.75*jugador.fuerza),((int)1.75*jugador.sabiduria), jugador.xp));
                break;
            case 1:
                LogicaBatalla(new Enemigos(enemigos.nombres(escenario),((int)1*jugador.defensa),
                ((int)0.5*jugador.fuerza),((int)2.25*jugador.sabiduria), jugador.xp));
                break;
            case 2:
                LogicaBatalla(new Enemigos(enemigos.nombres(escenario),((int)1.75*jugador.defensa),
                ((int)1.25*jugador.fuerza),((int)0.5*jugador.sabiduria), jugador.xp));
                break;
            case 3:
                LogicaBatalla(new Enemigos(enemigos.nombres(escenario),((int)1*jugador.defensa),
                ((int)2*jugador.fuerza),((int)0.75*jugador.sabiduria), jugador.xp));
                break;
            case 4:
                LogicaBatalla(new Enemigos(enemigos.nombres(escenario),((int)1.25*jugador.defensa),
                ((int)1.5*jugador.fuerza),((int)1.25*jugador.sabiduria), jugador.xp));
                break;
            case 5:
                LogicaBatalla(new Enemigos(enemigos.nombres(escenario),((int)1*jugador.defensa),
                ((int)1.75*jugador.fuerza),((int)1.5*jugador.sabiduria), jugador.xp));
                break;
            case 6:
                LogicaBatalla(new Enemigos(enemigos.nombres(escenario),((int)0.75*jugador.defensa),
                ((int)2*jugador.fuerza),((int)1.25*jugador.sabiduria), jugador.xp));
                break;
            case 7:
                LogicaBatalla(new Enemigos(enemigos.nombres(escenario),((int)0.5*jugador.defensa),
                ((int)1.75*jugador.fuerza),((int)1.75*jugador.sabiduria), jugador.xp));
                break;
            case 8:
                LogicaBatalla(new Enemigos(enemigos.nombres(escenario),((int)0.75*jugador.defensa),
                ((int)1.25*jugador.fuerza),((int)2.25*jugador.sabiduria), jugador.xp));
                break;
            case 9:
                LogicaBatalla(new Enemigos(enemigos.nombres(escenario),((int)2*jugador.defensa),
                ((int)2*jugador.fuerza),((int)2*jugador.sabiduria), jugador.xp));
                break;
        }
        
    }

    private static void LogicaBatalla(Enemigos enemigos) {
        while(true){
            
            int datorecibido=0;
            int datorealizado=0;
            
            System.out.println("Un "+enemigos.nombre+" te ataca. Cuenta con "+
                    enemigos.hp+" puntos de vida");
            System.out.println("Escoge una accion");
            System.out.println("(1) Atacar");
            System.out.println("(2) Habilidad especial (cuesta vida)");
            int input=Leer("->",2);
            
            if(input == 1){
                
            	datorealizado = jugador.ataque()-enemigos.defensa();
                datorecibido = enemigos.ataque() - jugador.defensa();
                
                if(datorecibido < 0){
                	datorealizado -= datorecibido/2;
                    datorecibido = 0;
                }
                if(datorealizado < 0){
                	datorealizado = 0;
                }
                
                jugador.hp-=datorecibido;
                enemigos.hp-=datorealizado;
                
            }else{
                
            	datorealizado = jugador.habilidad()-enemigos.defensa();
                datorecibido = (enemigos.habilidad()+(int)jugador.sabiduria/5) - jugador.defensa();
                
                if(datorecibido< 0){
                	datorealizado -= datorecibido/2;
                    datorecibido = 0;
                }
                if(datorealizado < 0){
                	datorealizado = 0;
                }
                
                jugador.hp-=datorecibido;
                enemigos.hp-=datorealizado;
            }
            
            System.out.println("Has realizado "+datorealizado+" de danio");
            System.out.println("Has recibido "+datorecibido+" de danio");
            
            if(jugador.hp <= 0){
                MuerteJugador();
                break;
            }else if(enemigos.hp<=0){
                System.out.println("Has derrotado al enemigo");
                System.out.println("Tu historia continua");
                break;
            }
        }
    }

    private static void MuerteJugador() {
        System.out.println("Has obtenido "+jugador.xp+" de XP");
        System.out.println("Tu historia termino");
    }
}



