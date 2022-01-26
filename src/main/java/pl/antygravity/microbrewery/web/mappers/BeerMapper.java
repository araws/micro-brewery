package pl.antygravity.microbrewery.web.mappers;

import org.mapstruct.Mapper;
import pl.antygravity.microbrewery.domain.Beer;
import pl.antygravity.microbrewery.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
