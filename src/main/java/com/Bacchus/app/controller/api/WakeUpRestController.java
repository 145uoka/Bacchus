package com.Bacchus.app.controller.api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.dbflute.cbean.result.ListResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bacchus.dbflute.exbhv.SystemPropertyMBhv;
import com.Bacchus.dbflute.exentity.SystemPropertyM;

/**
 * 呼び覚ましのコントローラー．
 *
 */
@RestController
public class WakeUpRestController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /** システムプロパティ_M Bhv */
    @Autowired
    SystemPropertyMBhv systemPropertyMBhv;

    @RequestMapping(value = "/api/wakeup", method = RequestMethod.GET)
    @ResponseBody
    public String wakeup() {

        logger.info("[CALL] : WakeUP!!");

        ListResultBean<SystemPropertyM> systemPropertyMList =  systemPropertyMBhv.selectList(cbLambda->{
            cbLambda.query().setPropGroup_Equal("WAKEUP");
        });

        for (SystemPropertyM systemPropertyM : systemPropertyMList) {
            try {
                URL url = new URL(systemPropertyM.getPropValue());

                HttpURLConnection connection = null;

                try {
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");

                    logger.info("[WakeUP] : " + systemPropertyM.getPropValue() +
                            "[" + connection.getResponseCode() + "]");
                } finally {
                    if (connection != null) {
                        connection.disconnect();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "success";
    }
}
