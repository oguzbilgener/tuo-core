package co.uberdev.ultimateorganizer.core;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

/**
 * Created by oguzbilgener on 16/04/14.
 */
public class CoreJSON extends HashMap<String, Object>
{
    private ObjectMapper mapper;
    public CoreJSON()
    {
        mapper = new ObjectMapper();
    }

    public String getAsJsonString()
    {
        return mapper.writeValueAsString(this);
    }

    public JsonNode getAsJsonNode()
    {
        return mapper.valueToTree(this);
    }
}
