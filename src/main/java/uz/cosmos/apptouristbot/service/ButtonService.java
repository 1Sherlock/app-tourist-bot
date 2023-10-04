package uz.cosmos.apptouristbot.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

@Service
public class ButtonService {

    public InlineKeyboardButton generateButton(String textUz, String textRu, String callBackData, String language) {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(language.equals("ru") ? textRu : textUz);
        button.setCallbackData(callBackData + (language.equals("ru") ? "ru" : "uz"));
        return button;
    }

    public InlineKeyboardButton generateButtonWithUrl(String textUz, String textRu, String language, String url) {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(language.equals("ru") ? textRu : textUz);
        button.setUrl(url);
        return button;
    }

    public ReplyKeyboard sendNumber() {
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();

        KeyboardButton keyboardButton = new KeyboardButton("Telefon raqamni yuborish");
        keyboardButton.setRequestContact(true);
        row.add(keyboardButton);
        rows.add(row);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(rows);
        replyKeyboardMarkup.setResizeKeyboard(true);
        return replyKeyboardMarkup;
    }

    public ReplyKeyboard sendMenu() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        List<List<InlineKeyboardButton>> rows = new ArrayList<>();

        List<InlineKeyboardButton> row1 = new ArrayList<>();

//        row1.add(generateButton(category.getName(), category.getName(), "category#" + category.getId() + "#0#", "uz"));

        inlineKeyboardMarkup.setKeyboard(rows);
        return inlineKeyboardMarkup;
    }
}
