package Seminar_2_Tast_2;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {
    List <Actor> actors = new LinkedList<>();
    Queue<Actor> actorsQueue = new ArrayDeque<>();
    @Override
    public void takeInQueue(Actor actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + " забрал заказ");
    }

    @Override
    public void giveOrders() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " сделал заказ");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " покинул очередь");
        actorsQueue.poll();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(actors);
        System.out.println(actor.getName() + " покинул магазин");
    }

    @Override
    public void update() {

    }
}
