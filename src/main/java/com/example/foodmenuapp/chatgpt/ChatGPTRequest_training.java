package com.example.foodmenuapp.chatgpt;

import java.util.List;

public record ChatGPTRequest_training(

        String model,
        List<ChatGPTRequestMessage_training> messages
) {
}
