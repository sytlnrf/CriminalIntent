package com.sytlnrf.shengyitao.criminalitent.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by shengyitao on 8/18/15.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;
    private ArrayList<Crime> crimeArrayList;
    private int CRIME_NUM = 100;
    private CrimeLab(Context context){
        mAppContext = context;
        crimeArrayList = new ArrayList<Crime>();
        generateCrimes(CRIME_NUM);
    }

    private void generateCrimes(int crimeNum){
        for (int i = 0;i < crimeNum;i++){
            Crime crime = new Crime();
            crime.setmTitle("crime #"+i);
            crime.setmSolved(i % 2 == 0);
            crimeArrayList.add(crime);
        }
    }
    public ArrayList<Crime> getCrimeArrayList() {
        return crimeArrayList;
    }
    public Crime getCrime(UUID uuid){
        for (Crime crime:crimeArrayList){
            if (crime.getmId().equals(uuid)){
                return crime;
            }
        }
        return null;
    }

    public static CrimeLab getsCrimeLab(Context context){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(context.getApplicationContext());
        }
        return sCrimeLab;
    }
}
