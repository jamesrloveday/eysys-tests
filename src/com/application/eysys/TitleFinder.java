package com.application.eysys;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by james on 13/02/2017.
 */
public class TitleFinder {
    private List<String> stringList;

    public TitleFinder() {
        stringList = initList();
    }

    private List<String> initList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Architect");
        stringList.add("Software engineer");
        stringList.add("Quantity surveyor");
        stringList.add("Accountant");
        return stringList;
    }


    public String find(String s) {
        for(String string: stringList) {
            if(s.contains(string)) return string;
            String[] searchString = string.split(" ");
            if(searchString.length > 1) return string;
        }
        return "not found, try another search term";
    }
}
