package com.pkj.wow.multitheme.util;

import com.pkj.wow.multitheme.R;
import com.pkj.wow.multitheme.view.preview.PreviewThemeColor;

import java.util.ArrayList;

/**
 * Created by Pankaj on 12-11-2017.
 */

public class ThemeFactory {
    public static final int THEME_RED = 0;
    public static final int THEME_PINK = 1;
    public static final int THEME_PURPLE = 2;
    public static final int THEME_DEEPPURPLE = 3;
    public static final int THEME_INDIGO = 4;
    public static final int THEME_BLUE = 5;
    public static final int THEME_LIGHTBLUE = 6;
    public static final int THEME_CYAN = 7;
    public static final int THEME_TEAL = 8;
    public static final int THEME_GREEN = 9;
    public static final int THEME_LIGHTGREEN = 10;
    public static final int THEME_LIME = 11;
    public static final int THEME_YELLOW = 12;
    public static final int THEME_AMBER = 13;
    public static final int THEME_ORANGE = 14;
    public static final int THEME_DEEPORANGE = 15;
    public static final int THEME_BROWN = 16;
    public static final int THEME_GRAY = 17;
    public static final int THEME_BLUEGRAY = 18;

    public static int getThemeId(int theme) {
        int themeId = 0;
        switch (theme) {
            case THEME_RED:
                themeId = R.style.AppTheme_Theme1_Red;
                break;
            case THEME_PINK:
                themeId = R.style.AppTheme_Theme2_Pink;
                break;
            case THEME_YELLOW:
                themeId = R.style.AppTheme_Theme3_Yellow_Ext;
                break;
            case THEME_BLUEGRAY:
                themeId = R.style.AppTheme_Theme4_Gray;
                break;
            default:
                break;
        }
        return themeId;
    }

    public static ArrayList<PreviewThemeColor> getThemeList() {
        ArrayList<PreviewThemeColor> themeArrayList = new ArrayList<>();
        themeArrayList.add(new PreviewThemeColor(0, R.color.primaryColorRed, R.color.primaryDarkColorRed, R.color.secondaryColorRed));
        themeArrayList.add(new PreviewThemeColor(1, R.color.primaryColorPink, R.color.primaryDarkColorPink, R.color.secondaryColorPink));
        themeArrayList.add(new PreviewThemeColor(12, R.color.primaryColorYellow, R.color.primaryDarkColorYellow, R.color.secondaryColorYellow));
        themeArrayList.add(new PreviewThemeColor(18, R.color.primaryColorBlueGray, R.color.primaryDarkColorBlueGray, R.color.secondaryColorBlueGray));
        return themeArrayList;
    }
}
