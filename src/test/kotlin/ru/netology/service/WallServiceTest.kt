package ru.netology.service

import org.junit.Assert.*
import org.junit.Test
import ru.netology.data.*
import ru.netology.service.WallService.add
import ru.netology.service.WallService.posts
import ru.netology.service.WallService.update

class WallServiceTest {

    @Test
    fun `add$VkPost`() {
        val typeOfPost = TypeOfPost.POST
        val post1 = Post(
            id = 1U,
            ownerId = 1,
            fromId = 2,
            createdBy = 0,
            date = System.currentTimeMillis(),
            text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = Comment(1, true, true, true, true),
            copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            likes = Like(1000, true, true, true),
            repost = Repost(100_000_000, true),
            views = View(1_000_000_000),
            postType = typeOfPost,
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
        posts.withIndex()
        val result = posts[0].id
        assertEquals(1U, result)
    }

    @Test
    fun `update$VkPost`() {
        val typeOfPost = TypeOfPost.POST
        val post1 = Post(
            id = 1U,
            ownerId = 1,
            fromId = 2,
            createdBy = 0,
            date = System.currentTimeMillis(),
            text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = Comment(1, true, true, true, true),
            copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            likes = Like(1000, true, true, true),
            repost = Repost(100_000_000, true),
            views = View(1_000_000_000),
            postType = typeOfPost,
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
            id = 1U,
            1,
            2,
            0,
            System.currentTimeMillis(),
            "This is my SECOND post. I hope, I can do it better than I think. And so on, bla bla bla.",
            0,
            0,
            true,
            Comment(1, true, true, true, true),
            Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            Like(1000, true, true, true),
            Repost(100_000_000, true),
            View(1_000_000_000),
            typeOfPost,
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
        val result = update(post2)
        assertTrue(result)
    }

    @Test
    fun `updateFalse$VkPost`() {
        val typeOfPost = TypeOfPost.POST
        val post1 = Post(
            id = 1U,
            ownerId = 1,
            fromId = 2,
            createdBy = 0,
            date = System.currentTimeMillis(),
            text = "This is my FIRST post. I hope, I can do it better than I think. And so on, bla bla bla.",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = Comment(1, true, true, true, true),
            copyright = Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            likes = Like(1000, true, true, true),
            repost = Repost(100_000_000, true),
            views = View(1_000_000_000),
            postType = typeOfPost,
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
            id = 2U,
            1,
            2,
            0,
            System.currentTimeMillis(),
            "This is my SECOND post. I hope, I can do it better than I think. And so on, bla bla bla.",
            0,
            0,
            true,
            Comment(1, true, true, true, true),
            Copyright(1, "https://copyrightcopy.com", "Copyright", "typeOfCopy"),
            Like(1000, true, true, true),
            Repost(100_000_000, true),
            View(1_000_000_000),
            typeOfPost,
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
        val result = update(post2)
        assertFalse(result)
    }
}