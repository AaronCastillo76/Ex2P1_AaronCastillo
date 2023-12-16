//fila 3, silla 3
package ex2p1_aaroncastillo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Ex2P1_AaronCastillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("*****MENU*****");
        System.out.println("1. Kingdom Hearts Re-Re:Coded!");
        System.out.println("Ingrese su opcion:");
        int opcion = leer.nextInt();
        while (opcion > 0 && opcion < 2) {
            switch (opcion) {
                case 1:
                    ArrayList<Personaje> Party = new ArrayList<>();
                    Personaje Sora = new Personaje("Sora", 300, 300, 75, 15);
                    Personaje Donald = new Personaje("Donald", 150, 450, 45, 10);
                    Personaje Goofy = new Personaje("Goofy", 450, 100, 150, 50);
                    Personaje Mickey = new Personaje("Mickey", 100, 500, 150, 35);
                    Personaje Roxas = new Personaje("Roxas", 300, 300, 15, 75);
                    Personaje Kairi = new Personaje("Kairi", 200, 200, 50, 15);
                    Items Pocion = new Items("Pocion", 50, 0);
                    Items Ether = new Items("Ether", 0, 50);
                    Items Elixir = new Items("Elixir", 100, 100);
                    ArrayList<Personaje> Reserva = new ArrayList<>();
                    ArrayList<Items> Item = new ArrayList<>();
                    Party.add(Sora);
                    Party.add(Donald);
                    Party.add(Goofy);
                    Reserva.add(Mickey);
                    Reserva.add(Roxas);
                    Reserva.add(Kairi);
                    Item.add(Pocion);
                    Item.add(Ether);
                    Item.add(Elixir);
                    int cuarto = 0;
                    char resp = 's';
                    while (cuarto <= 20 && (resp == 's' || resp == 'S')) {
                        int num = random.nextInt(5) + 1;
                        switch (num) {
                            case 1:
                                int enemigos= random.nextInt(3) + 1;
                                int heartless=enemigos*75;
                                int ataque=25;
                                System.out.println("Te has encontrado a "+enemigos+" Heartless!");
                                System.out.println();
                                for (int i = 0; i < Party.size(); i++) {
                                    System.out.println(i+".- "+Party.get(i).toString());
                                    System.out.println("");
                                }
                                System.out.println("Elije el personaje:");
                                int elegir=leer.nextInt();
                                Party.get(elegir);
                                System.out.println("****Menu****");
                                System.out.println("1.- Attack");
                                System.out.println("2.- Magic");
                                System.out.println("3.- Items");
                                System.out.println("4.- Party");
                                int menu= leer.nextInt();
                                if (menu==1){
                                    System.out.println(Party.get(elegir).getNombre()+" ataco!");
                                    System.out.println(Party.get(elegir).getNombre()+" recibio el golpe!");
                                    heartless=heartless-Party.get(elegir).getAttackPoints();
                                    System.out.println("Los heartless les queda: "+heartless);
                                }
                                
                                break;
                            case 2:
                                System.out.println("Te has encontrado un cofre que contiene una Pocion!");
                                Item.add(Pocion);
                                break;
                            case 3:
                                System.out.println("Te has encontrado un cofre que contiene un Ether!");
                                Item.add(Ether);
                                break;
                            case 4:
                                System.out.println("Te has encontrado un cofre que contiene un Elixir!");
                                Item.add(Elixir);
                                break;
                            case 5:
                                System.out.println("Te has econtrado a amigos que ocupan de tu ayuda y decides darles 1 Items!");
                                System.out.println("Quedan:");
                                Item.remove(0);
                                for (int i = 0; i < Item.size(); i++) {
                                    System.out.println(Item.get(i).toString());
                                }
                                break;
                        }
                        cuarto++;
                        System.out.println("Deseas continuar?");
                        resp = leer.next().charAt(0);
                    }

                    break;
            }
            System.out.println("*****MENU*****");
            System.out.println("1. Kingdom Hearts Re-Re:Coded!");
            System.out.println("Ingrese su opcion:");
            opcion = leer.nextInt();
        }

    }

}
