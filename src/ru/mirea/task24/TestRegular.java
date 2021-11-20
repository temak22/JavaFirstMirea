package ru.mirea.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegular {

    public static void main(String[] args) {

        String text = "oxxxy@yandex.ru lsp@yandex.ru bumblebeezy@yandex.ru ";
        Pattern pattern = Pattern.compile(".+?\\s", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Совпадения с шаблоном: ");
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}