package it.pkg;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kd40173 on 20/06/14.
 */
@XmlRootElement
public class Greeting {

    private String language;

    private String message;

    public String getLanaguage() {
        return language;
    }

    public void setLanguage(String lanaguage) {
        this.language = lanaguage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Greeting{" +
            "language:'" + language + '\'' +
            ", message:'" + message + '\'' +
            '}';
    }
}
