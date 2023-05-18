package Testing;

import Controller.Controllerr;
import Dao.GameDao;
import Pojo.Person;
import Service.GameService;

import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        Person person=new Person("premkumar");
        Person person1=new Person("Vaishnavi");
        Person person2=new Person("Bhanu");
        GameService gameService=new GameService(100, new ArrayList<>( Arrays.asList(person,person1,person2)));
        Controllerr controllerr=new Controllerr();
        System.out.println( controllerr.startGame(gameService).toString());
    }
}
