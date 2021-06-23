import java.util.*;

import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class historiaDeRol {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String aventurero;
        String enemigo = "Dragón";
        int khanHelado = 100;
        int rayoDeHielo = 8;
        int tirarPiedra = 1;
        int volar;
        int alientoFuego = 40;
        int coletazo = 15;
        int pisoton = 20;

        System.out.println("Escribe tu nombre aventurero!");
        aventurero = teclado.next();

        System.out.println("Bienvenido! " + aventurero + ". \nEstas dispuesto a enfrentarte con el mitico dragon? \n1: Si (Soy un guerrero de nacimiento!) \n2: No (soy una rata cobarde)");
        int decision = teclado.nextInt();

        if (decision == 1) {
            System.out.println("Por supuesto, eres un guerrero de alma. \nContinuemos! Que clase de luchador te gustaria ser? \nVikingo(1) \nMago(2) (El mago está en desarrollo...elegí vikingo!");

            int personaje = teclado.nextInt();

            if (personaje == 1) {
                System.out.print("Excelente eleccion! Eres pura fuerza!");
                System.out.println(" COMENCEMOS!");
                System.out.println("");
                System.out.print("Era un dia como cualquier otro. Estabas en tu granja dandole de comer \na los animales cuando de pronto el cielo se oscurecio... \nUn gran dragon oculto en el cielo tras una neblina, aparecio y \ncon una voz desesperanzadora dijo: ");
                System.out.println("Eh derrotado a todos los guerreros del reino... \nme han dicho que tu eres el último. Eh venido por tu cabeza.");
                System.out.println("Sin pensarlo demasiado, tomas tu hacha y te paras desafiando a la bestia!");
                System.out.println("");
                System.out.println("Que acción decides realizar? \nCortar garganta(1) \nTirar hacha boomerang(2) \nEsperar a que el dragon ataque primero...(3)");

                int movimiento = teclado.nextInt();

                if (movimiento == 1) {
                    int ataque = (int) (Math.random() * 10);
                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras tu acción será efectivo.");

                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();
                        if (elegir < ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == ataque && i != 2) {
                            System.out.println("Acertaste! Saltas tan alto que sorprendes al dragon y éste queda inmovil! \nCon un movimiento veloz de tu hacha logras cortar la garganta de la bestia \nla cual retrocede ante tu poder!");
                            break;
                        } else if (elegir != ataque && i == 2) {
                            System.out.println("No adivinaste =(. Saltas tan alto que sorprendes al dragon y éste queda inmovil! \nCon un movimiento veloz de tu hacha intentas cortar la garganta de la bestia \npero te sorprendes al ver que su piel es tan dura como el diamante!");
                            break;
                        }
                    }

                } else if (movimiento == 2) {

                    int ataque = (int) (Math.random() * 10);
                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras tu acción será efectivo.");

                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();

                        if (elegir < ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == ataque && i != 2) {
                            System.out.println("Comienzas a girar en el lugar con tal velocidad que generas un tifon! \ntal presión de aire deja inmovil a la bestia. \nSueltas tu hacha la cual sale disparada e impacta al dragon \ntirandolo al suelo y la misma vuelve a tu mano.");
                            break;
                        } else if (elegir != ataque && i == 2) {
                            System.out.println("Comienzas a girar en el lugar con tal velocidad que generas in tifon! \ntal presión de aire deja inmovil a la bestia. \nSueltas tu hacha la cual sale disparada pero el dragón \nla esquiva con facilidad. Tendrás que pensar bien tu proximo movimiento.");
                            break;
                        }
                    }


                } else if (movimiento == 3) {
                    System.out.println("El dragon arremete con un coletazo...");
                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras evitarás el ataque de la bestia.");

                    int defensa = (int) (Math.random() * 10);
                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();
                        if (elegir < defensa && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > defensa && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == defensa) {
                            System.out.println("Tus rápidos reflejos permiten moverte y esquivar tremendo golpe!");
                            break;
                        } else if (elegir != defensa && i == 2) {
                            System.out.println("Confiado en tu fuerza intentas bloquear el ataque con solo tus manos... \nIluso! dijo el dragón mientras volabas luego de que la cola del mismo \ndiera de lleno contra tu cuerpo. Intentas levantarte, \ntoses y ves que escupes sangre... algo dentro tuyo debio romperse.");
                            break;
                        }
                    }
                }
                System.out.println("");
                System.out.println("El dragón se prepara para atacarte! Echándose hacia atrás su pecho se vuelve de un color rojo intenso! \ny puedes ver como brotan llamas desde su boca, \nte das cuenta que si no reaccionas rápido morirás con su próximo ataque!");
                System.out.println("");
                System.out.println("Que planeas hacer? \nCorrer a refugiarte en unos escombros cercanos(1) \nCorres hacia la bestia y atacas su corazón!(2) \nTe quedas quieto y esperas tu muerte...(3)");

                int decisionFinal = teclado.nextInt();

                if (decisionFinal == 1) {
                    int correr = (int) (Math.random() * 10);
                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras tu acción será efectivo.");

                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();

                        if (elegir < correr && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > correr && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == correr && i != 2) {
                            System.out.println("Acertaste! La adrenalina te invade y corres tan rápido que llegas a tiempo \npara cubrirte en los escombros... \n El dragon dispara una llamarada tan intensa que derrite todo..TODO!\nNo quedan rastros de los escombros ni de ti... moriste tan rápido que no hubo dolor. FIN");
                            break;
                        } else if (elegir != correr && i == 2) {
                            System.out.println("Fallaste! La adrenalina te invade y corres tan rápido que llegas a tiempo \npara cubrirte en los escombros... \n El dragon dispara una llamarada tan intensa que derrite todo..TODO!\nNo quedan rastros de los escombros ni de ti... moriste tan rápido que no hubo dolor. FIN");
                            break;
                        }

                    }
                } else if (decisionFinal == 2) {
                    int ataque = (int) (Math.random() * 10);
                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras tu acción será efectivo.");

                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();

                        if (elegir < ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == ataque && i != 2) {
                            System.out.println("Acertaste! Esperas el momento justo y cuando el dragon esta dispuesto a disparar,\naprovechas un espacio entre sus escamas y entierras tu hacha.\nObservas como el dragon se desvanece, la lucha ha terminado! FIN");
                            break;
                        } else if (elegir != ataque && i == 2) {
                            System.out.println("Fallaste! Corres a enterrar tu hacha en el pecho del dragon, el cual\nadvierte tu movimiento y dispara su llamarada,\nmueres carbonizado en un tremendo dolor, has fracasado!");
                            break;
                        }
                    }

                } else if (decisionFinal == 3) {
                    int rendirse = (int) (Math.random() * 10);

                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras tu acción será efectivo.");

                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();

                        if (elegir < rendirse && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > rendirse && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == rendirse && i != 2) {
                            System.out.println("Acertaste! Te quedas parado, sabiendo que nada puedes hacer frente a la bestia,\nésta dispara su mas grande llamarada. No sientes nada, \nsolo te desintegras en un instante, has muerto! FIN.");
                            break;
                        } else if (elegir != rendirse && i == 2) {
                            System.out.println("Fallaste! Te quedas parado, sabiendo que nada puedes hacer frente a la bestia, \npero tu nunca te has rendido y no lo harás ahora\naprovechas un espacio entre sus escamas y entierras tu hacha en su corazón.\nObservas como el dragon se desvanece, has vencido, la lucha ha terminado! FIN");
                            break;
                        }
                    }

                }


            } else if (personaje == 2) {
                System.out.println("Estupendo, un aventurero que maneja las artes oscuras");

                System.out.println(" COMENCEMOS!");
                System.out.println("");
                System.out.print("Era un dia como cualquier otro. Estabas en tu granja dandole de comer \na los animales cuando de pronto el cielo se oscurecio... \nUn gran dragon oculto en el cielo tras una neblina, aparecio y \ncon una voz desesperanzadora dijo:");
                System.out.println("Eh derrotado a todos los guerreros del reino... me han dicho que tu eres el último. Eh venido por tu cabeza.");
                System.out.print("Sin pensarlo demasiado golpeas tu baston contra el suelo \nel cual se transforma en un báculo mágico.");
                System.out.println("");
                System.out.println("Que acción decides realizar? \nInvocar al rayo!(1) \nInvocar bola de fuego!(2) \nInvocar escudo protector Khaaaan!...(3)");

                int movimiento = teclado.nextInt();

                if (movimiento == 1) {
                    int ataque = (int) (Math.random() * 10);
                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras tu acción será efectivo.");

                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();
                        if (elegir < ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == ataque && i != 2) {
                            System.out.println("Acertaste! Apuntando tu báculo hacia la bestia y \ngritando tu hechizo invocas al Rayo! \nel cual golpea con fuerza al animal y este retrocede ante tu poder!");
                            break;
                        } else if (elegir != ataque && i == 2) {
                            System.out.println("No adivinaste =(. Apuntando tu báculo hacia la bestia y \ngritando tu hechizo invocas al Rayo! \nel cual golpea con al animal y este no recibe daño alguno \ntendrás que pensar en otra estrategia si quieres \nsalir vivo de esta!!");
                            break;
                        }
                    }

                } else if (movimiento == 2) {

                    int ataque = (int) (Math.random() * 10);
                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras tu acción será efectiva.");

                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();

                        if (elegir < ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == ataque && i != 2) {
                            System.out.println("Acertaste! Apuntando tu báculo hacia la bestia y \ngritando tu hechizo invocas cientos de bolas de fuego! \nEstas golpean con fuerza al animal y ....nada, ni un rasguño! \nEsperabas dañarlo con fuego? Es un dragón! Ellos nacen en el fuego...que iluso!");
                            break;
                        } else if (elegir != ataque && i == 2) {
                            System.out.println("Fallaste! Apuntando tu báculo hacia la bestia y \ngritando tu hechizo invocas cientos de bolas de fuego! \nEstas golpean con fuerza al animal y ....nada, ni un rasguño! \nEsperabas dañarlo con fuego? Es un dragón! Ellos nacen en el fuego...que iluso!");
                            break;
                        }
                    }


                } else if (movimiento == 3) {
                    System.out.println("El dragon arremete con un coletazo...");
                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras evitarás el ataque de la bestia.");

                    int defensa = (int) (Math.random() * 10);
                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();
                        if (elegir < defensa && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > defensa && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == defensa) {
                            System.out.println("Acertaste! Gritas KHAAANNNN, creando un escudo invisible. \nLa cola de la bestia te impacta de lleno, pero la misma \n se desintegra al mismo tiempo que tu escudo! \nQuedas agotado...no podrias volver a usar esa técnica.");
                            break;
                        } else if (elegir != defensa && i == 2) {
                            System.out.println("No adivinaste =(. Gritas KHAAAANNN, confiando en tu fuerza e intentas bloquear el ataque con tu magia... \nIluso! dijo el dragón mientras volabas luego de que la cola del mismo \ndiera de lleno contra tu cuerpo. Intentas levantarte, \ntoses y ves que escupes sangre... algo dentro tuyo debio romperse.");
                            break;
                        }
                    }
                }
                System.out.println("");
                System.out.println("El dragón se prepara para atacarte! Echándose hacia atrás su pecho se vuelve de un color rojo intenso! \ny puedes ver como brotan llamas desde su boca, \nte das cuenta que si no reaccionas rápido morirás con su próximo ataque!");
                System.out.println("");
                System.out.println("Que planeas hacer? \nCorrer a refugiarte en unos escombros cercanos(1) \nCorres hacia la bestia y atacas su corazón!(2) \nTe quedas quieto y esperas tu muerte...(3)");

                int decisionFinal = teclado.nextInt();

                if (decisionFinal == 1) {
                    int correr = (int) (Math.random() * 10);
                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras tu acción será efectivo.");

                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();

                        if (elegir < correr && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > correr && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == correr && i != 2) {
                            System.out.println("Acertaste! La adrenalina te invade y gritas KHAAAANNNN, \nya lo usaste y ahora no funciona, lo olvidaste??? \ncorres tan rápido que llegas a tiempo \npara cubrirte en unos escombros... \n El dragón dispara una llamarada tan intensa que derrite todo..TODO!\nNo quedan rastros de los escombros ni de ti... moriste tan rápido que no hubo dolor. FIN");
                            break;
                        } else if (elegir != correr && i == 2) {
                            System.out.println("Fallaste! La miedo te invade, y en un \nintento desesperado gritas: RAYO DE HIELOOOOOO!\n y de tu baculo sale a toda velocidad un rayo de hielo que \nimpacta de lleno contra el pecho del animal, parando su coracon por completo!\nLa bestia cae fulminada... has vencido! FIN ");
                            break;
                        }

                    }
                } else if (decisionFinal == 2) {
                    int ataque = (int) (Math.random() * 10);
                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras tu acción será efectiva.");

                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();

                        if (elegir < ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > ataque && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == ataque && i != 2) {
                            System.out.println("Acertaste! Esperas el momento justo y cuando el dragon esta dispuesto a disparar,\naprovechas un espacio entre sus escamas e intentas \ndisparar hielo hacia su corazon.\nLogras golpearlo con fuerza, pero no la suficiente\nla bestia dispara su llamarada infernal reduciendo todo a cenizas! HAS MUERTO!");
                            break;
                        } else if (elegir != ataque && i == 2) {
                            System.out.println("Fallaste! Corres a enterrar tu báculo en el pecho del dragón, el cual\nadvierte tu movimiento y dispara su llamarada,\nla cual contrarrestas con tu rayo de hielo!\n durante un largo tiempo sostienes tu poder para no ceder ante\nsemejante llamarada. Recuerdas a tus seres queridos los cuales\nte dan mas fuerza. Sacas todo tu poder y vences! \nEl dragon ahora esta atrapado para siempre en un \ngran glaciar creado por tu magia infinita!");
                            break;
                        }
                    }

                } else if (decisionFinal == 3) {
                    int rendirse = (int) (Math.random() * 10);

                    System.out.println("Tiras el dado mágico y tienes 3 chances de adivinar su número (Número del 1 al 10) \nsi lo logras tu acción será efectivo.");

                    int elegir = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Que número salió?");
                        elegir = teclado.nextInt();

                        if (elegir < rendirse && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas alto!");
                        } else if (elegir > rendirse && i != 2) {
                            System.out.println("Estas equivocado, intentá con un número mas bajo!");
                        } else if (elegir == rendirse && i != 2) {
                            System.out.println("Acertaste! Te quedas parado, sabiendo que nada puedes hacer frente a la bestia,\nésta dispara su mas grande llamarada. No sientes nada, \nsolo te desintegras en un instante, has muerto! FIN.");
                            break;
                        } else if (elegir != rendirse && i == 2) {
                            System.out.println("Fallaste! Te quedas parado, sabiendo que nada puedes hacer frente a la bestia, \npero tu nunca te has rendido y no lo harás ahora\naprovechas un espacio entre sus escamas y te teletransportas justo\n al lado de la bestia, entierras tu báculo en su corazón y provocas\nla mas grande descarga electrica jamas vista en el reino mágico.\nObservas como el dragon se desvanece, has vencido, la lucha ha terminado! FIN");
                            break;
                        }
                    }

                }


            }


        } else
            System.out.println("Me lo suponia, esta historia no es para alguien como tu :(");


    }
}
