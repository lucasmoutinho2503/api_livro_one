package com.example.api_literalura.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}

