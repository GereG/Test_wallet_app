package com.example.gereg.test_wallet;

/**
 * Created by GereG on 27. 1. 2015.
 */
public class GameApp implements GameAppInterface {
    Integer gameID;
    String gameName;
    Integer NumberOfPlayers;
    boolean IsSinglePlayer;
    boolean IsMultiPlayer;


    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setNumberOfPlayers(Integer numberOfPlayers) {
        NumberOfPlayers = numberOfPlayers;
    }

    public void setSinglePlayer(boolean isSinglePlayer) {
        IsSinglePlayer = isSinglePlayer;
    }

    public void setMultiPlayer(boolean isMultiPlayer) {
        IsMultiPlayer = isMultiPlayer;
    }

    @Override
    public Integer getNumberOfPlayers() {
        return NumberOfPlayers;
    }

    @Override
    public Integer getGameID() {
        return gameID;
    }

    @Override
    public String getGameName() {
        return gameName;
    }

    public boolean isSinglePlayer() {
        return IsSinglePlayer;
    }

    public boolean isMultiPlayer() {
        return IsMultiPlayer;
    }
}
