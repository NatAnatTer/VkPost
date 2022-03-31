package ru.netology.service

import ru.netology.attachments.Attachments
import ru.netology.data.Comment
import ru.netology.data.Post


internal object WallService {
    private var posts = emptyArray<Post>()

    private var comments = emptyArray<Comment>()

    fun createComment(comment: Comment) {
        for (post in posts) {
            if (comment.postId == post.getId()) {
                comments += comment
                return
            }
        };throw PostNotFoundException("post not found with id = ${comment.postId}")

    }


    private var uId = emptyArray<UInt>()

    internal fun add(post: Post): Post {
        posts += post
        return posts.last()
    }

    internal fun printPost() {
        for (post in posts) {
            println("----------------------------------------")
            println("ID POST: ${post.getId()}")
            println(post)
        }
    }

    fun setId(): UInt {
        var maxRate: UInt? = uId.maxOrNull()

        if (maxRate == null) {
            maxRate = 1U
        } else {
            maxRate += 1U
        }
        uId += maxRate

        return maxRate.toUInt()


    }


    internal fun update(updatingPost: Post, newPost: Post): Boolean {
        for ((index, changeablePost) in posts.withIndex()) {
            if (changeablePost.getId() == updatingPost.getId()) {
                posts[index] = posts[index].copy(
                    fromId = newPost.fromId,
                    createdBy = newPost.createdBy,
                    text = newPost.text,
                    replyOwnerId = newPost.replyOwnerId,
                    replyPostId = newPost.replyPostId,
                    friendsOnly = newPost.friendsOnly,
                    comments = newPost.comments,
                    copyright = newPost.copyright,
                    likes = newPost.likes,
                    repost = newPost.repost,
                    views = newPost.views,
                    postType = newPost.postType,
                    canPin = newPost.canPin,
                    canDelete = newPost.canDelete,
                    canEdit = newPost.canEdit,
                    isPinned = newPost.isPinned,
                    markedAsAds = newPost.markedAsAds,
                    isFavorite = newPost.isFavorite,
                    donut = newPost.donut,
                    postponedId = newPost.postponedId,
                    geo = newPost.geo
                )
                println("true")
                return true
            }
        }

        println("false")
        return false
    }

    internal fun addCopyHistory(repost: Post, post: Array<Post>): Array<Post>? {
        repost.copyHistory = repost.copyHistory?.plus(post) ?: post
        return repost.copyHistory
    }

    internal fun addAttachment(attachment: Array<Attachments>, post: Post): Array<Attachments>? {
        post.attachments = post.attachments?.plus(attachment) ?: attachment
        return post.attachments
    }

}



