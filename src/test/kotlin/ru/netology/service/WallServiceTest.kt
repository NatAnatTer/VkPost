package ru.netology.service

import org.junit.Assert.*
import org.junit.Test
import ru.netology.attachments.*
import ru.netology.data.*
import ru.netology.service.WallService.add
import ru.netology.service.WallService.addAttachment
import ru.netology.service.WallService.addCopyHistory
import ru.netology.service.WallService.update

class WallServiceTest {

    @Test
    fun addVkPost() {
        val typeOfPost = TypeOfPost.POST
        val post1 = Post(
            ownerId = 1,
            fromId = 2,
            createdBy = 0,
            date = System.currentTimeMillis(),
            text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = CommentProperty(1, true, true, true, true),
            copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            likes = Like(1000, true, true, true),
            repost = Repost(100_000_000, true),
            views = View(1_000_000_000),
            postType = typeOfPost,
            postSource = Source("vk", "android", "profile_activity", "https://source1234source"),
            geo = null,
            copyHistory = null,
            attachments = null,
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            postponedId = 1232
        )
        add(post1)
        val result = post1.getId()
        assertNotEquals(0U, result)

    }

    @Test
    fun updateTrueVkPost() {
        val typeOfPost = TypeOfPost.POST

        val post1 = Post(
            ownerId = 1,
            fromId = 2,
            createdBy = 0,
            date = System.currentTimeMillis(),
            text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = CommentProperty(1, true, true, true, true),
            copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            likes = Like(1000, true, true, true),
            repost = Repost(100_000_000, true),
            views = View(1_000_000_000),
            postType = typeOfPost,
            postSource = Source("vk", "android", "profile_activity", "https://source1234source"),
            geo = null,
            copyHistory = null,
            attachments = null,
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            postponedId = 1232
        )
        val post2 = Post(
            1,
            2,
            0,
            System.currentTimeMillis(),
            "This is my SECOND post. I hope, I can do it better than I think. And so on, bla bla bla.",
            0,
            0,
            true,
            CommentProperty(1, true, true, true, true),
            Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            Like(1000, true, true, true),
            Repost(100_000_000, true),
            View(1_000_000_000),
            typeOfPost,
            Source("vk", "android", "profile_activity", "https://source1234source"),
            null,
            null,
            null,
            0,
            true,
            true,
            true,
            false,
            false,
            true,
            Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            1232
        )
        add(post1)


        val result = update(post1, post2)
        assertTrue(result)
    }

    @Test
    fun updateFalseVkPost() {
        val typeOfPost = TypeOfPost.POST
        val post1 = Post(
            ownerId = 1,
            fromId = 2,
            createdBy = 0,
            date = System.currentTimeMillis(),
            text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = CommentProperty(1, true, true, true, true),
            copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            likes = Like(1000, true, true, true),
            repost = Repost(100_000_000, true),
            views = View(1_000_000_000),
            postType = typeOfPost,
            postSource = Source("vk", "android", "profile_activity", "https://source1234source"),
            geo = null,
            copyHistory = null,
            attachments = null,
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            postponedId = 1232
        )
        val post2 = Post(
            1,
            2,
            0,
            System.currentTimeMillis(),
            "This is my SECOND post. I hope, I can do it better than I think. And so on, bla bla bla.",
            0,
            0,
            true,
            CommentProperty(1, true, true, true, true),
            Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            Like(1000, true, true, true),
            Repost(100_000_000, true),
            View(1_000_000_000),
            typeOfPost,
            Source("vk", "android", "profile_activity", "https://source1234source"),
            null,
            null,
            null,
            0,
            true,
            true,
            true,
            false,
            false,
            true,
            Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            1232
        )
        add(post1)


        val result = update(post2, post1)
        assertFalse(result)
    }

