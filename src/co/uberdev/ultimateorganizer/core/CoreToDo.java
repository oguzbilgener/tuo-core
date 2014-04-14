package co.uberdev.ultimateorganizer.core;

import java.util.ArrayList;

/**
 * Created by oguzbilgener on 14/04/14.
 */
public class CoreToDo extends CoreAttachment
{
    protected ArrayList<CoreToDoItem> items;

    public ArrayList<CoreToDoItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CoreToDoItem> items) {
        this.items = items;
    }
}
