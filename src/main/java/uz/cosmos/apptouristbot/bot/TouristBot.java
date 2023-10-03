package uz.cosmos.apptouristbot.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.ChatMemberUpdated;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Objects;

@Component
public class TouristBot extends TelegramLongPollingBot {
    @Value("${bot.token}")
    private String botToken;

    @Value("${bot.username}")
    private String botUsername;

    @Override
    public String getBotUsername() {
        return this.botUsername;
    }

    @Override
    public String getBotToken() {
        return this.botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {
        try {
            if (update.hasMessage()) {

            } else if (update.hasCallbackQuery()) {

            } else if (update.hasMyChatMember()) {
                ChatMemberUpdated chatMember = update.getMyChatMember();
                if (Objects.equals(chatMember.getNewChatMember().getStatus(), "member")) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setChatId(String.valueOf(chatMember.getChat().getId()));
                    sendMessage.setText("Bot Added to group!\nBotAdded: " + chatMember.getFrom().getId() + " " + chatMember.getFrom().getFirstName() + " " + chatMember.getFrom().getLastName());
                    this.execute(sendMessage);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
