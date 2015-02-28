package com.shehabic.droppy;

import android.view.View;

/**
 * Created by shehabic on 2/28/15.
 */
public abstract class DroppyMenuItemAbstract implements DroppyMenuItemInterface
{
    final protected static int TYPE_MENU_ITEM = 0;
    final protected static int TYPE_CUSTOM = 1;
    final protected static int TYPE_MENU_SEPARATOR = 2;

    protected String title;
    protected int icon = -1;
    protected int type = TYPE_MENU_ITEM;
    protected View renderedView;
    protected int customViewResourceId = -1;
    protected int id;
    protected boolean isClickable = true;

    @Override
    public int getType() {
        return type;
    }

    @Override
    public DroppyMenuItemInterface setId(int id) {
        this.id = id;

        return this;
    }

    @Override
    public DroppyMenuItemInterface setClickable(boolean isClickable) {
        this.isClickable = isClickable;

        return this;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isClickable() {
        return isClickable;
    }
}