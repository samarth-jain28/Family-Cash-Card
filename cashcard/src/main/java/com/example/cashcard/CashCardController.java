package com.example.cashcard;
import java.net.URI;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/cashcard")
class CashCardController {

    private final CashCardRepository cashCardRepository;
    private CashCardController(CashCardRepository cashCardRepository){
        this.cashCardRepository = cashCardRepository;
    }
    

    @GetMapping("/{requestedId}")
    private ResponseEntity<Optional<CashCard>> findById(@PathVariable Long requestedId) {
        Optional<CashCard> ccOptional = cashCardRepository.findById(requestedId);
        if (ccOptional.isPresent()) {
            return ResponseEntity.ok(ccOptional);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    private ResponseEntity<Void> createCashCard(@RequestBody CashCard cc, UriComponentsBuilder ucb){
        CashCard savedcc = cashCardRepository.save(cc);
        URI loc = ucb.path("cashcard/{id}").buildAndExpand(savedcc.id()).toUri();
        return ResponseEntity.created(loc).build();
    }

    @GetMapping("/about")
    private String about(){
        return "Hello World";
    }


}