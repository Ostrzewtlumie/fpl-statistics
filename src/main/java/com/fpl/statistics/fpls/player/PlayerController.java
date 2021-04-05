package com.fpl.statistics.fpls.player;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/available")
    @ResponseBody
    public List<Player> getAvailablePlayers()
    {
        return playerService.getAvailablePlayers();
    }

    @GetMapping("/unavailable")
    @ResponseBody
    public List<Player> getUnavailablePlayers()
    {
        return playerService.getUnavailablePlayers();
    }

    @GetMapping("/{position}")
    @ResponseBody
    public List<Player> getPlayersByPosition(@PathVariable final String position,
                                             @RequestParam final String sort)
    {
        return playerService.getByPosition(position, sort);
    }
}
