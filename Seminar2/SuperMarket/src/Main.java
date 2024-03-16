//Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
//        1) Добавить класс, описывающий акционного клиента. Включить поле название акции, id клиента и количество участников в акции(поле статическое)
//        2) Добавить интерфейс iReturnOrder возврата товара. Продумать какие методы могут понадобиться и подключить интерфейс к классам клиентов.
//        3) Добавить комментарии(javadoc) ко всем методам и интерфейсам.
//
//        (задача со *)
//        1) Реализовать отказ в обслуживании для акционного клиента при превышении участников акции
//        2) Сохранить в файл лог работы магазина, включая возвраты товара(реализовать возврат нескольких товаров)
//
//        Формат сдачи: ссылка на гитхаб проект



import Classes.*;
import Interfaces.iActorBehaviour;

public class Main {
    public static void main(String[] args) {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Andrei");
        iActorBehaviour client2 = new OrdinaryClient("Kolia");
        iActorBehaviour client3 = new SpecialClient("Olaf", 1);
        iActorBehaviour client4 = new TaxInspector();
        iActorBehaviour client5 = new ActcionClient("Petr", "Скидка 20%", 8);
        iActorBehaviour client6 = new ActcionClient("Nikolay", "Скидка 20%", 9);



        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);


        magnit.update();

    }
}