package Controller;

import Pojo.Person;
import Service.GameService;

import java.util.ArrayList;

public class Controllerr {
    GameService gameService;

    public Person startGame(GameService gameService)
    {
        this.gameService= gameService;
        return gameService.startGame();
    }
}
