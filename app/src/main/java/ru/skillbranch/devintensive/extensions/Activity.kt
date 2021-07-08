package ru.skillbranch.devintensive.extensions

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

//Реализуй extension Activity.hideKeyboard(), скрывающую экранную клавиатуру

fun Activity.hideKeyboard() {
    hideKeyboard(currentFocus ?: View(this))
}

fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}


//Реализуй extension для проверки, открыта или нет Software Keyboard
// с применением метода rootView.getWindowVisibleDisplayFrame(Rect())