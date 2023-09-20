package com.example.foodmenuapp.chatgpt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class ChatGPTService_training {

    @Value("${app.openai-api-key}")
    private String chatGPTApiKey;

    @Value("${app.openai-api-organization}")
    private String chatGPTApiOrganization;

    public String askChatGPT(String question) {
        WebClient webClient = WebClient.create();

        ChatGPTRequest_training request_training = new ChatGPTRequest_training(
                "gpt-3.5-turbo",
                List.of(
                        new ChatGPTRequestMessage_training(
                                "user",
                                question
                        )
                )
        );

        ChatGPTResponse_training response_training = webClient.post()
                .uri("https://api.openai.com/v1/chat/completions")
                .header("Authorization", "Bearer " + chatGPTApiKey)
                .header("OpenAI-Organization", chatGPTApiOrganization)
                .bodyValue(request_training)
                .retrieve()
                .toEntity(ChatGPTResponse_training.class)
                .block()
                .getBody();

        return response_training.choices().get(0).message().content();
    }
}
