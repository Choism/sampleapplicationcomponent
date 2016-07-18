package com.example.tacademy.sampleapplicationcomponent;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Tacademy on 2016-07-18.
 */
/*
public class MyData implements Serializable { //Serializable
public String keyword;
    public int age;
}*/

public class MyData implements Parcelable { //Parcelable
public String keyword;
public int age;

public MyData() { //기본 디볼트 생성

        }

public MyData(Parcel parcel) {
        keyword = parcel.readString();
        age = parcel.readInt();
        }

@Override
public int describeContents() {
        return 0;
        }

@Override
public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(keyword);
        parcel.writeInt(age);
        }

public static Parcelable.Creator<MyData> CREATOR = new Parcelable.Creator<MyData>() {
@Override
public MyData createFromParcel(Parcel parcel) {
//            MyData d = new MyData();
//            d.keyword = parcel.readString();
//            d.age = parcel.readInt();
//            return d;
        return new MyData(parcel);
        }

@Override
public MyData[] newArray(int size) {
        return new MyData[size];
        }
    };
}

