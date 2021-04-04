package com.fpl.statistics.fpls.player;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAvailablePlayers()
    {
        return playerRepository.findAllAvailable();
    }
}
