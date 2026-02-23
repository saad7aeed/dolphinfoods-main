package com.example.dolphin.utils;

import android.content.Context
import android.content.SharedPreferences


class SessionManager(
    // Context
    var _context: Context,
) {
    var pref: SharedPreferences

    // Editor for Shared preferences
    var editor: SharedPreferences.Editor

    // Shared pref mode
    var PRIVATE_MODE = 0

    companion object {
        // Shared pref file name
        private const val PREF_NAME = "SPF_PREF"


    }

    // Constructor
    init {
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
        editor = pref.edit()
        editor.apply()
    }
}