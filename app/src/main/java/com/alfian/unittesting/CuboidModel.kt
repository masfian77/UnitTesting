package com.alfian.unittesting

class CuboidModel {

    private var length: Double = 0.0
    private var width: Double = 0.0
    private var height: Double = 0.0

    fun getVolume(): Double = length * width * height

    fun getSurfaceArea(): Double {
        val wl = width * length
        val wh = width * height
        val lh = length * height

        return 2 * (wl + wh + lh)
    }

    fun getCircumference(): Double = 4 * (length * width * height)

    fun save(length: Double, width: Double, height: Double) {
        this.length = length
        this.width = width
        this.height = height
    }
}