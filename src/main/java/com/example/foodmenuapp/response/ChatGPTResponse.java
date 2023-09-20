package com.example.foodmenuapp.response;

import java.util.List;

public record ChatGPTResponse(

        List<ChatGPTChoice> choices
) {
}
