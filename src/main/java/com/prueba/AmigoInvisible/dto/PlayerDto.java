package com.prueba.AmigoInvisible.dto;

import com.prueba.AmigoInvisible.entity.Player;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PlayerDto {
    private long id;
    private String name;
    private String email;
    private boolean hasFriendToGift;
    private boolean isSelected;

    public PlayerDto(Player player){
        this.id = player.getId();
        this.name = player.getName();
        this.email = player.getEmail();
        this.hasFriendToGift = player.getFriendToGift()!=null;
        this.isSelected = player.isSelected();
    }
}
