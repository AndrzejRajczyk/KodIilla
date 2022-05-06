package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlihgtCalculator {
     static List<Flight> flightList = new ArrayList<>();


     public static List<Flight> flightFrom(String departureAirport) {
          return flightList.stream()
                  .filter(o -> o.getDepartureAirport().equals(departureAirport))
                  .collect(Collectors.toList());

     }

     public static List<Flight> flightTo(String arrivalAirport) {
          return flightList.stream()
                  .filter(o -> o.getArrivalAirport().equals(arrivalAirport))
                  .collect(Collectors.toList());
     }

     public static List<Flight> flightFind(String departureAirport, String middleAirport, String arrivalAirport) {
    return Stream.concat(
        flightFrom(departureAirport).stream()
                          .filter(o -> o.getArrivalAirport().equals(middleAirport)),


       flightTo(arrivalAirport).stream()
                  .filter(o -> o.getArrivalAirport().equals(arrivalAirport)&& o.getDepartureAirport().equals(middleAirport)))
                  .collect(Collectors.toList());



     }


public static void main (String[] args){
     FlihgtCalculator flihgtCalculator = new FlihgtCalculator();
     flightList.add(new Flight("Warszawa", "Berlin", 101));
     flightList.add(new Flight("Warszawa", "Madrid", 102));
     flightList.add(new Flight("Warszawa", "Paris", 103));
     flightList.add(new Flight("Warszawa", "Madrid", 104));
     flightList.add(new Flight("Warszawa", "Berlin", 105));
     flightList.add(new Flight("Warszawa", "New York", 106));
     flightList.add(new Flight("Gdansk", "London", 107));
     flightList.add(new Flight("Gdansk", "Wroclaw", 108));
     flightList.add(new Flight("Gdansk", "Paris", 109));
     flightList.add(new Flight("Gdansk", "Los Angeles", 110));
     flightList.add(new Flight("Paris", "London", 111));
     flightList.add(new Flight("London", "Radom", 112));
     flightList.add(new Flight("London", "Sydney", 113));
     flightList.add(new Flight("London", "Los Angeles", 114));
     flightList.add(new Flight("Sydney", "Tokyo", 115));
     flightList.add(new Flight("New York", "Tokyo", 116));
     flightList.add(new Flight("London", "Los Angeles", 117));
     flightList.add(new Flight("London", "Liverpool", 118));
     flightList.add(new Flight("Paris", "Kraków", 119));
     flightList.add(new Flight("Madryt", "Sydney", 120));
     flightList.add(new Flight("Modlin", "Gdansk", 121));
     flightList.add(new Flight("London", "Balice", 122));


     List<Flight> result1 = flihgtCalculator.flightFrom("Warszawa");
     List<Flight> result2 =flihgtCalculator.flightTo("Paris");
     List<Flight> result3 = flihgtCalculator.flightFind("Warszawa", "Paris", "London");
     System.out.println("Wyloty z: " + result1);
     System.out.println("Przyloty do : " + result2);
     System.out.println("Lot z przesiadką :" + result3);



}
}