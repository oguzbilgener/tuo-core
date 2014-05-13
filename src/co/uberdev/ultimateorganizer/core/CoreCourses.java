package co.uberdev.ultimateorganizer.core;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by oguzbilgener on 14/04/14.
 */
public class CoreCourses extends ArrayList<CoreCourse>
{
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
