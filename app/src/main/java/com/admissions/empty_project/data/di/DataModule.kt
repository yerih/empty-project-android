package com.admissions.empty_project.data.di

import com.admissions.data.repository.AnyRepository
import com.admissions.data.source.AnyRemoteDataSource
import com.admissions.empty_project.data.database.db.RoomDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun anyRepositoryProvider(anyRemoteDataSource: AnyRemoteDataSource, localDataSource: RoomDataBase) = AnyRepository(anyRemoteDataSource,localDataSource)

}