    @Test
    fun addCopyHistoryTest() {
        val typeOfPost = TypeOfPost.POST
        val post1 = Post(
            ownerId = 1,
            fromId = 2,
            createdBy = 0,
            date = System.currentTimeMillis(),
            text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = CommentProperty(1, true, true, true, true),
            copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            likes = Like(1000, true, true, true),
            repost = Repost(100_000_000, true),
            views = View(1_000_000_000),
            postType = typeOfPost,
            postSource = Source("vk", "android", "profile_activity", "https://source1234source"),
            geo = null,
            copyHistory = null,
            attachments = null,
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            postponedId = 1232
        )
        val post2 = Post(
            1,
            2,
            0,
            System.currentTimeMillis(),
            "This is my SECOND post. I hope, I can do it better than I think. And so on, bla bla bla.",
            0,
            0,
            true,
            CommentProperty(1, true, true, true, true),
            Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            Like(1000, true, true, true),
            Repost(100_000_000, true),
            View(1_000_000_000),
            typeOfPost,
            Source("vk", "android", "profile_activity", "https://source1234source"),
            null,
            null,
            null,
            0,
            true,
            true,
            true,
            false,
            false,
            true,
            Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            1232
        )
        val post3 = Post(
            1,
            2,
            0,
            System.currentTimeMillis(),
            "This is my ТРЕТИЙ post. I hope, I can do it better than I think. And so on, bla bla bla.",
            0,
            0,
            true,
            CommentProperty(1, true, true, true, true),
            Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            Like(1000, true, true, true),
            Repost(100_000_000, true),
            View(1_000_000_000),
            typeOfPost,
            Source("vk", "android", "profile_activity", "https://source1234source"),
            null,
            null,
            null,
            0,
            true,
            true,
            true,
            false,
            false,
            true,
            Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            1232
        )

        val copyHistory = arrayOf(post2, post3)
        addCopyHistory(post1, copyHistory)
        val result = post1.copyHistory
        assertArrayEquals(copyHistory, result)
    }

    @Test
    fun addCopyHistoryTestAddNewHistory() {
        val typeOfPost = TypeOfPost.POST
        val post1 = Post(
            ownerId = 1,
            fromId = 2,
            createdBy = 0,
            date = System.currentTimeMillis(),
            text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = CommentProperty(1, true, true, true, true),
            copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            likes = Like(1000, true, true, true),
            repost = Repost(100_000_000, true),
            views = View(1_000_000_000),
            postType = typeOfPost,
            postSource = Source("vk", "android", "profile_activity", "https://source1234source"),
            geo = null,
            copyHistory = null,
            attachments = null,
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            postponedId = 1232
        )
        val post2 = Post(
            1,
            2,
            0,
            System.currentTimeMillis(),
            "This is my SECOND post. I hope, I can do it better than I think. And so on, bla bla bla.",
            0,
            0,
            true,
            CommentProperty(1, true, true, true, true),
            Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            Like(1000, true, true, true),
            Repost(100_000_000, true),
            View(1_000_000_000),
            typeOfPost,
            Source("vk", "android", "profile_activity", "https://source1234source"),
            null,
            null,
            null,
            0,
            true,
            true,
            true,
            false,
            false,
            true,
            Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            1232
        )

        val copyHistory = arrayOf(post1)

        val post3 = Post(
            1,
            2,
            0,
            System.currentTimeMillis(),
            "This is my ТРЕТИЙ post. I hope, I can do it better than I think. And so on, bla bla bla.",
            0,
            0,
            true,
            CommentProperty(1, true, true, true, true),
            Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            Like(1000, true, true, true),
            Repost(100_000_000, true),
            View(1_000_000_000),
            typeOfPost,
            Source("vk", "android", "profile_activity", "https://source1234source"),
            null,
            copyHistory,
            null,
            0,
            true,
            true,
            true,
            false,
            false,
            true,
            Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            1232
        )


        val copyHistoryAdd = arrayOf(post2)
        val copyHistoryResult = copyHistory + copyHistoryAdd
        addCopyHistory(post3, copyHistoryAdd)
        val result = post3.copyHistory
        assertArrayEquals(copyHistoryResult, result)
    }

