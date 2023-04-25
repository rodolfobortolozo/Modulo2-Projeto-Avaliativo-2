package br.com.labmedicine.labmedical.models;

public record ErrorObject(
        String field,
        String message,
        Object parameter) {

}
