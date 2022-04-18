package com.example.localdata;

import com.Models.Dua_model;
import com.example.qfk.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class alldata {
     public static final ArrayList<Dua_model> dua_model=
             new ArrayList<>(Arrays.asList(
    new Dua_model("سوتے وقت کی دعا","1","سوتے وقت ", "اَللّٰھُمَّ بِاسْمِکَ  اَمُوْتُ وَاَحْیَا","O Allah (Almighty) I live and die in your name.","الٰہی عزوجل میں تیرے نام پر مرتا ہوں اور جیتا ہوں۔", R.drawable.ss_leep),
    new Dua_model("کھانے سے پہلے کی دعا","2","کھانے سے پہلے ", "بِسْمِ اللّٰہِ وَعَلٰی بَرَكَةِ اللّٰہِ","In the name of Allah and with the blessings of Allah I begin (eating).","میں نے الله کے نام کے ساتھ اور الله کی برکت پر کھانا شروع کیا", R.drawable.before_eat_dua),
    new Dua_model("کھانے کے بعد کی دعا","3","کھانے کے بعد", "الْحَمْدُ لِلَّهِ الَّذِي أَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مِنَ الْمُسْلِمِين","Thanks to Allah Azzawajal who fed us and made us among Muslims.","اللہ عزوجل کا شکر ہے جس نے ہمیں کھلایا پلایا اور مسلمانوں میں سے بنایا۔", R.drawable.after_eat),
    new Dua_model("نیند سے بیدار ہونے کی دعا","4","جاگنے کے بعد", "الْحَمْدُ لِلّٰہِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُور","All Praise onto Allah (Almighty) Who granted us life after death (Sleep) and we are return to him.","تمام تعریفیں اللہ عزوجل کے لئے جس نے ہمیں موت (نیند) کے بعد حیات (بیداری) عطا فرمائی اور ہمیں اسی طرف لوٹنا ہے۔", R.drawable.afterawake),
    new Dua_model("آئنہ دیکھتے وقت کی دعا","5","آئینہ دیکھتے وقت", "اَللّٰهُمَّ أَنْتَ حَسَّنْتَ خَلْقِي فَحَسِّنْ خُلُقِي","O Allah Azzawajal as you made my outward appearance good make my character good too.","اللہ عزوجل تو نے میری صورت اچھی بنائی تو میری سیرت (اخلاق) بھی اچھی کردے۔", R.drawable.mirror_dua),
    new Dua_model("مصافحہ کرتے وقت کی دعا","6","ہاتھ ملاتے وقت", "یَغْفِرُاللّٰہُ لَنَا وَلَکُمْ۔","May Allah Almighty forgive us and you.","اللہ عزوجل تمہاری اور ہماری مغفرت فرمائے۔", R.drawable.handshake),
    new Dua_model("مسجد میں داخل ہونے کی دعا","7","مسجد میں داخل ہوتے وقت", "اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِکَ.","Oh Allah! Open the doors for me of your Blessings.","اے اللہ! میرے لیے رحمت کے دروازے کھول دے۔", R.drawable.entrmosque),
    new Dua_model("مسجد سے نکلنے کی دعا","8","مسجد سے نکلنے کے وقت", "اَللّٰهُمَّ اِنِّيْ اَسْاَلُکَ مِنْ فَضْلِکَ وَرَحْمَتِک","Oh Allah! I ask you of your Favour.","اے اللہ! میں تجھ سے تیرا فضل اور تیری رحمت مانگتا ہوں۔", R.drawable.exitmosque),
    new Dua_model("چھینک آنے کے وقت کی دعا","9","چھینک آنے پر", "اَلْحَمْدُ لِلّٰہ","All praise onto Allah Almighty.","تمام تعریفیں اللہ عزوجل کےلئے ہیں۔", R.drawable.sneeze),
    new Dua_model("علم میں اضافےکی دعا","10","علم میں اضافے", "رَبِّ  زِدْنِیْ عِلْمًا","O My Lord, Increase me in knowledge.","اے میرے رب! میرے علم میں اضافہ فرما۔", R.drawable.knowledge),
    new Dua_model("عیادت کرتے وقت کی دعا","11","عیادت کرتے وقت", "لَا بَأْسَ طَهُورٌ إِنْ شَآءَ اللّٰہ","This is not a thing of harm In Sha Allah Azzawajal this illness purifies from sins.","کوئی حرج کی بات نہیں انشاء اللہ عزوجل یہ مرض گناہوں سے پاک کرنے والا ہے", R.drawable.patient),
    new Dua_model("بارش کے وقت کی دعا","12","بارش کے وقت", "اَللّٰھُمَّ صَیِّبًا نَّا فِعًا","O Allah make it plentiful and beneficial.","اے اللہ اسے نفع دینے والی بارش بنا دے", R.drawable.rain),
    new Dua_model("دودھ پینے کی دعا","13","دودھ پینے کے بعد", "اَللّٰھُمَّ بَارِکْ لَنَا فِیْہِ وَزِدْنَامِنْہُ","O Allah Azzawajal give us abundance in this and grant us more than this.","یا الہی عزوجل ہمارے لئے اس میں برکت دے اور ہمیں اس سے زیادہ عنایت فرما۔", R.drawable.drinkmilk),
    new Dua_model("شکریہ ادا کرتے وقت کی دعا","14","شکریہ کرتے وقت", "جَزَاکَ اللّہُ خَیْرًا","May Allah Almighty give you good recompense (for doing a favour).","اللہ عزوجل تجھے (احسان کرنے کی)جزاۓ خیر دے", R.drawable.thanks_dua),
    new Dua_model("خوشی کے وقت کی دعا","15","خوشی کے وقت", "سُبْحَانَ اللّٰہِ اَللّٰہُ اَکْبَر","God is holy, God is the greatest.","اللہ پاک ہے، اللہ سب سے بڑا ہے۔", R.drawable.happy),
    new Dua_model("وضو سے پہلے کی دعا","16","وضو سے پہلے ", "بِسْمِ اللّٰہِ وَلْحَمْدُ لِلّٰہِ","Allah Azzawajal in the name of the most affectionate, the merciful.","اللہ عزوجل کے نام سے شروع جو بڑا مہربان اور نہایت رحم والا ہے۔", R.drawable.wazu)));

     

}
