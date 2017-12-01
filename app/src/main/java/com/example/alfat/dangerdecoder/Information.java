package com.example.alfat.dangerdecoder;
        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.TextView;

public class Information extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Intent j=getIntent();
        String s=j.getStringExtra("name");
        TextView tv;

        tv=(TextView) findViewById(R.id.textView1);

        if(s.matches("Bagerhat"))
        {
            tv.setText("Police station:\nBagerhat:01713-374122\nFokirhat:01713-374123\nMollahat:01713-374124\nChitolmari:01713-374125\nKochua:01713-374126\nMorrelgonj:01713-374127\nSoronkhola:01713-374128\nRampal:01713-374130\nMongla:01713-374129\n\nFire service:\nBagerhat Fire Station:01712422481\nMorelgonj Fire Station:01722012555\n\nHospital:01711389546");
        }
        if(s.equals("Bandarban"))
        {
            tv.setText("Police station:\nBandarban:01730-336161\nRoangchori:0361-62238-3\nRuma:0361-62278-27\nThanchi:0361-62247-6\nLama:0361-62268-10\nAlikodam:0361-62298-5\nNaikhanchori:0361-62240-5\n\nFire service:\nBandorban Fire Station:01815730311\n\nHospital:0361-62233");
        }
        if(s.equals("Barghuna"))
        {
            tv.setText("Police station:\nSadar:01713-374353\nAmtali:01713-374354\nTaltoli:01713-374358\nPatharghata:01713-374355\nBamna:01713-374357\nBetagi:01713-374356\n\nFire service:\nBorguna Fire Station:01715647900\nAmtoli Fire Station:01719565280\n\n");
        }
        if(s.equals("Barisal"))
        {
            tv.setText("Police station:\nSadar:01746-166669\nBakergonj:01713-374272\nBabugonj:01713-374271\nBanaarypara:01713-374273\nUzirpur:01713-374276\nGouranadi:01713-374275\nAgoiljhara:01713-374274\nHijla:01713-374268\nMuladi:01713-374270\nMahendigonj:01713-374269\nKazirhat:01769-690450\n\nFire service:\nBorishal Fire Station:01712925852\nBorisal River Fire Station:0431-64000\nGouronodi Fire Station:04322-56333\nBanaripara Fire Station:01920515682\nUjirpur Fire Station:04329-56222\n\nHospital:43164372");
        }
        if(s.equals("Bhola"))
        {
            tv.setText("Police station:\nSadar:01713-374300\nDaulotkhan:01713-374301\nTazumuddin:01713-374302\nBorhan:01713-374303\nLalmohan:01713-374304\nCarfession:01713-374305\nMonpura:01713-374306\n\nFire service:\nVola Fire Station:01715468312\nBorhanuddin Fire Station:04922-56222\nCharfassion Fire Station:04923-74222\n\nHospital:01715110026");
        }
        if(s.equals("Bogra"))
        {
            tv.setText("Police station:\nSadar:01713-374061\nShibgonj:01713-374062\nSonatola:01713-374063\nGabtali:01713-374064\nSariyakandi:01713-374065\nAdamdighi:01713-374066\nDupchachiya:01713-374067\nKahalu:01713-374068\nSherpur:01713-374069\nDhunut:01713-374070\nNandigram:01713-374071\nShajahanpur:01713-374072\n\nFire service:\nBogra Fire Station:01715271779\nSonatola Fire Station:01719550381\nShariakandi Fire Station:01714145464\n\nHospital:01911560808");
        }
        if(s.equals("Bramanbaria"))
        {
            tv.setText("Police station:\nSadar:01713-373730\nAshugong:01713-373732\nSarail:01713-373731\nNasirnagor:01713-373733\nNabinagor:01713-373734\nBancharampur:01713-373735\nKasba:01713-373736\nAkhaura:01713-373737\nBijoynagar:01776-350909\n\nFire service:\nB Baria Fire Station:01818484795\nAshugonj Fire Station:01814232554\nAkhaura Fire Station:01195053667\n\nHospital:0851-59282");
        }
        if(s.equals("Chandpur"))
        {
            tv.setText("Police station:\nSadar:01713-373712\nHajigong:01713-373713\nMotlap North:01713-373714\nMotlap South:01713-373715\nSharajti:01713-373716\nKochua:01713-373717\nFaridgonj:01713-373718\nHaimchar:01713-373719\n\nFire service:\nChandpur River Fire Station:01717119492\nHajigonj Fire Station:01711079735\nChandpur North Fire Station:01914879868\nChandpur South Fire Station:01711118881\nShahrasti Fire Station:01819438367\nKochua Fire Station:01717174751\n\nHospital:01711724760");
        }
        if(s.equals("Chapainawabgonj"))
        {
            tv.setText("Police station:\nSadar:01713-373819\nShibgonj:01713-373820\nGomostapur:01713-373821\nNachoal:01713-373822\nBholahat:01713-373823\n\nFire service:\nChapai Nababgonj:0781-55212\n\nHospital:078152489");
        }
        if(s.equals("Chittagonj"))
        {
            tv.setText("Police station:\nSadar:01757-001117\nJorargonj:01769-690579\nMirsharai:01713-373644\nSitakunda:01713-373645\nSandwip:01713-373652\nHathazari:01713-373640\nRaozan:01713-373639\nRangunia:01713-373642\nFatickchari:01713-373641\nVujpur:01713-374600\nPotiya:01713-373643\nBoalkhali:01713-373647\nChandonayes:01713-373651\nAnowara:01713-373646\nSatkania:01713-373649\nBanshkhali:01713-373648\nLohagara:01713-373650\n\nFire service:\nAgrabad Fire Station:01554330920\nNandankanan Fire Station:01711040443\nChandanpura Fire Station:01715031166\nBaejid Fire Station:01716509463\nLamarbazar Fire Station:01713605460\nDock Fire Station:01719992670\nKalurghat Fire Station:01712176904\nEPZ Fire Station:01719678720\nHathajari Fire Station:01812604959\nKumira Fire Station:01558456200\nShitakundu Fire Station:01199095607\nPotia Fire Station:01815628991\nSatkania Fire Station:01818318286\n\nHospital:031630404");
        }
        if(s.equals("Chuadanga"))
        {
            tv.setText("Police station:\nSadar:01713-374236\nAlamdanga:01713-374237\nJibonnogar:01713-374238\nDamurhuda:01713-374239\n\nFire service:\nChuadanga Fire Station:01720154476\nAlamdanga Fire Station:01717483616\n\nHospital:076162445");
        }
        if(s.equals("Comilla"))
        {
            tv.setText("Police station:\nKotwali:01713-373685\nSadar South:01713-373700\nDhautkandi:01713-373690\nChandina:01713-373692\nMuratnagor:01713-373695\nChoudogram:01713-373686\nDebithdar:01713-373687\nBuruchang:01713-373691\nLaksham:01713-373689\nLanggolcort:01713-373694\nBarua:01713-373693\nB-Para:01713-373696\nHomena:01713-373688\nTitas:01713-373699\nMonohoargong:01713-373698\nMegna:01713-373697\n\nFire service:\nKumilla Fire Station:0191152605400\nChoddogram Fire Station:01710938171\nLaksham Fire Station:01716874356\nMuradnogor Fire Station:01714302316\nBorura Fire Station:01670607264\nEPZ Fire Station:01715523577\n\nHospital:01819134545");
        }
        if(s.equals("Coxs bazar"))
        {
            tv.setText("Police station:\nSadar:01713-373663\nRamu:01713-373664\nUkhia:01713-373665\nTeknaf:01713-373666\nChakuria:01713-373667\nKutubdia:01713-373668\nMaheshkhali:01713-373669\nPekua:01713-373670\n\nFire service:\nKoxesbazar Fire Station:01815678892\nChokoria Fire Station:03422-56051\n\nHospital:03413584");
        }
        if(s.equals("Dhaka"))
        {
            tv.setText("Police station:\nShahbag:01713-373127\nDhanmondi:01713-373126\nHajaribag:01713-373136\nNewmarket:01713-373128\nKalabagan:01713-373139\nLalbag:01713-373134\nKotwali:01713-373135\nKamrangichar:01713-373137\nChalk Bazar:01713-398337\nBangshal:01713-398336\nMotijheel:01713373152\nPalton:01713373155\nSabujbag:01713373153\nKhilgaon:01713373154\nRampura:01713398526\nShahzahanpur:01769058063\nMukda:01769058061\nSutrapur:01713373143\nDemra:01713373144\nShyampur:01713373145\nJatrabari:01713373146\nKadomtoli:01713398333\nGandaria:01713398331\nWari:01769058051\nMirpur:01713-373189\nPallabi:01713-373190\nShah-ali:01713-373192\nKafrul:01713-373191\nDarussalm:01713-398334\nRupnagar:01769-058059\nVasantek:01769-058057\nGulshan:01713-373171\nBadda:01713-373173\nCantonment:01713-373172\nKhilkhet:01713-373174\nBanani:01769-058053\nVatra01769-058055\nUttara:01713-373161\nTurag:01713-373163\nDockhin Khan:01713-373165\nUttar Khan:01713-373164\nAirport:01713-373162\nUttara West:01769-058065\n\nFire service:\nSavar Fire Station:01712180250\nSiddik Bazar Fire Station:01711283129\nSodhorghat Fire Station:01715147907\nSodhorghat River Fire Station:01711577451\nPostogola Fire Station:01712897982\nLalbag Fire Station:01715131725\nPolashi Barak Fire Station:01716354370\nKhilgaon Fire Station:01915663594\nTejgaon Fire Station:9898187\nMohammadpur Fire Station:01712970093\nMirpur Fire Station:01556300117\nKurmitola Fire Station:01712269150\nBaridhara Fire Station:01724010458\nKeranigonj Fire Station:01717470638\nDEPZ Fire Station:01552313231\nDemra Fire Station:01716484229\n\nHospital:\nShaheed Sohrawardi Medicel College Hospital:9130800-19\nBirdem General Hospital:8616641\nBSMMU:9661051-56\nDhaka Child Hospital:8116061-62\nDhaka Medical College Hospital:8626812-19\nNational Heart Institute & Hospital:9122560.\nNational Kidney Institute & Hospital:91365560-3");
        }
        if(s.equals("Dinajpur"))
        {
            tv.setText("Police station:\nKotwali:01713-373963\nChirirbandar:01713-373964\nBirol:01713-373965\nParbatipur:01713-373966\nBirgonj:01713-373967\nBochagon:01713-373968\nKaharul:01713-373969\nKhanshama:01713-373970\nFulbari:01713-373971\nBirampur:01713-373972\nNawabgonj:01713-373973\nGhoraghat:01713-373974\nHakimpur:01713-373975\n\nFire service:\nDinajpur Fire Station:01726346662\nParbotipur Fire Station:05334-74222\nFulbari Fire Station:01712313271\nShetabgonj Fire Station:05325-73344\n\nHospital:01714052116");
        }
        if(s.equals("Faridpur"))
        {
            tv.setText("Police station:\nKotwali:01713-373556\nModhukhali:06326-56003\nBoalmari:06324-56121\nAlfadanga:06322-56103\nChar Vodrason:06325-56003\nNagarkanda:06327-56114\nSadarpur:06328-75444\nSaltha:0631-89096\nBhanga:06323-56105\n\nFire service:\nFaridpur Fire Station:01816383888\nBoalmari Fire Station:01726648020\n\nHospital:063163077");
        }
        if(s.equals("Feni"))
        {
            tv.setText("Police station:\nSadar:01713-373778\nDagonbhuiyan:01713-373783\nSonagazi:01713-373779\nChagolnaiya:01713-373782\nFulgazi:01713-373780\nPorshuram:01713-373781\n\n Fire service:\nFeni Fire Station:01716122294\n\nHospital:01724-120735");
        }
        if(s.equals("Gaibandha"))
        {
            tv.setText("Police station:\nGaibandha:01713373892\nShadullhapur:01713373893\nSundargonj:01713373894\nPalashbari:01713373895\nGobindagonj:01713373896\nSaghata:01713373897\nFulchhari:01713373898\n\nFire service:\nGaibandha Fire Station:01727218753\n\nHospital:054161516");
        }
        if(s.equals("Gazipur"))
        {
            tv.setText("Police station:\nSadar:01556-343937\nTangi:01713-373364\nJoydebpur:01713-373363\nKaliaquir:01713-373365\nSreepur:01713-373366\nKapasia:01713-373367\nKaligonj:01713-373368\n\nFire service:\nTongi Fire Station:01727259055\nGazipur Fire Station:01816511290\n\nHospital:682452140 ");
        }
        if(s.equals("Gopalgonj"))
        {
            tv.setText("Police station:\nGopalgonj:01713373572\nMokshudpur:01713373573\nKashiani:01713373574\nKotalipara:01713373575\nTungipara:01713373576\n\nFire service:\nGopalgonj Fire Station:01712084436\n\nHospital:02-6685243");
        }
        if(s.equals("Habigong"))
        {
            tv.setText("Police station:\nSadar:01713-374398\nMadabpur:01713-374399\nChunarughat:01713-374400\nBahubal:01713-374401\nLakhai:01713-374402\nNabigonj:01713-374403\nBaniachang:01713-374404\nAjmirigonj:01713-374405\nShaestagonj:01713-374406\n\nFire service:\nHobigonj Fire Station:01913115601\nMadhobpur Fire Station:01712382935\n\nHospital:01192077941");
        }
        if(s.equals("Jamalpur"))
        {
            tv.setText("Police station:\nSadar:01713-373538\nMelandah:01713-373539\nSharishabari:01713-373540\nDewangonj:01713-373541\nIslampur:01713-373542\nMedargonj:01713-373543\nBakshigonj:01713-373544\nBahadurabad:01713-373545\n\nFire service:\nJamalpur Fire Station:01728020830\n\nHospital:01712860701");
        }
        if(s.equals("Jessore"))
        {
            tv.setText("Police station:\nKotuali:01713-374161\nJhikorgasa:01713-374162\nSharsa:01713-374163\nChougasa:01713-374164\nMonirmpur:01713-374165\nKesobpur:01713-374166\nOvoynogor:01713-374167\nBagharpara:01713-374168\nBanapol:01713-374169\n\nFire service:\nJessore:01716886966\nNowapara Fire Station:01714661320\nJhikorgacha Fire Station:01715368881\nBenapol Fire Station:01712212511\nBalagonj Fire Station:01716333657\nMonirampur Fire Station:01718347883\n\n");
        }
        if(s.equals("Jhalokathi"))
        {
            tv.setText("Police station:\nSadar:01713-374286\nNolcity:01713-374287\nRajapur:01713-374288\nKathalia:01713-374289\n\nFire service:\nJhalkhati Fire Station:01712384742\nKathalia Fire Station:01725375563\n\nHospital:01715856813");
        }
        if(s.equals("Jinaydah"))
        {
            tv.setText(" Police station:\nSadar:01713-374192\nShailkupa:01713-374194\nHorinakundu:01713-374195\nKaligonj:01713-374193\nKotchadpur:01713-374196\nMoheshpur:01713-374197\n\nFire service:\nJhinedah Fire Station:01718159077\nCoat Chadpur Fire Station:01721651693\nShoilokopa Fire Station:01718746518\n\nHospital:045162202");
        }
        if(s.equals("Joypurhat"))
        {
            tv.setText("Police station:\nSadar:01713-374082\nKalai:01713-374083\nKhetlal:01713-374084\nAkkelpur:01713-374085\nPanchbibi:01713-374086\n\nFire service:\nJoypurhat Fire Station:01714660209\nPachbibi Fire Station:01718212403\n\nHospital:057162455");
        }
        if(s.equals("khagrasori"))
        {
            tv.setText("Police station:\nSadar:01730-336155\nDighinala:01755-551146\nPanchari:01755-551148\nMohalchari:01755-551147\nMatiranga:01755-551150\nGuimara:01755-551153\nRamgor:01755-551149\nManigchari:01755-551151\nLaxmichari:01755-551152\n\nFire service:\nKhagrachory Fire Station:01816806646\nRamgore Fire Station:01554331163\n\nHospital:01716842291");
        }
        if(s.equals("Khulna"))
        {
            tv.setText("Police station:\nDaulatpur:01713-373293\nKhalishpur:01713-373292\nKhanjahanali:01713-373294\nKhulna thana:01713-373285\nSonadanga:01713-373286\nLabanchara:01558-328303\nHorintana:01558-328304\nArangghata:01558-328305\nRupsha:01713-374109\nBatiaghata:01713-374160\nDigholia:01713-374104\nDakop:01713-374110\nPaikgasa:01713-374105\nKoyra:01713-374111\nFultola:01713-374103\nTarokhada:01713-374108\nDumuria:01713-374107\n\nFire service:\nKhulna River Fire Station:01913020759\nTutpara Fire Station:0155632764\nKhalishpur Fire Station:01714303118\nDoulotpur Fire Station:01714493862\n\nHospital:01730324797");
        }
        if(s.equals("Kishoregonj"))
        {
            tv.setText("Police station:\nSadar:01713-373480\nKarimgonj:01713-373481\nTarail:01713-373482\nHossainpur:01713-373483\nPakundia:01713-373491\nKotiyadi:01713-373484\nBajitpur:01713-373485\nKuliarchar:01713-373486\nBhairab:01713-373487\nItna:01713-373488\nMithamoin:01713-373489\nNikli:01713-373490\nAustagram:01713-373492\n\nFire service:\nKishorgonj Fire Station:01712396464\nBazitpur Fire Station:01720268833\nVoirob Bazar Fire Station:01726387424\n\nHospital:0941-61776 ");
        }
        if(s.equals("Kurigram"))
        {
            tv.setText("Police station:\nSadar:01713-373926\nRajarhat:01713-373927\nFulbari:01713-373928\nNageshori:01713-373929\nBhurungimari:01713-373930\nUlipur:01713-373931\nChilmari:01713-373932\nRowmari:01713-373933\nRajibpur:01713-373934\nKachakata:01713-373936\nDusmara:01713-373935\n\nFire service:\nKurigram Fire Station:01718972725\nUlipur Fire Station:01718255598\n\nHospital:0581-61355");
        }
        if(s.equals("Kushtia"))
        {
            tv.setText("Police station:\nSadar:01713-374220\nKumarkhali:01713-374222\nKhocsha:01713-374221\nMirpur:01713-374225\nBheramara:01713-374223\nDoulutpur:01713-374224\n\nFire service:\nKustia Fire Station:01718787146\nKumarkhali Fire Station:01721563169\nMirpur Fire Station:01715856586\nVeramara Fire Station:01712937759  \n\n");
        }
        if(s.equals("Lalmonirhat"))
        {
            tv.setText("Police station:\nSadar:01713373946\nAditmari:01713373947\nKaligonj:01713373948\nHatibanda:01713373949\nPatgram:01713373950\n\nFire service:\nLalmonirhat Fire Station:01715824316\nPatgram Fire Station:01719736201\n\nHospital:059161254");
        }
        if(s.equals("Laxmipur"))
        {
            tv.setText("Police station:\nSadar:01713-373765\nRaipur:01713-373766\nRamgong:01713-373767\nRamgoti:01713-373768\nKamalnagar:01769-690080\nChandragonj:01788-940052\n\nFire service:\nLaxmipur Fire Station:01817352966\n\nHospital:038155663");
        }
        if(s.equals("Madaripur"))
        {
            tv.setText("Police station:\nSadar:01713373585\nRajoir:01713373586\nKalkini:01713373587\nShibchar:01713373588\nDasher:01769690497\n\nFire service:\nMadaripur Fire Station:01718919143\n\nHospital:0661-61226");
        }
        if(s.equals("Magura"))
        {
            tv.setText("Police station:\nSadar:01713-374179\nShalika:01713-374180\nSripur:01713-374181\nMohammodpur:01713-374182\n\nFire service:\nMagora Fire Station:01718052152\n\nHospital:01730-324799");
        }
        if(s.equals("Manikgonj"))
        {
            tv.setText("Police station:\n01713-373379\nGhior:01713-373380\nShibalay:01713-373381\nDoulotpur:01713-373382\nHarirampur:01713-373383\nShaturia:01713-373384\nSingair:01713-373385\n\nFire service:\nManikgonj Fire Station:01914543883\nGhior Fire Station:01712173458\n\nHospital:065161246");
        }
        if(s.equals("Maymensing"))
        {
            tv.setText("Police station:\nSadar:01713-373430\nMuktagachha:01713-373431\nFulbaria:01713-373432\nTrishal:01713-373433\nBhaluka:01713-373441\nGaforgaon:01713-373440\nPagla:01713-374556\nGouripur:01713-373434\nIsshargonj:01713-373435\nNandail:01713-373436\nFulpur:01713-373437\nHaluaghat:01713-373438\nDhobaura:01713-373439\nTarakanda:01713-373442\n\nFire service:\nMymenshing Fire Station:01715386271\nGoforgaon Fire Station:09025-56400\nMuktagacha Fire Station:01913928536\nIsshorgonj Fire Station:01199101124\nValuka Fire Station:01914422300\n\nHospital:09167477");
        }
        if(s.equals("Meherpur"))
        {
            tv.setText("Police station:\nSadar:01713374249\nGangni:01713374250\nMujib nogor:01713374251\n\nFire service:\nMeherpur Fire Station:01718787146\n\nHospital:079162215");
        }
        if(s.equals("Moulibazar"))
        {
            tv.setText("Police station:\nSadar:01713-374439\nSrimangol:01713-374440\nKamalgonj:01713-374441\nRajnagor:01713-374442\nKulaura:01713-374443\nBaralekha:01713-374444\nJuri:01713-374445\n\nFire service:\nMoulovibazar Fire Station:01720634040\nSrimongal Fire Station:01716072028\nKulaura Fire Station:01712750112\nBorolekha Fire Station:01819848030\n\nHospital:086153082");
        }
        if(s.equals("Munshigonj"))
        {
            tv.setText("Police station:\nSadar:01713-373396\nTongibari:01713-373397\nGozaria:01713-373401\nLouhojong:01713-373398\nSreenagor:01713-373399\nSirajdikhan:01713-373400\n\nFire service:\nMunshigonj Fire Station:0691-62121\n\n");
        }
        if(s.equals("Naogaon"))
        {
            tv.setText("Police station:\nSadar:01713-373836\nRaninagar:01713-373837\nAthrai:01713-373838\nBadolghachi:01713-373840\nMahadebpur:01713-373841\nNyamatpur:01713-373843\nManda:01713-373844\nPatnitala:01713-373842\nDahmurhat:01713-373839\nShapahar:01713-373845\nPorsha:01713-373846\n\nFire service:\nNawgaon Fire Station:01816652843\nPotnitola Fire Station:01720574555  \n\n");
        }
        if(s.equals("Narayangonj"))
        {
            tv.setText("Police station:\nSadar:01713-373345\nFatulla:01713-373346\nBandar Thana:01713-373347\nSiddirganj:01713-373348\nArihazar:01713-373349\nSonar Gaon:01713-373350\nRupgonj:01713-373351\n\nFire service:\nNarayangonj Fire Station:01712592562\nHajigonj Fire Station:01716875492\nBondor Fire Station:01715585701\nNarayangonj River Fire Station:01726326225\nKanchon River Fire Station:01712685673\n\n");
        }
        if(s.equals("Narsingdi"))
        {
            tv.setText("Police station:\nSadar:01713-373412\nRaipura:01713-373413\nShibpur:01713-373414\nBelabo:01713-373415\nManohordi:01713-373416\nPalash:01713-373417\n\nFire service:\nNorshingdi Fire Station:01914976446\nPolashi Fire Station\n01716251528\nMadhobdi Bazar Fire Station:01726688868\n\nHospital:06289462006");
        }
        if(s.equals("Natore"))
        {
            tv.setText("Police station:\nSadar:01713-373857\nSingra:01713-373858\nBagatipara:01713-373859\nGuradashpur:01713-373860\nLalpur:01713-373861\nBaraigram:01713-373862\nNoldanga:01713-373863\n\nFire service:\nNator Fire Station:01712188142\n\nHospital:01711173845");
        }
        if(s.equals("Netrokona"))
        {
            tv.setText("Police station:\nSadar:01713373505\nBarhatta:01713373506\nKomlakanda:01713373507\nAtpara:01713373508\nDurgapur:01713373509\nPurbadhala:01713373510\nKendua:01713373511\nMadon:01713373512\nMohongonj:01713373513\nKhaliajuri:01713373514\n\nFire service:\nNetrokona Fire Station:01712890805\nMohongonj Fire Station:01720005838\n\nHospital:01730-324788");
        }
        if(s.equals("Nilphamari"))
        {
            tv.setText("Police station:\nSadar:01713-373909\nSyedpur:01713-373910\nJaldhaka:01713-373911\nKishorganj:01713-373912\nDomar:01713-373913\nDimla:01713-373914\n\n Fire service:\nNilfamary Fire Station:01918229909\nSoidpur Fire Station:01716872992\nDomar Fire Station:01718970910\n\nHospital:075161651");
        }
        if(s.equals("Noakhali"))
        {
            tv.setText("Police station:\nSadar:0321-62049\nSudaram:01713-373748\nBegaumgong:01713-373749\nSenbag:01713-373750\nSonaimuri:01713-373751\nCompanygong:01713-373752\nChatkhil:01713-373753\nHatia:01713-373754\nKobirhat:01769-690669\nCharjobbar:01713-373755\n\nFire service:\nMaijdi Fire Station:01813976660\nChoumohoni Fire Station:01196095142\n\nHospital:01730324774");
        }
        if(s.equals("Norail"))
        {
            tv.setText("Police station:\nSadar:01713-374206\nLohagora:01713-374208\nKalia:01713-374207\nNaragati:01713-374209\n\nFire service:\nNorail Fire Station:01720944805\n\nHospital:0481-62214");
        }
        if(s.equals("Pabna"))
        {
            tv.setText("Police station:\nSadar:01713-374016\nIsurdi:01713-374017\nAtghoria:01713-374018\nChatmahor:01713-374019\nBangura:01713-374020\nFaridpur:01713-374021\nSujanagar:01713-374022\nBera:01713-374023\nShathia:01713-374024\nAtaikula:01713-374025\nAminpur:01769-690443\n\nFire service:\nPabna Fire Station:01716962368\nIssordi Fire Station:01710986672\nBera Fire Station:01714762845\n\n Hospital:0731-63333 ");
        }
        if(s.equals("Panchagarh"))
        {
            tv.setText("Police station:\nSadar:01713-373999\nBoda:01713-374000\nAtwari:01713-374001\nTentulia:01713-374002\nDebiganj:01713-374003\n\nFire service:\nPonchogore Fire Station:01715277416\nTetulia Fire Station:01720802578\nNababgonj Fire Station:01719679610\n\nHospital:01748359533");
        }
        if(s.equals("Patuakhali"))
        {
            tv.setText(" Police station:\nSadar:01713-374318\nBoufal:01713-374319\nGalachipa:01713-374320\nDashmina:01713-374321\nDumki:01713-374322\nKolapara:01713-374323\nMirjagonj:01713-374324\nRangabali:01713-374325\n\nFire service:\nPotuakhali Fire Station:01719688623\nBaufol Fire Station:01819990764\n\nHospital:01722148706");
        }
        if(s.equals("Pirojpur"))
        {
            tv.setText("Police station:\nSadar:01713-374336\nBhandaria:01713-374337\nNesarabad:01713-374338\nKowkhali:01713-374339\nNajirpur:01713-374340\nIndurkani:01713-374341\nMotbaria:01713-374342\n\nFire service:\nPirojpur Fire Station:01712202814\nMothbaria Fire Station:01912365598\nVandaria Fire Station:01724652909\nKaukhali Fire Station:01720171665\nNajirpur Fire Station:01726184288\n\nHospital:0461-62233");
        }
        if(s.equals("Rajbari"))
        {
            tv.setText("Police station:\nSadar:01713-373598\nBaliakandi:01713-373599\nPangsha:01713-373600\nGoalanda:01713-373601\nKalukhali:01769-690050\n\n Fire service:Rajbari Fire Station:01712928723\n\nHospital:01711947936");
        }
        if(s.equals("Rajshahi"))
        {
            tv.setText("Police station:\nBagha:01713-373808\nBagmara:01713-373805\nCharghat:01713-373807\nDurgapur:01713-373806\nGodagari:01713-373801\nMohonpur:01713-373803\nPuthia:01713-373804\nTanore:01713-373802\nPaba:01713-373800\nBoalia:01713-373309\nRajpara:01713-373310\nMotiher:01713-373313\nShahmakhdoom:01713-373314\n\nFire service:\nRajshahi Fire Station:01716537740\nRajshahi University Fire Station:01920846828\nGodagari Fire Station:01710010388\nTanore Fire Station:01919419200\nPuthia Fire Station:01719751035  \n\n");
        }
        if(s.equals("Rangamati"))
        {
            tv.setText("Police station:\nKotwali:01730-336145\nNaniarchair:0351-41003\nKaptai:03529-62084\nChandroghona:0351-63058\nRajsthali:0351-81002\nBelaichari:0351-91009\nLongdhu:0351-42013\nBaghaichari:0351-62050\nJurachari:0351-62074\n\nFire service:\nRangamati Fire Station:01555038515\nCaptai Fire Station:01712587338\n\nHospital:035163030");
        }
        if(s.equals("Rangpur"))
        {
            tv.setText("Police station:\nSadar:01718-785529\nBagha:01713-373808\nBagmara:01713-373805\nCharghat:01713-373807\nDurgapur:01713-373806\nGodagari:01713-373801\nMohonpur:01713-373803\nPuthia:01713-373804\nTanore:01713-373802\nPaba:01713-373800\nBoalia:01713-373309\nRajpara:01713-373310\nMotiher:01713-373313\nShahmakhdoom:01713-373314\n\nFire service:\nRangpur Fire Station:01721700493\nHaragacha Fire Station:0521-61311\nBodorgonj Fire Station:01710871477\n\nHospital:052163063");
        }
        if(s.equals("Satkhira"))
        {
            tv.setText("Police station:\nSadar:01713-374141\nKolaroa:01713374142\nTala:01713374143\nKaligonj:01713374144\nShamnogor:01713374145\nDabhata:01713374146\nAshasuni:01713374147\nPatkelghata:01713374148\n\nFire service:\nSatkhira Fire Station:01912448952\n\nHospital:0471-63502");
        }
        if(s.equals("Shariatpur"))
        {
            tv.setText("Police station:\nSadar:01713-373617\nNoria:01713-373616\nJajira:01713-373615\nBhedargonj:01713-373613\nDamudda:01713-373614\nGoshairhat:01713-373612\nSakhiipur:01713-373618\n\nFire service:\nShoriotpur Fire Station:01726877270\n\nHospital:060161661");
        }
        if(s.equals("Sherpur"))
        {
            tv.setText("Police station:\nSadar:01713373523\nNokla:01713373524\nNalitabari:01713373525\nSerebordi:01713373526\nJhenigati:01713373527\n\nFire service:\nSherpur Fire Station:01710065627\n\nHospital:093161256-5");
        }
        if(s.equals("Sirajgonj"))
        {
            tv.setText("Police station:\nSadar:01713-374038\nBelkuchi:01713-374046\nKazipur:01713-374043\nRaigonj:01713-374045\nTarash:01713-374042\nKamarkhanda:01713-374044\nSalanga:01713-374048\nUllahpara:01713-374040\nShahzadpur:01713-374039\nEnayetpur:01713-374049\nChouhali:01713-374041\n\nFire service:\nSirajgonj Fire Station:01712350924\nUllapara Fire Station:01726317612\nShahjadpur Fire Station:01718818512\nKazipur Fire Station:07525-56299\n\nHospital:01715422502");
        }
        if(s.equals("Sunamgonj"))
        {
            tv.setText("Police station:\nSadar:01713-374418\nChhatok:01713-374419\nJagoannathpur:01713-374420\nTahirpur:01713-374421\nBiswamvorpur:01713-374422\nDoarabazar:01713-374423\nDirai:01713-374424\nSulla:01713-374425\nJamalgonj:01713-374426\nDhormopasha:01713-374427\nModdhonagar:01713-374428\nDhokkhin Sunamgonj:01713-374429\n\nFire service:\nSunamgonj Fire Station:0871-55222\nChatok Fire Station:01714434677\n\nHospital:087155622 ");
        }
        if(s.equals("Sylhet"))
        {
            tv.setText("Police station:\nSadar:0821-718585\nBianibazar:01713-374382\nBalagonj:01713-374376\nBisshanath:01713-374384\nCompanigonj:01713-374380\nFenchugonj:01713-374385\nGoainghat:01713-374378\nGolapgonj:01713-374383\nJaintapur:01713-374377\nJokigonj:01713-374381\nKanighat:01713-374379\nOsmani nagar:01713-374387\n\nFire service:\nSylhet Fire Station:01712940120\nSylhet South Fire Station:01819971003\nBalagonj Fire Station:01712395677\n\nHospital:0821713433");
        }

        if(s.equals("Thakurgaon"))
        {
            tv.setText("Police station:\nSadar:01713-373985\nBaliadangi:01713-373986\nRanishonkail:01713-373987\nPirgonj:01713-373988\nHaripur:01713-373989\nRuhia:01718-293702\n\nFire service:\nThakurgaon Fire Station:01714332794\nPirgonj Fire Station:01715773459\n\nHospital:0561-52011");
        }
        if(s.equals("Tangail"))
            tv.setText("Police station:\nSadar:01713-373454\nMirjapur:01713-373455\nNagarpur:01713-373456\nDelduar:01713-373459\nBasail:01713-373458\nSakhipur:01713-373457\nKalihati:01713-373462\nGhatail:01713-373461\nMadhupur:01713-373460\nDhanbari:01713-373465\nGopalpur:01713-373466\nBhuapur:01713-373463\n\nFire service:\nTangail Fire Station:01715448484\nModhupur Fire Station:01711589789\n\nHospital:01720034074");


        //tv.setText(s);
    }
}

