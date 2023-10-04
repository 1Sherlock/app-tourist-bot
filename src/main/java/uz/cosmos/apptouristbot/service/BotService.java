package uz.cosmos.apptouristbot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.cosmos.apptouristbot.bot.TouristBot;

@Service
public class BotService {
    @Autowired
    TouristBot touristBot;

    @Autowired
    ButtonService buttonService;


}
