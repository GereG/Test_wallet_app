package com.example.gereg.test_wallet;

/**
 * Created by GereG on 27. 1. 2015.
 */
public interface GameAppInterface {
    Integer getGameID();
    String getGameName();
    Integer getNumberOfPlayers();
    boolean isSinglePlayer();
    boolean isMultiPlayer();



}
