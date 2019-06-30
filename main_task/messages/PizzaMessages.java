package com.epam.main_task.messages;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;

public class PizzaMessages {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        map();
    }

    public static String getMessage(String messageKey) {
        String message = hashMap.get(messageKey);
        return message != null ? message : "[" + messageKey + "]";
    }

    private static void map() {
        Properties prop = new Properties();
        InputStream input = null;
        try {

            input = PizzaMessages.class.getClassLoader().getResourceAsStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        for (String key : prop.stringPropertyNames()) {
            String value = prop.getProperty(key);
            hashMap.put(key, value);
        }
    }
}
