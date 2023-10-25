package br.com.matheus.placeservice.config;


import br.com.matheus.placeservice.api.PlaceRequest;
import br.com.matheus.placeservice.api.PlaceResponse;
import br.com.matheus.placeservice.domain.PlaceRepository;
import br.com.matheus.placeservice.domain.PlaceService;
import br.com.matheus.placeservice.web.PlaceMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;

@Configuration
@EnableR2dbcAuditing
public class PlaceConfig {
    @Bean
    PlaceService placeService(PlaceRepository placeRepository) {
        return new PlaceService(placeRepository);
    }
}
