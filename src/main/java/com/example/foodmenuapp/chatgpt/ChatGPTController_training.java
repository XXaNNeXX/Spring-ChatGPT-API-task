package com.example.foodmenuapp.chatgpt;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class ChatGPTController_training {

    private final ChatGPTService_training chatGPTServiceTraining;

    public ChatGPTController_training(ChatGPTService_training chatGPTServiceTraining) {
        this.chatGPTServiceTraining = chatGPTServiceTraining;
    }

    @PostMapping
    public String answerChatMessage(@RequestBody String question) {
        return chatGPTServiceTraining.askChatGPT(question);
    }
}
