package MultiTheding;
/*
 * Synchronize:- block(mutipile a thread at time not executed your choise)
 */
class car implements Runnable
{
    public void run()
    {
        try 
        {
            System.out.println(Thread.currentThread().getName()+" Has entered the parking lot"); //..............At a time multipule exuted
            Thread.sleep(2000);
            synchronized(this)     //...............................................................................Ata time only one
                        {
                            System.out.println(Thread.currentThread().getName()+" Got into car to drive");
                            Thread.sleep(2000);

                            System.out.println(Thread.currentThread().getName()+" Started to drive the car");
                            Thread.sleep(2000);

                            System.out.println(Thread.currentThread().getName()+" Came back and parked the car"); 
                         }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Some problem");
        }
    }
}
public class mul_10
{
    public static void main(String[] args) 
    {
        car c= new car();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");
        
        t1.start();
        t2.start();
        t3.start();


    }
}
