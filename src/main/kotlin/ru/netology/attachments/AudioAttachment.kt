package ru.netology.attachments

data class AudioAttachment(
    override val typeOfAttachments: String = "Audio",
    val audio: Audio
) : Attachments

