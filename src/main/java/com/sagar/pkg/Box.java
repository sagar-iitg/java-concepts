package pkg;
//Object won't provide type saftey

public class Box<T>{


    //object class is topmost parent class of all java classes.

   T container;
    public Box(T container)
    {
        this.container=container;

    }

    public Object getContainer() {
        return this.container;
    }
}
