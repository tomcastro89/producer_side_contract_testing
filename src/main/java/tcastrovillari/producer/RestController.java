package tcastrovillari.producer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/endpoint")
    public ResponseEntity endpoint(){
        return ResponseEntity.ok().build();
    }
}
