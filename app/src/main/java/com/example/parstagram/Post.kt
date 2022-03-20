package com.example.parstagram

import com.parse.ParseObject
import com.parse.ParseClassName
import com.parse.ParseFile
import com.parse.ParseUser


@ParseClassName("Post")
class Post : ParseObject() {
    fun getDescription(): String? {
        return getString(KEY_DESCRIPTION) //built-in function in parse
    }

    fun setDescription(description: String) {
        put(KEY_DESCRIPTION, description) //built-in function in parse
    }

    fun getImage(): ParseFile? {
        return getParseFile(KEY_IMAGE)
    }

    fun setImage(image: ParseFile) {
       put(KEY_IMAGE, image)
    }

    fun getUser(): ParseUser? {
        return getParseUser(KEY_USER)
    }

    fun setUser(user: ParseUser) {
        put(KEY_USER, user)
    }

    companion object {
        // exact name of key generated in the table at Back4App
        const val KEY_DESCRIPTION = "description"
        const val KEY_IMAGE = "image"
        const val KEY_USER = "user"
    }
}