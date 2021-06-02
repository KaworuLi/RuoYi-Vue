package com.stdiet.web.controller.custom;

import com.alibaba.fastjson.JSONObject;
import com.stdiet.common.core.controller.BaseController;
import com.stdiet.custom.utils.WsUtils;
import com.stdiet.web.server.WebSocketServer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@EnableScheduling
@RequestMapping("/ws/api")
public class WebSocketController extends BaseController {

    @ResponseBody
    @RequestMapping("/push/{cid}")
    public Map pushToWeb(@PathVariable String cid, String message) {
        if (message == null) {
            message = "我是消息44";
        }
        Map result = new HashMap();
        try {
            WebSocketServer.sendInfo(message, cid);
            result.put("code", 200);
            result.put("msg", "success");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;

    }

    @Scheduled(fixedRate = 30000)
    public void boardCast() {
        try {
            JSONObject heartBeat = new JSONObject();
            heartBeat.put("type", WsUtils.WS_TYPE_HEART_BEAT);
            heartBeat.put("msg", "ping");

            WebSocketServer.sendInfo(heartBeat.toJSONString(), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
