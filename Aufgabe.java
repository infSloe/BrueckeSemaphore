import java.util.concurrent.Semaphore;
/**
 * Die Klasse Aufgabe
 */
public class Aufgabe implements Runnable
{
    // Attribute
    private Semaphore bruecke;

    // Konstruktor
    public Aufgabe()
    {
        bruecke = new Semaphore(1);
    }

    // Methoden
    public void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " steht vor der Bruecke");
        System.out.println(name + " möchte über die Bruecke fahren");
        try{
            bruecke.acquire();
        }catch(Exception ex){}
        
        System.out.println(name + " fährt über die Brücke, juhu!");
        try{
            Thread.sleep(2000); // Es ist eine lange Brücke!
        }
        catch(Exception ex){}

        System.out.println(name + " hat es endlich geschafft!");
        bruecke.release();

    }
}

