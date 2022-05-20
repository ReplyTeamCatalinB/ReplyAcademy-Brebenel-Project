package eu.reply.academy.lesson30;

import java.util.Map;

public class Menu {


    Map<Item, String> menuList;

    public Menu(Map<Item, String> menuList) {
        this.menuList = menuList;
    }

    public Map<Item, String> getMenuList() {
        return menuList;
    }

    @Override
    public String toString() {
        if (menuList.entrySet().isEmpty()) {
            return "The shopping list is empty.";
        }
        String menuList = "";
        for (Map.Entry<Item, String> listEntry :
                this.menuList.entrySet()) {
            menuList += listEntry.getKey().getName()
                    + " " + listEntry.getValue()
                    + " " + listEntry.getKey().getValue().name().toLowerCase() + "\n";
        }
        return menuList;
    }
}
