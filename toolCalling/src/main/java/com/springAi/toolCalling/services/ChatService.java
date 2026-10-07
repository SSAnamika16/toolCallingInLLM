package com.springAi.toolCalling.services;


import com.springAi.toolCalling.tools.SimpleDateTimeTool;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.springAi.toolCalling.tools.WeatherTool;

@Service
public class ChatService {

    private ChatClient chatClient;

//    @Value("${app.weather.api-key}")
//    private String weatherApiKey;

    private WeatherTool weatherTool;

    public ChatService(ChatClient chatClient) {
        this.chatClient = chatClient;
        this.weatherTool = weatherTool;
    }

    //    chat method -> get response from the llm model
//    chatClient -> client for calling llm model
//    tool description -> chatbot for tool calling
    public String chat(String q) {

        return chatClient
                .prompt()
                .tools(new SimpleDateTimeTool(),weatherTool)
                .user(q)
                .call()
                .content();
    }


}
