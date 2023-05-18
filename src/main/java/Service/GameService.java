package Service;

import Dao.GameDao;
import Pojo.Board;
import Pojo.Dice;
import Pojo.Person;

import java.util.ArrayList;


public class GameService {
    GameDao gameDao;
    Board board;
    Dice dice;

    public GameService(int size, ArrayList<Person> arrayLis) {
        this.board = new Board(size);
        this.dice = new Dice();
        this.gameDao = new GameDao();
        gameDao.addPerson(arrayLis);
        gameDao.setSnakes();
        gameDao.setLadder();
    }

    public Person startGame() {
        Person won = null;
        while (true) {
            int number = this.dice.rollDice();
            Person person = gameDao.getperson();
            int total = person.getPosition() + number;
            if (board.getEnd() < total) {
                gameDao.addPerson(person);
                continue;
            } else if (board.getEnd() == total) {
                person.setPosition(total);
                person.setWon(true);
                won = person;
                break;
            } else if (gameDao.getLadders().containsKey(total)) {
                person.setPosition(gameDao.getLadders().get(total));
            } else if (gameDao.getSnakes().containsKey(total)) {
                person.setPosition(gameDao.getSnakes().get(total));
            }
            person.setPosition(total);
            System.out.println(person.getName() + " " + person.getPosition());
            gameDao.addPerson(person);
        }
        return won;
    }
}
