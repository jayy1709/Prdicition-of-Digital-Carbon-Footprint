package com.vatsal.android.digitaldetox.utils;

import java.util.HashMap;
import java.util.Map;

public class AppList {
    static HashMap<String, String> map;

    static String[] app_names = {"Accessibility Scanner",
            "Action Blocks",
            "Android Accessibility Suite",
            "Android Auto",
            "Android Auto Receiver",
            "Android Device Policy",
            "Android System WebView",
            "Android System WebView Beta",
            "Android System WebView Canary",
            "Android System WebView Dev",
            "Android TV Core Services",
            "Android TV Home",
            "Android TV Launcher",
            "Android TV Remote Service",
            "ARCore Elements",
            "Assistant",
            "Backdrop Daydream",
            "Blogger",
            "Calculator",
            "Cardboard",
            "Carrier Services",
            "Chrome Beta",
            "Chrome Canary (Unstable)",
            "Chrome Dev",
            "Chrome Remote Desktop",
            "Chromecast built-in",
            "Clock",
            "Compose Material Catalog",
            "Contacts",
            "Creative Preview",
            "Crowdsource",
            "Currents",
            "Data Restore Tool",
            "Data Transfer Tool",
            "Daydream",
            "Daydream Keyboard",
            "Device Utility",
            "Digital Wellbeing",
            "Dive Case Connector for Pixel",
            "Family Link child and teen",
            "Files by Google",
            "Gallery",
            "Gboard - the Google Keyboard",
            "Gmail",
            "Gmail Go",
            "Google",
            "Google Admin",
            "Google Ads",
            "Google AIY Projects",
            "Google Analytics",
            "Google app for Android TV",
            "Google Apps Device Policy",
            "Google Arts & Culture",
            "Google Assistant",
            "Google Authenticator",
            "Google Automotive App Host",
            "Google Automotive Keyboard",
            "Google Calendar",
            "Google Camera",
            "Google Chat",
            "Google Chrome: Fast & Secure",
            "Google Classroom",
            "Google Cloud",
            "Google Cloud Search",
            "Google Docs",
            "Google Drive",
            "Google Earth",
            "Google Family Link",
            "Google Fi",
            "Google Find My Device",
            "Google Fit: Activity Tracking",
            "Google Go",
            "Google Home",
            "Google I/O 2019",
            "Google Keep - Notes and Lists",
            "Google Lens",
            "Google Local Services Ads",
            "Google Maps",
            "Google Maps Go",
            "Google Meet",
            "Google Meet",
            "Google Meet (original)",
            "Google News - Daily Headlines",
            "Google One",
            "Google Opinion Rewards",
            "Google Photos",
            "Google Pixel Buds",
            "Google Pixel Watch",
            "Google Pixel Watch Faces",
            "Google Pixel Watch Services",
            "Google Play Books & Audiobooks",
            "Google Play Console",
            "Google Play Games",
            "Google Play services",
            "Google Play Services for AR",
            "Google Podcasts",
            "Google Sheets",
            "Google Slides",
            "Google Street View",
            "Google Support Services",
            "Google Tasks",
            "Google Translate",
            "Google TV",
            "Google Voice",
            "Google VR Services",
            "Google Wallet",
            "Grasshopper: Learn to Code",
            "Health Connect by Android",
            "Health Services",
            "Jacquard™ by Google",
            "Jamboard",
            "Live Channels",
            "Lookout - Assisted vision",
            "Messages",
            "Motion Sense Bridge",
            "Navigation for Google Maps Go",
            "NOT FOUND",
            "NOT FOUND",
            "Personal Safety",
            "Phone by Google",
            "PhotoScan by Google Photos",
            "Pixel Ambient Services",
            "Pixel Camera Services",
            "Pixel Launcher",
            "Read Along by Google",
            "Recorder",
            "Security Hub",
            "Snapseed",
            "Socratic by Google",
            "Sound Amplifier",
            "Speech Services by Google",
            "Stadia",
            "Stadia for Android TV",
            "Toontastic 3D",
            "TV Setup",
            "Voice Access",
            "Voice Action Services",
            "Wallpapers",
            "Wear OS by Google Smartwatch",
            "Wear OS System UI",
            "Weather",
            "YouTube",
            "YouTube for Android TV",
            "YouTube Kids",
            "YouTube Kids for Android TV",
            "YouTube Music",
            "YouTube Music",
            "YouTube Music",
            "YouTube Music for Chromebook",
            "YouTube Studio",
            "YouTube VR",
            "WhatsApp",
            "Instagram",
            "Reddit",
            "Twitter ",
            "Uber",
            "Truecaller",
            "Netflix",
            "Digi Carbon",
            "Telegram",
            "Microsoft Teams"
    };

