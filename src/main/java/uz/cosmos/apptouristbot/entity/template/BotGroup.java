package uz.cosmos.apptouristbot.entity.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.cosmos.apptouristbot.entity.TelegramChat;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bot_group")
public class BotGroup extends AbsEntity {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TelegramChat chat;

    private String groupId;

    private Boolean active;
}
