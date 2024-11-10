package main.java.by.rublevskaya.model.util;

public interface Constants {
    String HEX_COLOR = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$"; //взяла от сюда: https://stackoverflow.com/questions/1636350/how-to-identify-a-given-string-is-hex-color-format
    String URL = "^(https?://.+)$"; //"вырвала" нужный мне кусок от сюда: https://uibakery.io/regex-library/url
}
