package com.itc.recyclerview;

import java.util.ArrayList;

public class MemberBiodata {

    private String nama[] = {
            "Johny",
            "Taeyong",
            "Doyoung",
            "Jaehyun",
            "Lucas",
            "Mark",
            "Renjun",
            "Jeno",
            "Haechan",
            "Jaemin",
            "Chenle",
            "Jisung"
    };

    private String position[] = {
            "Rapper",
            "Leader",
            "Vocalist",
            "Vocalist",
            "Rapper",
            "Rapper",
            "Vocalist",
            "Rapper",
            "Vocalist",
            "Rapper",
            "Vocalist",
            "Dancer"
    };

    private String born[] = {
            "Chicago, February 9th 1995",
            "Seoul, July 1st 1995",
            "Gyeonggi, February 1st 1996",
            "Seoul, February 14th 1997",
            "Hongkong, January 25th 1999",
            "Toronto, August 2nd 1999",
            "Jilin, March 23rd 2000",
            "Incheon, April 23th 2000",
            "Seoul, June 6th 2000",
            "Jeonju, August 13th 2000",
            "Shanghai, November 22nd 2001",
            "Seoul, February 5th 2002"
    };

    private int pict[] = {
            R.drawable.johny,
            R.drawable.taeyong,
            R.drawable.doyoung,
            R.drawable.jaehyun,
            R.drawable.lucas,
            R.drawable.mark,
            R.drawable.renjun,
            R.drawable.jeno,
            R.drawable.haechan,
            R.drawable.jaemin,
            R.drawable.chenle,
            R.drawable.jisung
    };

    public ArrayList<SetGetData> getData() {
        ArrayList<SetGetData> list = new ArrayList<>();
        for (int i = 0; i < nama.length; i++) {
            SetGetData data = new SetGetData();
            data.setNama(nama[i]);
            data.setPosition(position[i]);
            data.setBorn(born[i]);
            data.setPict(pict[i]);
            list.add(data);
        }
        return list;
    }
}