package Interfaces;

import java.util.List;

import Classes.Actor;
//Интерфейс поведения в магазине.

public interface iMarcketBehaviour {
    public void acceptToMarket(iActorBehaviour actor);//Вход в маркет
    public void releseFromMarket(List<Actor> actors);//Выход с маркета
    public void update();// Метод переключения состояний.
}
