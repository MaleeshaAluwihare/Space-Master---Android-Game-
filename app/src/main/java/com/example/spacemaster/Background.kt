package com.example.spacemaster

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory

//adding background to screen
class Background(screenX: Int, screenY: Int, res: Resources) {
    var x: Int = 0
    var y: Int = 0
    var background: Bitmap

    //constructor
    init {
        background = BitmapFactory.decodeResource(res, R.drawable.spaces_bg)
        background = Bitmap.createScaledBitmap(background, screenX, screenY, false) //resize the BG to fit in whole screen
    }
}
