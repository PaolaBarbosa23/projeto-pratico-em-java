package CursoDio;

import CursoDio.Singleton.SingletonEager;
import CursoDio.Singleton.SingletonHolder;
import CursoDio.Singleton.SingletonLazy;
import CursoDio.Strategy.*;
import CursoDio.facade.Facade;

public class Teste {
    public static void main(String[] args){
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonHolder holder = SingletonHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonHolder.getInstancia();
        System.out.println(holder);

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Paola", "14800000");
    }
}
