package com.example.comp3074assignment1.models;

public class Choice {
    //region ***properties***
    private int textId;
    private int actionId;
    //endregion

    //region ***getter & setter methods ***
    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }
    //endregion

    //region ***constructors***
    public Choice(int textId, int actionId) {
        this.textId = textId;
        this.actionId = actionId;
    }
    //endregion


}
