package Absraction;
//parent class 
abstract class Aeroplane
{
   abstract void takeoff(); //Such methode have  methode signater will be theair  body will not be there // implemetation hide to user // unwatntend data are hide

    abstract void fly();
    // {   all are modfy so remove
    //     System.out.println("Aeroplane is  a fly");
    // }


    public void landing()
    {
        System.out.println("it is not 100% abstraction");
        System.out.println("it is inheritandend");
    }
}
//child class
class Cargoplane extends Aeroplane
{
     void takeoff()
    {
        System.out.println("Cargoplane  is take off ");
    }

    void fly()
    {
        System.out.println("Cargoplane  is  a fly");
    } 
}

class Passangerplane extends Aeroplane
{
    void takeoff()
    {
        System.out.println("Passangerplane  is take off ");
    }

    void fly()
    {
        System.out.println("Passangerplane  is  a fly");
    }
}


public class abstarction_1 
{
    public static void main(String[] args) 
    {
        Aeroplane cp =new Cargoplane(); //you creat abstract type refrence
        cp.takeoff();
        cp.fly();
        cp.landing();

        Aeroplane pp =new Passangerplane();
        pp.takeoff();
        pp.fly();

        // Aeroplane ref = new Aeroplane()  you cant creat object bcz declare the abstact
            
        

            
    }
}
