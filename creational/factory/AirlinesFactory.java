package motivity.creational.factory;

public class AirlinesFactory
{
    public Airlines getAirlines(String airlines)
    {
        if(airlines.equalsIgnoreCase("airindia"))
        {
            return new AirIndia();
        } else if (airlines.equalsIgnoreCase("luftansa")) {
            return new Luftansa();
        } else if (airlines.equalsIgnoreCase("indigo")) {
            return new Indigo();
        }
        else {
            return new Invalid();
        }
    }
}
