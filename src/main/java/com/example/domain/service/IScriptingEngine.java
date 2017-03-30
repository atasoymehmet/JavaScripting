package com.example.domain.service;

import javax.script.ScriptEngine;

public interface IScriptingEngine {
    ScriptEngine runJavaScriptFile(String fileName);
}
