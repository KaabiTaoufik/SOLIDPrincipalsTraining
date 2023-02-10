package com.directi.training.dip.exercise;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements IDatabase
{
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;
    private static MyDatabase _databaseInstance;

    public static MyDatabase getDatabase()
    {
        if(_databaseInstance == null){
            _databaseInstance = new MyDatabase();
            return _databaseInstance;
        }
        else
        {
            return _databaseInstance;
        }
    }

    @Override
    public int write(String inputString)
    {
        _data.put(++_count, inputString);
        return _count;
    }
}
