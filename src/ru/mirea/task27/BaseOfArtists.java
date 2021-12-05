package ru.mirea.task27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BaseOfArtists {

    public static void main(String[] args) {
        HashMap<Integer, String> artistsHashMap = new HashMap<>();

        artistsHashMap.put(1, "Oxxxymiron");
        artistsHashMap.put(2, "Хаски");
        artistsHashMap.put(3, "LSP");
        System.out.println("Список:");
        System.out.println(artistsHashMap);

        artistsHashMap.put(3, "Pyrokinesis"); //повторный ключ
        System.out.println();
        System.out.println("Обновленный список:");
        System.out.println(artistsHashMap);

        String artist3Name = artistsHashMap.get(3);
        System.out.println();
        System.out.println("3 в списке:");
        System.out.println(artist3Name);

        artistsHashMap.remove(3);
        System.out.println();
        System.out.println("Обновленный список:");
        System.out.println(artistsHashMap);

        Set<Integer> keys = artistsHashMap.keySet();
        System.out.println();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(artistsHashMap.values());
        System.out.println();
        System.out.println("Значения: " + values);

        System.out.println();
        for (Map.Entry entry: artistsHashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}