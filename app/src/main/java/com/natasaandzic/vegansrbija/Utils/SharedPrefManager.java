package com.natasaandzic.vegansrbija.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {

	SharedPreferences sharedPreferences;
	Context mContext;
	private static final String PREF_NAME = "sessionPref";
	SharedPreferences.Editor editor;

	public SharedPrefManager (Context context) {
		mContext = context;
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		editor = sharedPreferences.edit();
	}


	public void saveIsLoggedIn(Context context, Boolean isLoggedIn){
		mContext = context;
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putBoolean ("IS_LOGGED_IN", isLoggedIn);
		editor.commit();
	}

	public boolean getISLogged_IN() {
		//mContext = context;
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		return sharedPreferences.getBoolean("IS_LOGGED_IN", false);
	}

	public void saveToken(Context context, String toke){
		mContext = context;
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString("ID_TOKEN", toke);
		editor.commit();
	}

	public String getUserToken(){
		//mContext = context;
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		return sharedPreferences.getString("ID_TOKEN", "");
	}

	public void saveEmail(Context context, String email){
		mContext = context;
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString("EMAIL", email);
		editor.commit();
	}

	public String getUserEmail(){
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		return sharedPreferences.getString("EMAIL", null);
	}

	public void saveName(Context context, String name){
		mContext = context;
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString("NAME", name);
		editor.commit();
	}

	public String getName(){
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		return sharedPreferences.getString("NAME", null);
	}

	public void savePhoto(Context context, String photo){
		mContext = context;
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString("PHOTO", photo);
		editor.commit();
	}

	public String getPhoto(){
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		return sharedPreferences.getString("PHOTO", null);
	}

	public void saveCode(Context context, String code){
		mContext = context;
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPreferences.edit();
		editor.putString("CODE", code);
		editor.commit();
	}

	public String getCode(){
		sharedPreferences = mContext.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
		return sharedPreferences.getString("CODE", null);
	}

	public void clear(){
		editor.clear();
		editor.apply();
	}
}
