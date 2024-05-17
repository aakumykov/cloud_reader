package com.github.aakumykov.cloud_reader.di

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

@Module
class YandexCloudReaderModule {

    @Provides
    fun provideGson(): Gson = Gson()

    @Provides
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient()
}