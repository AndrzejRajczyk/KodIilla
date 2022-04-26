package com.kodilla.exception.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class FindFilght {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportsList = new HashMap<String, Boolean>();
        airportsList.put("Warsaw", TRUE);
        airportsList.put("London", TRUE);
        airportsList.put("Berlin", TRUE);
        airportsList.put("New York", TRUE);
        airportsList.put("Moscow", FALSE);


        if(airportsList.containsKey(flight.getDepartureAirport())==TRUE  && airportsList.containsValue(flight.getArrivalAirport())==FALSE){
            System.out.println("Found Flight from: "+ flight.getDepartureAirport() +
                    "to: " + flight.getArrivalAirport());
        }
        else{
            throw new RouteNotFoundException("Sorry flight not found");
        }
    }

    public static void main (String[] args){
        Flight flight =new Flight("Warsaw", "New York");
        FindFilght findF = new FindFilght();

        try{
          findF.findFlight(flight);
    }
        catch(RouteNotFoundException e){

             System.out.println("Flight not found");
        }
        finally {
            System.out.println("Thank for beeing with us");
        }
    }
}
