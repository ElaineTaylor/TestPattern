package com.elaine.testpattern.prototype;

import java.util.Hashtable;

/**
 * 颜色缓存
 * author: elaine
 * date: 2021/4/30
 */
public class ColorCache {

    private static Hashtable<Integer, Color> colorHashtable = new Hashtable<>();

    public static Color getColor(int id) {
        Color color = colorHashtable.get(id);
        return (Color) color.clone();
    }

    public static void loadCache() {
        RedColor redColor = new RedColor();
        redColor.setId(1);
        colorHashtable.put(redColor.getId(), redColor);

        GreenColor greenColor = new GreenColor();
        greenColor.setId(2);
        colorHashtable.put(greenColor.getId(), greenColor);

        WhiteColor whiteColor = new WhiteColor();
        whiteColor.setId(3);
        colorHashtable.put(whiteColor.getId(), whiteColor);
    }
}
