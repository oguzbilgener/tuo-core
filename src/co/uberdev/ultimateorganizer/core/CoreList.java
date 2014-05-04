package co.uberdev.ultimateorganizer.core;

import com.google.gson.Gson;

import java.util.ArrayList;

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

	public String toString()
	{
		return asJsonString();
	}

	public static CoreList fromArrayList(ArrayList<Core> coreArrayList)
	{
		CoreList list = new CoreList();
		for(int i=0; i<coreArrayList.size(); i++)
		{
			list.set(i, coreArrayList.get(i));
		}
		return list;
	}
}
