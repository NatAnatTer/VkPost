package ru.netology.attachments

interface Preview {
}

class PhotoSize(
    val sizes: Array<Sizes> //(array) — массив копий изображения в разных размерах.
) : Preview // изображения для предпросмотра.

class Graffiti(
    val src: String, // URL файла с граффити;
    val width: Int, // ширина изображения в px;
    val height: Int, // высота изображения в px.
) : Preview

class audioMessage(
    val duration: Int, // длительность аудиосообщения в секундах;
    val waveform: Array<Int>, // массив значений (integer) для визуального отображения звука;
    val linkOgg: String, // URL .ogg-файла;
    val linkMp3: String, // URL .mp3-файла.
) : Preview //данные об аудиосообщении

