package co.uberdev.ultimateorganizer.core;

import java.util.ArrayList;
import com.google.gson.Gson;

/**
 * Created by oguzbilgener on 02/03/14.
 */

public class CoreList extends ArrayList<Core>
{
	public String asJsonString()
	{
		return new Gson().toJson(this);
	}

	public static <T> T fromJson(String json, Class<T> type)
	{
		return new Gson().fromJson(json, type);
	}
}
