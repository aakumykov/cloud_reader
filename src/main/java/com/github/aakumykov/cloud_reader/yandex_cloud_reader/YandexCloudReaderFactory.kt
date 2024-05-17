package com.github.aakumykov.cloud_reader.yandex_cloud_reader

import dagger.assisted.AssistedFactory

@AssistedFactory
interface YandexCloudReaderFactory {
    fun create(authToken: String): YandexCloudReader
}