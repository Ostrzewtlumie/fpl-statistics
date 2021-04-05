package com.fpl.statistics.fpls.postion;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PositionService {

    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public Optional<Position> getPosition(String positionName) {
        return positionRepository.getByPluralName(positionName);
    }
}
