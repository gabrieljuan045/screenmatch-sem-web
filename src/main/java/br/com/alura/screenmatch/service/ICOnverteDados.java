package br.com.alura.screenmatch.service;

public interface ICOnverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
