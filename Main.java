
/**
 * 
 */
public class Main
{
    // Attribute

    // Methoden
    public static void main(String[] args)
    {

        Aufgabe aufgabe  = new Aufgabe();

        Thread auto1 = new Thread(aufgabe);
        Thread auto2 = new Thread(aufgabe);
        auto1.setName("Auto1");
        auto2.setName("Auto2");
        auto1.start();
        auto2.start();
    }

}
