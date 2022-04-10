package ru.netology.attachments
//Объект, описывающий заметку

data class NoteAttachment(
    override val typeOfAttachments: String = "Note",
    val note: Note
) : Attachments {

}
