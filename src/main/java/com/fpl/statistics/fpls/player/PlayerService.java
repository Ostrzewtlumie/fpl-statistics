package com.fpl.statistics.fpls.player;

import com.fpl.statistics.fpls.postion.Position;
import com.fpl.statistics.fpls.postion.PositionService;
import org.springframework.stereotype.Service;
import org.springframework.web.server.NotAcceptableStatusException;
import org.springframework.web.server.ServerWebInputException;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    private final PositionService positionService;

    public PlayerService(PlayerRepository playerRepository, PositionService positionService) {
        this.playerRepository = playerRepository;
        this.positionService = positionService;
    }

    public List<Player> getAvailablePlayers()
    {
        return playerRepository.findAllAvailable();
    }

    public List<Player> getUnavailablePlayers()
    {
        return playerRepository.findAllUnavailable();
    }

    public List<Player> getByPosition(String positionName) {

        final Optional<Position> position = positionService.getPosition(positionName);
        if (position.isEmpty())
        {
           throw new ServerWebInputException("Not supported position provided.");
        }
        return playerRepository.findAllByPosition(Integer.parseInt(position.get().getId()));
    }
}
