package com.springAi.toolCalling.services;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private ChatClient chatClient;

    public ChatService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    //    chat method -> get response from the llm model
//    chatClient -> client for calling llm model
//    tool description -> chatbot for tool calling
    public String chat(String q) {

        return chatClient
                .prompt()
                .user(q)
                .call()
                .content();
    }


}
