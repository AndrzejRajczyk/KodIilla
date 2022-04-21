package com.kodilla.exception.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindFilght {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportsList = new HashMap<String, Boolean>();
        airportsList.put("Warsaw", true);
        airportsList.put("London", true);
        airportsList.put("Berlin", true);
        airportsList.put("New York", true);
        airportsList.put("Moscow", false);

        if(airportsList.containsKey(flight.getDepartureAirport())==true  && airportsList.containsValue(flight.getArrivalAirport())==true){
            System.out.println("Found Flight from: "+ flight.getDepartureAirport() +
                    "to: " + flight.getArrivalAirport());
        }
        else{
            throw new RouteNotFoundException("Sorry flight not found");
        }
    }

    public static void main (String[] args){
        Flight flight =new Flight("Moscow", "New York");
        FindFilght findF = new FindFilght();

        try{
          findF.findFlight(flight);
    }
        catch(RouteNotFoundException e){
        System.out.println("This flihgt cannot be choose");
        }
        finally {
            System.out.println("Thank for beeing with us");
        }
    }
}
