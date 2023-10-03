package uz.cosmos.apptouristbot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.cosmos.apptouristbot.entity.enums.TelegramChatStatus;
import uz.cosmos.apptouristbot.entity.template.AbsEntity;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "telegram_chats")
public class TelegramChat extends AbsEntity {
    private Long chatId;

    private String language;

    private TelegramChatStatus status;
}
