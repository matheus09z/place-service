package br.com.matheus.placeservice.web;


import br.com.matheus.placeservice.api.PlaceRequest;
import br.com.matheus.placeservice.api.PlaceResponse;
import br.com.matheus.placeservice.domain.Place;
import br.com.matheus.placeservice.domain.PlaceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/places")
public class PlaceController {

    @Autowired
    PlaceService placeService;


  @PostMapping
    public ResponseEntity<Mono<PlaceResponse>> create(@Valid @RequestBody PlaceRequest request) {
      var placeResponse = placeService.create(request).map(PlaceMapper::fromPlaceToResponse);
      return ResponseEntity.status(HttpStatus.CREATED).body(placeResponse);
  }

}
