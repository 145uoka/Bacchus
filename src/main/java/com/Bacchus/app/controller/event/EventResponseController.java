package com.Bacchus.app.controller.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bacchus.app.service.CommonService;
import com.Bacchus.app.service.LineService;
import com.Bacchus.app.service.LoggerService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.app.service.event.EventService;
import com.Bacchus.app.service.user.UserService;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exbhv.UserTypeMBhv;
import com.Bacchus.webbase.appbase.BaseController;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

/**
 * イベントレスポンスコントローラー。
 *
 */
@LineMessageHandler
@Controller
public class EventResponseController extends BaseController {

    /** ロガーロジック */
    @Autowired
    LoggerService loggerService;

    @Autowired
    SystemPropertyService systemPropertyService;

    @Autowired
    UserService userService;

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    UserTypeMBhv userTypeMBhv;

    @Autowired
    CommonService commonService;

    @Autowired
    LineService lineService;

    @Autowired
    EventService eventService;

    /**
     * //テキストが送られてきた際の応答
     * @param event
     * @return
     * @throws Exception
     */
    @EventMapping
    @RequestMapping(value = "/line/callback", method = {RequestMethod.GET, RequestMethod.POST})
    public TextMessage handleTextMessageEvent(MessageEvent<TextMessageContent> event) throws Exception {
    	String text = event.getMessage().getText();
//        TextMessageContent message = event.getMessage();
//        return new TextMessage("メッセージか送られました");//
        switch (text) {
      case "はい":
    	  //登録処理

          return new TextMessage("参加ありがとうございます");

      case "いいえ":
    	  //何もしない

      	return new TextMessage("次回は参加お願いします");

      default:
    	  return new TextMessage("次回は参加お願いします");
  }
    }
}
