package neflis.model;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        Serie tomYJerry = new Serie("Tom & Jerry", "Animacion");

        Temporada tyjTemporada1 = new Temporada("Temporada 1", 1, 10, tomYJerry);

        Capitulo tyjCapitulo1 = new Capitulo(1,"La Persecucion", 30, tomYJerry);

        Capitulo tyjCapitulo2 = new Capitulo(2, "La Venganza", 20, tomYJerry);

        Capitulo tyjCapitulo3 = new Capitulo(3, "Viaje a La Luna", 40, tomYJerry);

        tomYJerry.agregarTemporadaASerie(tyjTemporada1);

        tyjTemporada1.agregarCapituloATemporada(tyjCapitulo1);
        tyjTemporada1.agregarCapituloATemporada(tyjCapitulo2);
        tyjTemporada1.agregarCapituloATemporada(tyjCapitulo3);


        user.setContenidosVistos(tyjCapitulo1);

        Actor tom = new Actor("Tom");
        Actor jerry = new Actor("Jerry");
        Actor neil = new Actor("Neil Armstrong");

        tomYJerry.agregarActor(tom);
        tomYJerry.agregarActor(jerry);

        tyjCapitulo3.agregarActorInvitado(neil);

        System.out.println("Tom y Jerry dura " + tomYJerry.cuantoDura());


        Pelicula losAristogatos = new Pelicula("Los Aristogatos", 120, "Documental");


        User gaia = new User();


        System.out.println("gaia vio completo aristo? " + gaia.vioCompleto(losAristogatos));
        System.out.println("gaia vio completo TyJ? " + gaia.vioCompleto(tomYJerry));

        System.out.println("actua jerry? " + tomYJerry.actua(jerry));








    }
}