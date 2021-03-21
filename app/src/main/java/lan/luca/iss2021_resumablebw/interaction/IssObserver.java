package lan.luca.iss2021_resumablebw.interaction;

import org.json.JSONObject;

public interface IssObserver {
    void handleInfo(String info);

    void handleInfo(JSONObject info);
}
