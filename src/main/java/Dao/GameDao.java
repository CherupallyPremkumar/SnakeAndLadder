package Dao;

import Pojo.Person;

import java.util.*;

public class GameDao {
    Deque<Person> people=new ArrayDeque<>();
    Map<Integer,Integer> snakes=new HashMap<>();
    Map<Integer,Integer> ladders=new HashMap<>();

    public void addPerson(ArrayList<Person> person)
    {
      people.addAll(person);

    }
    public void addPerson(Person person)
    {
        people.add(person);

    }
    public Person getperson()
    {
        return people.poll();
    }

    public void setSnakes() {
        snakes.put(30,12);
        snakes.put(97,77);
        snakes.put(55,45);
        snakes.put(12,3);
        snakes.put(77,30);
    }

    public void setLadder() {

        ladders.put(11,30);
        ladders.put(73,97);
        ladders.put(46,55);
        ladders.put(5,12);
        ladders.put(33,77);
    }

    public Map<Integer, Integer> getSnakes() {
        return snakes;
    }

    public Map<Integer, Integer> getLadders() {
        return ladders;
    }

    public Deque<Person> getPeople() {
        return people;
    }
}
