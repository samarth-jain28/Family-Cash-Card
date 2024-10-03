package com.example.cashcard;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/about")
    private String about(){
        return "Hello World";
    }

}