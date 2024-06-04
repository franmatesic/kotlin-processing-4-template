package hr.franmatesic

import processing.core.PApplet
import processing.core.PConstants
import processing.core.PImage

class App : PApplet() {

    private lateinit var logo: PImage

    override fun settings() {
        size(1280, 720)
    }

    override fun setup() {
        logo = loadImage("processing-logo.png")

        textAlign(PConstants.CENTER, PConstants.CENTER)
    }

    override fun draw() {
        background(255)

        image(logo, width * 0.5F - 128, 32F, 256F, 256F)

        fill(0)
        textSize(64F)
        text("Intellij Processing 4 template", width * 0.5F, height * 0.5F)
    }
}