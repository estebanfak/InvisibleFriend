package com.prueba.AmigoInvisible.service;

import com.prueba.AmigoInvisible.dto.PlayerDto;
import com.prueba.AmigoInvisible.entity.Player;
import java.util.List;

public interface PlayerService {
    List<PlayerDto> getAllPlayers();
    PlayerDto getPlayerByName(String name);
    PlayerDto addPlayer(Player player);
    String deletePlayer(String name);
    void generateInvisibleFriend();
    void revert();
    PlayerDto modifyEmail(long id, String email);
    void resendEmail(long id);
}