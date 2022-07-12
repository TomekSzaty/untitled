package com.tomek;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import static java.time.LocalDateTime.*;

public class Main {

    public static void main(String[] args) {

        Clock clock1 = new Clock("Zegar1", now());
        Clock clock2 = new Clock("Zegar2", now());
        Clock clock3 = new Clock("Zegar3", now());
        Clock clock4 = new Clock("Zegar4", now());
        Clock clock5 = new Clock("Zegar5", now());

//        System.out.println(clock1);
//        System.out.println(clock1.time.getMinute());
//        System.out.println(clock1.time.minusMinutes(5));
//        System.out.println(clock1.time.plusMinutes(2));
//        System.out.println(clock1);

        LinkedList<Clock> clocks = new LinkedList<>();
        clocks.add(clock1);
        clocks.add(clock2);
        clocks.add(clock3);
        clocks.add(clock4);
        clocks.add(clock5);

        for (int i = 0; i < clocks.size(); i++) {
            System.out.println(clocks.get(i).getName() + " - " +
                    clocks.get(i).getTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        }

        System.out.println("************************");

        for (int i = 0; i < clocks.size(); i++) {

            //clocks.get(i).setTime(LocalDateTime.now().plusMinutes(5));
            System.out.println(clocks.get(i).getName() + " - " +
                    clocks.get(i).getTime().plusMinutes(3).format(DateTimeFormatter.ofPattern("HH:mm:ss")));

            //System.out.println(clocks.get(i));
        }

    }
}