    @Test
    fun addAttachmentTest() {
        val typeOfPost = TypeOfPost.POST
        val attachment: Array<Attachments> = arrayOf(
            PhotoAttachment(
                1,
                1,
                5,
                10,
                "Myfirst symphony",
                123213,
                arrayOf(Sizes("http://my_album", 123, 234, "photo")),
                123,
                234
            ),
            AudioAttachment(
                1,
                3,
                "First artist",
                "First song",
                14678,
                "http://first_song",
                null,
                null,
                30,
                2343424,
                true,
                true
            ),
            FileAttachment(
                1,
                2,
                "Title 1 file",
                256,
                "pdf",
                "http://file_store.ru",
                72634628,
                1,
                PhotoSize(arrayOf(Sizes("https://rhoto_preview", 123, 243, "some type")))
            ),
            LinkAttachment(
                "http://link_first_link",
                "this link is link",
                null,
                "description this link",
                null,
                LinkAttachment.Product(LinkAttachment.Price(10, LinkAttachment.Currency(1232, "Ru"), "something")),
                LinkAttachment.Button("thisButton", LinkAttachment.Actions("radio_button")),
                "owner_id_page_id",
                "http://preview.ru"
            ),
            NoteAttachment(
                45,
                32,
                "thisNote",
                "there is text of note",
                2342342,
                5,
                2,
                "http://firstNote.ru",
                "property of privacy",
                true,
                "#linkOn WiKi"
            )
        )

        val post1 = Post(
            ownerId = 1,
            fromId = 2,
            createdBy = 0,
            date = System.currentTimeMillis(),
            text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = CommentProperty(1, true, true, true, true),
            copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            likes = Like(1000, true, true, true),
            repost = Repost(100_000_000, true),
            views = View(1_000_000_000),
            postType = typeOfPost,
            postSource = Source("vk", "android", "profile_activity", "https://source1234source"),
            geo = null,
            copyHistory = null,
            attachments = null,
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            postponedId = 1232
        )
        addAttachment(attachment, post1)
        val result = post1.attachments

        assertArrayEquals(attachment, result)
    }

    @Test
    fun addAttachmentTestAddToPost() {
        val typeOfPost = TypeOfPost.POST
        val attachmentNew: Array<Attachments> = arrayOf(
            PhotoAttachment(
                1,
                1,
                5,
                10,
                "MySecond symphony",
                123213,
                arrayOf(Sizes("http://my_album", 123, 234, "photo")),
                123,
                234
        ))
        val attachment: Array<Attachments> = arrayOf(
            PhotoAttachment(
                1,
                1,
                5,
                10,
                "Myfirst symphony",
                123213,
                arrayOf(Sizes("http://my_album", 123, 234, "photo")),
                123,
                234
            ),
            AudioAttachment(
                1,
                3,
                "First artist",
                "First song",
                14678,
                "http://first_song",
                null,
                null,
                30,
                2343424,
                true,
                true
            ),
            FileAttachment(
                1,
                2,
                "Title 1 file",
                256,
                "pdf",
                "http://file_store.ru",
                72634628,
                1,
                PhotoSize(arrayOf(Sizes("https://rhoto_preview", 123, 243, "some type")))
            ),
            LinkAttachment(
                "http://link_first_link",
                "this link is link",
                null,
                "description this link",
                null,
                LinkAttachment.Product(LinkAttachment.Price(10, LinkAttachment.Currency(1232, "Ru"), "something")),
                LinkAttachment.Button("thisButton", LinkAttachment.Actions("radio_button")),
                "owner_id_page_id",
                "http://preview.ru"
            ),
            NoteAttachment(
                45,
                32,
                "thisNote",
                "there is text of note",
                2342342,
                5,
                2,
                "http://firstNote.ru",
                "property of privacy",
                true,
                "#linkOn WiKi"
            )
        )

        val post1 = Post(
            ownerId = 1,
            fromId = 2,
            createdBy = 0,
            date = System.currentTimeMillis(),
            text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = CommentProperty(1, true, true, true, true),
            copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            likes = Like(1000, true, true, true),
            repost = Repost(100_000_000, true),
            views = View(1_000_000_000),
            postType = typeOfPost,
            postSource = Source("vk", "android", "profile_activity", "https://source1234source"),
            geo = null,
            copyHistory = null,
            attachments = attachment,
            signerId = 0,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            donut = Donut(true, 48, PlaseHolder("Buy premium"), false, "duration"),
            postponedId = 1232
        )
        addAttachment(attachmentNew, post1)
        val attachmentResult: Array<Attachments> =attachment + attachmentNew
        val result = post1.attachments
        assertArrayEquals(attachmentResult, result)
    }
}