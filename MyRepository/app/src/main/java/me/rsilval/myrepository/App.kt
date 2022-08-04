package me.rsilval.myrepository

import android.app.Application
import me.rsilval.myrepository.data.di.DataModule
import me.rsilval.myrepository.domain.di.DomainModule
import me.rsilval.myrepository.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}