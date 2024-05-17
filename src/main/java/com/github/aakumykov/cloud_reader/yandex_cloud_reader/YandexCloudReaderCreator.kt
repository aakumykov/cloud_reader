package com.github.aakumykov.cloud_reader.yandex_cloud_reader

import javax.inject.Inject

class YandexCloudReaderCreator @Inject constructor(
    private val yandexCloudReaderFactory: YandexCloudReaderFactory
){
    fun createYandexCloudReader(authToken: String): YandexCloudReader {
        return yandexCloudReaderFactory.create(authToken)
    }
}