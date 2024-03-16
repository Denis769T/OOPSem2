package Interfaces;
import Classes.Actor;
// Интерфейс поведения в очереди клиета
public interface iQueueBehaviour {

    public void takeInQueue(iActorBehaviour actor);//Клиент приходит в очередь
    public void releaseFromQueue();// Клиент уходит с очереди
    public void takeOrder ();//Клиент делает заказ
    public void giveOrder ();// Клиент забирает заказ

}
