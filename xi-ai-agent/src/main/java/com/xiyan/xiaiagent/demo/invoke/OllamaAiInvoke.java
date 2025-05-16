package com.xiyan.xiaiagent.demo.invoke;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.messages.AssistantMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.boot.CommandLineRunner;

/**
 * Spring AI 框架调用 AI 大模型（Ollama）
 */
// 取消注释后，项目启动时会执行，因此要先注释，这样项目启动的时候不会执行
//@Component
public class OllamaAiInvoke implements CommandLineRunner {

    @Resource
    private ChatModel ollamaChatModel;

    @Override
    public void run(String... args) throws Exception {
        AssistantMessage assistantMessage = ollamaChatModel.call(new Prompt("你好，我是兮颜"))
                .getResult()
                .getOutput();
        System.out.println(assistantMessage.getText());
    }
}