package com.example.localdata;
import com.Models.Aya_Model;
import com.Models.Dua_model;
import com.Models.Surah_model;
import com.example.qfk.R;

import java.util.ArrayList;
import java.util.Arrays;

public class alldata_surah {
    public static final ArrayList<Aya_Model> surahnas=new ArrayList<>(Arrays.asList(
            new Aya_Model("(1)أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحَـٰبِ ٱلْفِيل","کیا تم نے نہیں دیکھا کہ تمہارے پروردگار نے ہاتھی والوں کے ساتھ کیا کیا","Have you not seen ˹O Prophet˺ how your Lord dealt with the Army of the Elephant?"),new Aya_Model("arbi","urdu","english")));
    public static final ArrayList<Aya_Model> surahfalaq=new ArrayList<>(Arrays.asList(
            new Aya_Model("arbi2","urdu","english"),new Aya_Model("arbi2","urdu","english")));

    public static final ArrayList<Surah_model> surah_models=
            new ArrayList<>(Arrays.asList(
                    new Surah_model("Surah An-Nas","1","سُوْرَۃُ النَّاس",
                            "سُوْرَۃُ النَّاس "
                            ,"(1)   قُلۡ اَعُوۡذُ بِرَبِّ النَّاسِۙ",
                            "Say: I seek refuge in the Lord of mankind,",
                            "کہو کہ میں لوگوں کے پروردگار کی پناہ مانگتا ہوں",surahnas),
                    new Surah_model("Surah An-Nas","2","سُوْرَۃُ النَّاس","سوتے وقت ", "اَللّٰھُمَّ بِاسْمِکَ  اَمُوْتُ وَاَحْیَا",
                            "O Allah (Almighty) I live and die in your name.",
                            "الٰہی عزوجل میں تیرے نام پر مرتا ہوں اور جیتا ہوں۔",surahfalaq),
                    new Surah_model("Surah An-Nas","3","سُوْرَۃُ النَّاس","سوتے وقت ", "اَللّٰھُمَّ بِاسْمِکَ  اَمُوْتُ وَاَحْیَا",
                            "O Allah (Almighty) I live and die in your name.",
                            "الٰہی عزوجل میں تیرے نام پر مرتا ہوں اور جیتا ہوں۔",surahnas)
                    ));
}

