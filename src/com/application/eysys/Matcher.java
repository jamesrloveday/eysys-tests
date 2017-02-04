package com.application.eysys;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by james on 03/02/2017.
 */
public class Matcher {

    private List<String> matcherList;

    public Matcher() {
        matcherList = setUpList();
    }

    public List<String> setUpList() {
        String[] matches = new String[]{"Architect", "Software engineer", "Quantity surveyor", "Accountant"};
        return Arrays.asList(matches);
    }

    public String matchToArgument(String input) {
        String[] split = input.split(" ");
        String toUse = null;
        if(split.length > 1) {
            toUse = split[1];
        } else {
            toUse = split[0];
        }
            for(String s: matcherList) {
                if(s.contains(toUse)) {
                    return s;
                }
            }
        return null;
    }

    public Map<String, String> matchToArgumentList(List<String> input) {
        Map<String, String> matcherMap = new HashMap<>();
        for(String s: input) {
            String out = matchToArgument(s);
            matcherMap.put(s, out);
        }
        return matcherMap;
    }
}
