package com.Bacchus.app.service.api;

import java.io.IOException;

import org.dbflute.optional.OptionalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.Exception.RecordNotFoundException;
import com.Bacchus.app.components.line.Event;
import com.Bacchus.app.service.AbstractService;
import com.Bacchus.app.service.SystemPropertyService;
import com.Bacchus.dbflute.exbhv.UserTBhv;
import com.Bacchus.dbflute.exentity.UserT;
import com.Bacchus.linebot.LineBotClient;
import com.Bacchus.webbase.common.constants.SystemCodeConstants.Flag;
import com.Bacchus.webbase.common.constants.SystemPropertyKeyConstants;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
@Transactional(rollbackFor = Exception.class)
public class LineUnFollowHandleService extends AbstractService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserTBhv userTBhv;

    @Autowired
    SystemPropertyService systemPropertyService;

    public void handleUnFollow(Event event) throws RecordNotFoundException, JsonProcessingException, IOException {

        String token = systemPropertyService.getSystemPropertyValue(
                SystemPropertyKeyConstants.LineApi.MESSAGING_API_ACCESS_TOKEN);

        LineBotClient lineBotClient = new LineBotClient(token);

        deleteAccount(event, lineBotClient);

    }

    private void deleteAccount(Event event, LineBotClient lineBotClient) throws JsonProcessingException, IOException {

        OptionalEntity<UserT> optUserT = userTBhv.selectEntity(cb->{
           cb.query().setLineId_Equal(event.getSource().getUserId());
        });

        UserT userT = new UserT();

        if (optUserT.isPresent()) {
            userT = optUserT.get();
            userT.setDeleteFlag(Flag.ON.isBoolValue());
            userTBhv.update(userT);
        } else {
            return;
        }
    }
}