    static String[] package_names = {"com.google.android.apps.accessibility.auditor",
            "com.google.android.apps.accessibility.maui.actionblocks",
            "com.google.android.marvin.talkback",
            "com.google.android.projection.gearhead",
            "com.google.android.embedded.projection",
            "com.google.android.apps.work.clouddpc",
            "com.google.android.webview",
            "com.google.android.webview.beta",
            "com.google.android.webview.canary",
            "com.google.android.webview.dev",
            "com.google.android.tvrecommendations",
            "com.google.android.tvlauncher",
            "com.google.android.leanbacklauncher",
            "com.google.android.tv.remote.service",
            "com.google.ar.unity.ddelements",
            "com.google.android.wearable.assistant",
            "com.google.android.backdrop",
            "com.google.android.apps.blogger",
            "com.google.android.calculator",
            "com.google.samples.apps.cardboarddemo",
            "com.google.android.ims",
            "com.chrome.beta",
            "com.chrome.canary",
            "com.chrome.dev",
            "com.google.chromeremotedesktop",
            "com.google.android.apps.mediashell",
            "com.google.android.deskclock",
            "androidx.compose.material.catalog",
            "com.google.android.contacts",
            "com.google.android.apps.audition",
            "com.google.android.apps.village.boond",
            "com.google.android.apps.plus",
            "com.google.android.apps.restore",
            "com.google.android.apps.pixelmigrate",
            "com.google.android.vr.home",
            "com.google.android.vr.inputmethod",
            "com.google.android.apps.wifisetup.app",
            "com.google.android.apps.wellbeing",
            "com.google.android.apps.camera.poseidon",
            "com.google.android.apps.kids.familylinkhelper",
            "com.google.android.apps.nbu.files",
            "com.google.android.apps.photosgo",
            "com.google.android.inputmethod.latin",
            "com.google.android.gm",
            "com.google.android.gm.lite",
            "com.google.android.googlequicksearchbox",
            "com.google.android.apps.enterprise.cpanel",
            "com.google.android.apps.adwords",
            "com.google.android.apps.aiy",
            "com.google.android.apps.giant",
            "com.google.android.katniss",
            "com.google.android.apps.enterprise.dmagent",
            "com.google.android.apps.cultural",
            "com.google.android.apps.googleassistant",
            "com.google.android.apps.authenticator2",
            "com.google.android.apps.automotive.templates.host",
            "com.google.android.apps.automotive.inputmethod",
            "com.google.android.calendar",
            "com.google.android.GoogleCamera",
            "com.google.android.apps.dynamite",
            "com.android.chrome",
            "com.google.android.apps.classroom",
            "com.google.android.apps.cloudconsole",
            "com.google.enterprise.topaz.mobile.android",
            "com.google.android.apps.docs.editors.docs",
            "com.google.android.apps.docs",
            "com.google.earth",
            "com.google.android.apps.kids.familylink",
            "com.google.android.apps.tycho",
            "com.google.android.apps.adm",
            "com.google.android.apps.fitness",
            "com.google.android.apps.searchlite",
            "com.google.android.apps.chromecast.app",
            "com.google.samples.apps.iosched",
            "com.google.android.keep",
            "com.google.ar.lens",
            "com.google.android.apps.ads.homeservices",
            "com.google.android.apps.maps",
            "com.google.android.apps.mapslite",
            "com.google.android.apps.tachyon",
            "com.google.android.apps.tachyon",
            "com.google.android.apps.meetings",
            "com.google.android.apps.magazines",
            "com.google.android.apps.subscriptions.red",
            "com.google.android.apps.paidtasks",
            "com.google.android.apps.photos",
            "com.google.android.apps.wearables.maestro.companion",
            "com.google.android.apps.wear.companion",
            "com.google.android.wearable.watchface.rwf",
            "com.google.android.wearable.fitbit.mcu.data",
            "com.google.android.apps.books",
            "com.google.android.apps.playconsole",
            "com.google.android.play.games",
            "com.google.android.gms",
            "com.google.ar.core",
            "com.google.android.apps.podcasts",
            "com.google.android.apps.docs.editors.sheets",
            "com.google.android.apps.docs.editors.slides",
            "com.google.android.street",
            "com.google.android.apps.helprtc",
            "com.google.android.apps.tasks",
            "com.google.android.apps.translate",
            "com.google.android.videos",
            "com.google.android.apps.googlevoice",
            "com.google.vr.vrcore",
            "com.google.android.apps.walletnfcrel",
            "com.area120.grasshopper",
            "com.google.android.apps.healthdata",
            "com.google.android.wearable.healthservices",
            "com.google.android.apps.jacquard",
            "com.google.android.apps.jam",
            "com.google.android.tv",
            "com.google.android.apps.accessibility.reveal",
            "com.google.android.apps.messaging",
            "com.google.android.apps.motionsense.bridge",
            "com.google.android.apps.navlite",
            "com.google.android.talk",
            "com.google.android.apps.genie.geniewidget",
            "com.google.android.apps.safetyhub",
            "com.google.android.dialer",
            "com.google.android.apps.photos.scanner",
            "com.google.intelligence.sense",
            "com.google.android.apps.camera.services",
            "com.google.android.apps.nexuslauncher",
            "com.google.android.apps.seekh",
            "com.google.android.apps.recorder",
            "com.google.android.apps.security.securityhub",
            "com.niksoftware.snapseed",
            "com.google.socratic",
            "com.google.android.accessibility.soundamplifier",
            "com.google.android.tts",
            "com.google.stadia.android",
            "com.google.stadia.androidtv",
            "com.google.toontastic",
            "com.google.android.tungsten.setupwraith",
            "com.google.android.apps.accessibility.voiceaccess",
            "com.google.android.apps.actionsservice",
            "com.google.android.apps.wallpaper",
            "com.google.android.wearable.app",
            "com.google.android.wearable.sysui",
            "com.google.android.wearable.weather",
            "com.google.android.youtube",
            "com.google.android.youtube.tv",
            "com.google.android.apps.youtube.kids",
            "com.google.android.youtube.tvkids",
            "com.google.android.apps.youtube.music",
            "com.google.android.apps.youtube.music",
            "com.google.android.youtube.tvmusic",
            "com.google.android.apps.youtube.music.pwa",
            "com.google.android.apps.youtube.creator",
            "com.google.android.apps.youtube.vr",
            "com.whatsapp",
            "com.instagram.android",
            "com.reddit.frontpage",
            "com.twitter.android",
            "com.ubercab",
            "com.truecaller",
            "com.netflix.mediaclient",
            "Digi Carbon",
            "org.telegram.messenger",
            "com.microsoft.teams"};


    public static HashMap<String, String> adddata(){
        map = new HashMap<>();
        for(int i=0;i<package_names.length; i++){
            map.put(package_names[i],app_names[i]);
        }

        return map;
    }

    public AppList(){
        map = new HashMap<>();
        for(int i=0;i<package_names.length; i++){
            map.put(package_names[i],app_names[i]);
        }
        this.map = map;
    }

    public static String getAppName(HashMap map, String s){
        String appName = null;
        if(map.get(s)!=null){
            appName = map.get(s).toString();
        }
        return appName;
    }

    public static String getAppName1( String s){
        String appName = null;
        if(map.get(s)!=null){
            appName = map.get(s).toString();
        }
        return appName;
    }

    public String getPackageName(String s){
        for(Map.Entry<String, String> entry: map.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if(s.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

}
