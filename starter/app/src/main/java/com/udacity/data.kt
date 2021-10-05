package com.udacity

import androidx.annotation.IntegerRes
import androidx.annotation.StringRes


enum class Repo(
    @IntegerRes val id: Int,
    @StringRes val link: Int,
    @StringRes val title: Int,
) {
    Glide(
        id = R.id.glide,
        link = R.string.link_glide,
        title = R.string.glide
    ),
    Retrofit(
        id = R.id.retrofit,
        link = R.string.link_retrofit,
        title = R.string.retrofit
    ),
    LoadingApp(
        id = R.id.loading_app,
        link = R.string.link_loading_app,
        title = R.string.loading_app
    )

}