package ru.netology.attachments

data class Sizes(
    val url: String, // URL копии изображения.
    val width: Int, // Ширина копии в пикселах.
    val height: Int, // Высота копии в пикселах.
    val type: String // Обозначение размера и пропорций копии.
) {
    override fun toString(): String {
        return ("Url = $url" + "\n" +
                "width = $width" + "\n" +
                "height = $height" + "\n" +
                "type = $type" + "\n"
                )
    }
}