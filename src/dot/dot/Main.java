package dot.dot;

import org.telegram.telegrambots.TelegramApiException;
import org.telegram.telegrambots.TelegramBotsApi;

public class Main {
	public static void main(String[] args) {
	    TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
	    try {
	        telegramBotsApi.registerBot(new NewClass());
	    } catch (TelegramApiException e) {
            e.printStackTrace();
	        
	    }
	}
}
