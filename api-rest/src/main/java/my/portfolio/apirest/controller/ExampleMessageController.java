package my.portfolio.apirest.controller;

import my.portfolio.apirest.model.ExampleMessage;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExampleMessageController {
    @GetMapping("/message")
    ExampleMessage send() {
        return new ExampleMessage("This is the Example Message");
    }

    @PostMapping("/message")
    ExampleMessage receive(@RequestBody ExampleMessage message) {
        return new ExampleMessage("The message [" + message.content +"] was received correctly.");
    }

}
