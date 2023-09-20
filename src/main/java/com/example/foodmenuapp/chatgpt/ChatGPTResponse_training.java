package com.example.foodmenuapp.chatgpt;

import java.util.List;

public record ChatGPTResponse_training(

        List<ChatGPTResponseChoice_training> choices
) {
}
