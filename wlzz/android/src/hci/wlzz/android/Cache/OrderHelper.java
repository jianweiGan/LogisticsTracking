package hci.wlzz.android.Cache;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class OrderHelper extends SQLiteOpenHelper {
	private static final int VERSION = 1;
	private static final String DBNAME = "data.db";
	public  OrderHelper(Context context) 
	{
		super(context, DBNAME, null, VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table if not exists order(Id integer,Info varchar(500))");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
