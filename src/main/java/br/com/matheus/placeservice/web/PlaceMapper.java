package br.com.matheus.placeservice.web;

import br.com.matheus.placeservice.api.PlaceResponse;
import br.com.matheus.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(place.name(), place.slug(), place.state()
                , place.createdAt(), place.updatedAt());
    }
}
