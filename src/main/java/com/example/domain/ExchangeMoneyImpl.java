package com.example.domain;

import com.example.domain.model.ExchangeRate;
import com.example.domain.service.IExchangeMoney;
import com.example.domain.service.IScriptingEngine;
import com.example.domain.util.ScriptFileMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

@Service
public class ExchangeMoneyImpl implements IExchangeMoney {

    @Autowired
    private IScriptingEngine iScriptingEngine;

    @Override
    public Double calculateTotalFee(ExchangeRate exchangeRate) {

        ScriptEngine engine = iScriptingEngine.runJavaScriptFile(ScriptFileMap.getFile(ExchangeRate.class.getName()));
        Invocable invocable = (Invocable) engine;
        Object result = null;
        try {
            result = invocable.invokeFunction("fee", exchangeRate.getFeeAmount(), exchangeRate.getFeeCurrency(), exchangeRate.getType().name());
        } catch (ScriptException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return (Double) result;
    }
}
