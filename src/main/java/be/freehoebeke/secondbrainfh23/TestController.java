package be.freehoebeke.secondbrainfh23;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "hello world!";
    }


}
