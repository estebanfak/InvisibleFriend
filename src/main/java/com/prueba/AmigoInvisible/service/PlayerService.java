package com.prueba.AmigoInvisible.service;

import com.prueba.AmigoInvisible.entity.Player;
import java.util.List;

public interface PlayerService {
    List<Player> getAllPlayers();
    Player getPlayerByName(String name);
    Player addPlayer(Player player);
    String deletePlayer(String name);
    void generateInvisibleFriend();
    void revert();
}