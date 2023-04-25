package br.com.labmedicine.labmedical.models;

import java.util.List;

public record ErrorResponse(
        String message,
        int code,
        String status,
        String objectName,
        List<ErrorObject> errors) {

}
