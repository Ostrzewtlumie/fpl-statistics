package com.fpl.statistics.fpls.player;

import com.fpl.statistics.fpls.postion.Position;
import com.fpl.statistics.fpls.postion.PositionService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebInputException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private static final List<String> acceptableSortOptions = Arrays.asList("form", "value_form", "total_points", "points_per_game");

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

    public List<Player> getByPosition(String positionName, final String sortOption) {

        final Optional<Position> position = positionService.getPosition(positionName);
        if (position.isEmpty() || !acceptableSortOptions.contains(sortOption))
        {
           throw new ServerWebInputException(String.format("Not supported position : %s or sort option : %s provided.",
                   positionName,
                   sortOption));
        }
        return playerRepository.findAllByPosition(Integer.parseInt(position.get().getId()),
                Sort.by(Sort.Direction.DESC, "player." + sortOption));
    }
}
