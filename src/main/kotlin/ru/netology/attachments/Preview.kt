package ru.netology.attachments

interface Preview {
}

data class PhotoSize(
    val sizes: Array<Sizes> //(array) — массив копий изображения в разных размерах.
) : Preview { // изображения для предпросмотра.

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PhotoSize

        if (!sizes.contentEquals(other.sizes)) return false

        return true
    }

    override fun hashCode(): Int {
        return sizes.contentHashCode()
    }
}

data class Graffiti(
    val src: String, // URL файла с граффити;
    val width: Int, // ширина изображения в px;
    val height: Int, // высота изображения в px.
) : Preview

data class audioMessage(
    val duration: Int, // длительность аудиосообщения в секундах;
    val waveform: Array<Int>, // массив значений (integer) для визуального отображения звука;
    val linkOgg: String, // URL .ogg-файла;
    val linkMp3: String, // URL .mp3-файла.
) : Preview { //данные об аудиосообщении
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as audioMessage

        if (duration != other.duration) return false
        if (!waveform.contentEquals(other.waveform)) return false
        if (linkOgg != other.linkOgg) return false
        if (linkMp3 != other.linkMp3) return false

        return true
    }

    override fun hashCode(): Int {
        var result = duration
        result = 31 * result + waveform.contentHashCode()
        result = 31 * result + linkOgg.hashCode()
        result = 31 * result + linkMp3.hashCode()
        return result
    }
}

