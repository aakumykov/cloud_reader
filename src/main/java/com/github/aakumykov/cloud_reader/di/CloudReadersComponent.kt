package com.github.aakumykov.cloud_reader.di

import com.github.aakumykov.cloud_reader.local_cloud_reader.LocalCloudReader
import com.github.aakumykov.cloud_reader.yandex_cloud_reader.YandexCloudReader
import com.github.aakumykov.cloud_reader.yandex_cloud_reader.YandexCloudReaderCreator
import dagger.Component

@Component(
    modules = [
        YandexCloudReaderModule::class,
        LocalCloudReaderModule::class,
    ]
)
abstract class CloudReadersComponent {

    abstract fun getLocalCloudReader(): LocalCloudReader

    fun getYandexCloudReader(authToken: String): YandexCloudReader {
        return getYandexCloudReaderCreator().createYandexCloudReader(authToken)
    }

    /**
     * Нужен только для метода [getYandexCloudReader].
     */
    protected abstract fun getYandexCloudReaderCreator(): YandexCloudReaderCreator
}