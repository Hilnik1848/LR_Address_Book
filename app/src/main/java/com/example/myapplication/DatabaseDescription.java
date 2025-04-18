package com.example.myapplication;

import android.net.Uri;
import android.provider.BaseColumns;

public final class DatabaseDescription {
    public static final String AUTHORITY = "com.example.addressbook.data";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);

    public static final class Contact implements BaseColumns {
        public static final String TABLE_NAME = "contacts";
        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(TABLE_NAME).build();

        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_PHONE = "phone";
        public static final String COLUMN_EMAIL = "email";
        public static final String COLUMN_STREET = "street";
        public static final String COLUMN_CITY = "city";
        public static final String COLUMN_STATE = "state";
        public static final String COLUMN_ZIP = "zip";

        public static Uri buildContactUri(long id) {
            return Uri.withAppendedPath(CONTENT_URI, String.valueOf(id));
        }
    }
}

