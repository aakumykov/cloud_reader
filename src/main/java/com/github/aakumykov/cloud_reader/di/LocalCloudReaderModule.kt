package com.github.aakumykov.cloud_reader.di

import com.github.aakumykov.cloud_reader.local_cloud_reader.LocalCloudReader
import dagger.Module
import dagger.Provides

@Module
class LocalCloudReaderModule {

    @Provides
    fun provideLocalCloudReader(): LocalCloudReader = LocalCloudReader()
}