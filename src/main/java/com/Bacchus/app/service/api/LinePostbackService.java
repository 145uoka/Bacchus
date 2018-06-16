package com.Bacchus.app.service.api;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.Bacchus.app.components.line.Event;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class LinePostbackService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void postback(Event event) {
        String data = event.getPostback().getData();
        logger.debug("[postback-data] :" + data);

        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> map = new LinkedHashMap<>();
        try {
            map = mapper.readValue(
                    data,
                    new TypeReference<LinkedHashMap<String,Object>>(){});

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        logger.debug("[json map] : " + map.toString());
    }
}
