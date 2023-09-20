package com.example.foodmenuapp.request;

import java.util.List;

public record ChatGPTRequest(

        String model,
        List<ChatGPTMessage> messages
) {
}
