package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

//Класс оаиывающий структуру акционного клиента, потомок Actor


public class ActcionClient extends Actor implements iActorBehaviour, iReturnOrder {

    private String nameActhion; //имя Акции
    private int idActhionClient;//ID участника
    public static int countClient=6;// Коллличество участников

    public ActcionClient(String name, String nameActhion, int idActhionClient) {
        super(name);
        this.nameActhion = nameActhion;
        this.idActhionClient = idActhionClient;

    }


    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name=name;
    }

    @Override
    public boolean isTakeOrder() {
         return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    @Override
    public Actor geActor() {
        return this;
    }
}
