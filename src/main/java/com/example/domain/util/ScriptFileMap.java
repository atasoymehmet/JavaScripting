package com.example.domain.util;

import com.example.domain.model.ExchangeRate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ScriptFileMap {

    private static final Map<String, String> fileMap;

    public static String getFile(String className) {
        return fileMap.get(className);
    }

    static {
        Map<String, String> map = new HashMap<>();
        map.put(ExchangeRate.class.getName(), "exchangeMoneyVipFee.js");
        fileMap = Collections.unmodifiableMap(map);
    }

}
