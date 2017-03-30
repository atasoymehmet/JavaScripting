package com.example.domain;

import com.example.domain.service.IScriptingEngine;
import org.springframework.stereotype.Service;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static com.example.domain.constants.ScriptingConstants.DEFAULT_SCRIPTING_ENGINE;

@Service
public class ScriptingEngineImpl implements IScriptingEngine {

    @Override
    public ScriptEngine runJavaScriptFile(String fileName) {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName(DEFAULT_SCRIPTING_ENGINE);
        try {
            engine.eval(prepareScriptFile(fileName));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return engine;
    }

    private String prepareScriptFile(String fileName){
        return "load('res/" + fileName + "')";
    }
}
