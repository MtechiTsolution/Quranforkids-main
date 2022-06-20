package com.example.localdata;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.provider.CalendarContract;

import com.Models.Dua_model;
import com.example.qfk.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class alldata {
     public static final ArrayList<Dua_model> dua_model=
             new ArrayList<>(Arrays.asList(
    new Dua_model("سوتے وقت کی دعا","1","سوتے وقت ", "اَللّٰھُمَّ بِاسْمِکَ  اَمُوْتُ وَاَحْیَا","O Allah (Almighty) I live and die in your name.","الٰہی عزوجل میں تیرے نام پر مرتا ہوں اور جیتا ہوں۔", R.drawable.ss_leep, Color.WHITE),
    new Dua_model("کھانے سے پہلے کی دعا","2","کھانے سے پہلے ", "بِسْمِ اللّٰہِ وَعَلٰی بَرَكَةِ اللّٰہِ","In the name of Allah and with the blessings of Allah I begin (eating).","میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا", R.drawable.before_eat_dua,Color.WHITE),
    new Dua_model("گھر سے نکلتے وقت کی دعا","3","گھر سے نکلتے وقت", "بِسْمِ اللّٰہِ تَوَكَّلْتُ عَلَى اللّٰہِ وَلَا حَوْلَ وَلَا قُوَّةَ إِلَّا بِاللّٰہِ","In the name of Allah Almighty (I comeout of my house) I trust Allah Almighty, there is no capability of saving oneself from sins and neither is there capability to do good deeds but from Allah Almighty.","اللہ عزوجل کے نام سے (گھر سے نکلتا ہوں) میں نے اللہ عزوجل پر بھروسہ کیا اللہ عزوجل کے بغیر نہ طاقت ہے (گناہوں سے بچنےکی) اور نہ وقت ہے (نیکیاں کرنے کی)۔", R.drawable.leavehouse,Color.WHITE),
    new Dua_model("نیند سے بیدار ہونے کی دعا","4","جاگنے کے بعد", "الْحَمْدُ لِلّٰہِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُور","All Praise onto Allah (Almighty) Who granted us life after death (Sleep) and we are return to him.","تمام تعریفیں اللہ عزوجل کے لئے جس نے ہمیں موت (نیند) کے بعد حیات (بیداری) عطا فرمائی اور ہمیں اسی طرف لوٹنا ہے۔", R.drawable.afterawake,Color.WHITE),
    new Dua_model("آئنہ دیکھتے وقت کی دعا","5","آئینہ دیکھتے وقت", "اَللّٰهُمَّ أَنْتَ حَسَّنْتَ خَلْقِي فَحَسِّنْ خُلُقِي","O Allah Azzawajal as you made my outward appearance good make my character good too.","اللہ عزوجل تو نے میری صورت اچھی بنائی تو میری سیرت (اخلاق) بھی اچھی کردے۔", R.drawable.mirror_dua,Color.WHITE),
    new Dua_model("مغفرت کی دعا","6","مغفرت کی دعا", "اَسْتَغْفِرُ اللّٰہ","I seek forgiveness from Allah","میں معافی مانگتا ہوں اللہ سے", R.drawable.magfirat,Color.WHITE),
    new Dua_model("مسجد میں داخل ہونے کی دعا","7","مسجد میں داخل ہوتے وقت", "اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِکَ.","Oh Allah! Open the doors for me of your Blessings.","اے اللہ! میرے لیے رحمت کے دروازے کھول دے۔", R.drawable.entrmosque,Color.WHITE),
    new Dua_model("مسجد سے نکلنے کی دعا","8","مسجد سے نکلنے کے وقت", "اَللّٰهُمَّ اِنِّيْ اَسْاَلُکَ مِنْ فَضْلِکَ وَرَحْمَتِک","Oh Allah! I ask you of your Favour.","اے اللہ! میں تجھ سے تیرا فضل اور تیری رحمت مانگتا ہوں۔", R.drawable.exitmosque,Color.WHITE),
    new Dua_model("چھینک آنے کے وقت کی دعا","9","چھینک آنے پر", "اَلْحَمْدُ لِلّٰہ","All praise onto Allah Almighty.","تمام تعریفیں اللہ عزوجل کےلئے ہیں۔", R.drawable.sneeze,Color.WHITE),
    new Dua_model("علم میں اضافےکی دعا","10","علم میں اضافے", "رَبِّ  زِدْنِیْ عِلْمًا","O My Lord, Increase me in knowledge.","اے میرے رب! میرے علم میں اضافہ فرما۔", R.drawable.knowledge,Color.WHITE),
    new Dua_model("عیادت کرتے وقت کی دعا","11","عیادت کرتے وقت", "لَا بَأْسَ طَهُورٌ إِنْ شَآءَ اللّٰہ","This is not a thing of harm In Sha Allah Azzawajal this illness purifies from sins.","کوئی حرج کی بات نہیں انشاء اللہ عزوجل یہ مرض گناہوں سے پاک کرنے والا ہے", R.drawable.patient,Color.WHITE),
    new Dua_model("بارش کے وقت کی دعا","12","بارش کے وقت", "اَللّٰھُمَّ صَیِّبًا نَّا فِعًا","O Allah make it plentiful and beneficial.","اے اللہ اسے نفع دینے والی بارش بنا دے", R.drawable.rain,Color.WHITE),
    new Dua_model("دودھ پینے کی دعا","13","دودھ پینے کے بعد", "اَللّٰھُمَّ بَارِکْ لَنَا فِیْہِ وَزِدْنَامِنْہُ","O Allah Azzawajal give us abundance in this and grant us more than this.","یا الہی عزوجل ہمارے لئے اس میں برکت دے اور ہمیں اس سے زیادہ عنایت فرما۔", R.drawable.drinkmilk,Color.WHITE),
    new Dua_model("سیڑھیاں چڑھتے وقت کی دعا","14","سیڑھیاں چڑھتے وقت", "اَللّٰهُ اَكْبَر ُ","Allah Almighty is the greatest.","اللہ سب سے بڑا ہے", R.drawable.up,Color.WHITE),
    new Dua_model("غصہ آنے کے وقت کی دعا","15","غصہ آنے کے وقت", "أَعُوذُ بِاللّٰہِ مِنَ الشَّيْطٰنِ الرَّجِيمِ","I seek the refuge of Allah Almighty from the rejected Shetan.","میں شیطان مردود سے اللہ عزوجل کی پناہ چاہتا ہوں۔", R.drawable.angrychild,Color.WHITE),
    new Dua_model("وضو کے بعد کی دعا","16","وضو کے بعد", "أَشْهَدُ أنْ لا إلَٰهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيْكَ لَهُ وَأشْهَدُ أنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ","I bear witness that there is no god but Allah, He is the One, there is no partner to Him, and I bear witness that Muhammad is His servant and Messenger.","میں گواہی دیتا ہو کہ اللہ کے سوا کوئی معبود نہیں وہ اکیلا ہے اسکا کوئی شریک نہیں اور میں گواہی دیتا ہو کہ محمد ﷺ اسکے بندے اور رسول ہیں\n" +
            "\n۔", R.drawable.wazu,Color.WHITE)));

     

}
