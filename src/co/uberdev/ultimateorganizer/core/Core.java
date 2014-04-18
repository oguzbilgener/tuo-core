package co.uberdev.ultimateorganizer.core;

import com.google.gson.Gson;

/**
 * Created by oguzbilgener on 01/03/14.
 */
public class Core
{ // lol
	public String asJsonString()
	{
		return new Gson().toJson(this);
	}

	public static <T> T fromJson(String json, Class<T> type)
	{
		return new Gson().fromJson(json, type);
	}

    public String toString()
    {
        return asJsonString();
    }
}