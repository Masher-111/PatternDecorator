/*
implementation of the pattern decorator
 */
public class Main {
    public static void main(String[] args)
    {
         Component component = new ConcreteDecorator(new ConcreteComponent());
         component.operation();
    }
}
/*
interface
 */
interface Component {
    void operation();
}
/*
class ConcreteComponent implements the interface Component
 */
class ConcreteComponent implements Component
{
    public void operation(){};
}
/*
intermediate class (abstract)stores a reference
 to the component interface and constructor
 */
abstract class Decorator implements Component
{
   Component component;
    public Decorator(Component component){this.component = component;}

}
/*
the class ConcreteDecorator extends the functionality of the class ConcreteComponent
 */
class ConcreteDecorator extends Decorator
{

    public ConcreteDecorator(Component component){super(component);}
    public void operation()
    {

        component.operation();
    }

}
