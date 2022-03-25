package ru.netology.service

import ru.netology.data.Post

internal object WallService {
    private var posts = emptyArray<Post>()

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
        var maxRate = uId.maxOrNull()

        if (maxRate == null) {
            maxRate = 1U
        } else {
            maxRate += 1U
        }
        uId += maxRate
        return maxRate
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
                    copyHistory = addCopyHistory(newPost),
                    canPin = newPost.canPin,
                    canDelete = newPost.canDelete,
                    canEdit = newPost.canEdit,
                    isPinned = newPost.isPinned,
                    markedAsAds = newPost.markedAsAds,
                    isFavorite = newPost.isFavorite,
                    donut = newPost.donut,
                    postponedId = newPost.postponedId

                )

                return true
            }
        }

        println("false")
        return false
    }

   private fun addCopyHistory(post: Post): Array<Post>? {
        post.copyHistory = post.copyHistory?.plus(post)
       return post.copyHistory
    }




}




