package com.fpl.statistics.fpls.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/available")
    public List<Player> getAvailablePlayers()
    {
        return playerService.getAvailablePlayers();
    }

    @GetMapping("/unavailable")
    public List<Player> getUnavailablePlayers()
    {
        return playerService.getUnavailablePlayers();
    }

    @GetMapping("/{position}")
    public List<Player> getPlayersByPosition(@PathVariable final String position)
    {
        return playerService.getByPosition(position);
    }
}
