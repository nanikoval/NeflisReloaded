public class Main {

    public static void main(String[] args) {




        Serie tomYJerry = new Serie("Tom & Jerry", "Animacion");

        Temporada tyjTemporada1 = new Temporada("Temporada 1", 1, 10, tomYJerry);

        Capitulo tyjCapitulo1 = new Capitulo(1,"La Persecucion", 30, tomYJerry);

        Capitulo tyjCapitulo2 = new Capitulo(2, "La Venganza", 20, tomYJerry);

        Capitulo tyjCapitulo3 = new Capitulo(3, "Viaje a La Luna", 40, tomYJerry);

        tomYJerry.agregarTemporadaASerie(tyjTemporada1);

        tyjTemporada1.agregarCapituloATemporada(tyjCapitulo1);
        tyjTemporada1.agregarCapituloATemporada(tyjCapitulo2);
        tyjTemporada1.agregarCapituloATemporada(tyjCapitulo3);

        Actor tom = new Actor("Tom");
        Actor jerry = new Actor("Jerry");
        Actor neil = new Actor("Neil Armstrong");

        tomYJerry.agregarActor(tom);
        tomYJerry.agregarActor(jerry);

        tyjCapitulo3.agregarActorInvitado(neil);

        System.out.println("Tom y Jerry dura " + tomYJerry.cuantoDura());


        Pelicula losAristogatos = new Pelicula("Los Aristogatos", 120, "Documental");


        User gaia = new User();

        gaia.play(tyjCapitulo1);
        gaia.play(tyjCapitulo2);
        gaia.play(losAristogatos);

        System.out.println("gaia vio completo aristo? " + gaia.vioCompleto(losAristogatos));
        System.out.println("gaia vio completo TyJ? " + gaia.vioCompleto(tomYJerry));

        System.out.println("actua jerry? " + tomYJerry.actua(jerry));

        System.out.println("min vistos de documental " + gaia.minutosVistosDe("Documental"));

        System.out.println("Gaia es fan de tom? " + gaia.esFanDe(tom));







    }
}