package pl.antygravity.microbrewery.services;

import pl.antygravity.microbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}