package org.example;

public class CarFactory {
    public String name;
    private boolean finished;
    private boolean empty;

    private static CarFactory INSTANCE;

    private CarFactory(String name) {
        this.name = name;
        empty = true;
        finished = false;
    }


    public static CarFactory getInstance(String name) {
    //    CarFactory result = INSTANCE;

        if (INSTANCE == null) {
            INSTANCE = new CarFactory(name);
        }
        return INSTANCE;
    }

    public void getOrder() {
        if (isEmpty())
            empty = false;
    }

    public void work() {
        if(!isEmpty() && !isFinished())
        {
            finished=true;
            empty=true;

        }
    }

    public boolean isFinished() {
        return finished;
    }

    public boolean isEmpty() {
        return empty;
    }
}
